package com.fanyetu.core.proxy.server;

import com.fanyetu.core.auth.custom.CustomUserDetails;
import com.fanyetu.core.auth.entity.User;
import com.fanyetu.core.auth.util.SecurityContextUtil;
import com.fanyetu.core.kibana.properties.KibanaProperties;
import com.fanyetu.core.kibana.report.entity.Report;
import com.fanyetu.core.kibana.report.service.ReportManagementService;
import com.fanyetu.core.proxy.properties.ProxyProperties;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.http.HttpObject;
import io.netty.handler.codec.http.HttpRequest;
import io.netty.handler.codec.http.HttpResponse;
import lombok.extern.slf4j.Slf4j;
import org.littleshoot.proxy.HttpFilters;
import org.littleshoot.proxy.HttpFiltersAdapter;
import org.littleshoot.proxy.HttpFiltersSourceAdapter;
import org.littleshoot.proxy.impl.DefaultHttpProxyServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.net.InetSocketAddress;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * LittleProxy 反向代理支持
 * https://github.com/adamfisk/LittleProxy/issues/308
 *
 * @author zhanghaonan
 * @date 2018/12/4
 */
@Component
@Slf4j
public class ProxyServer implements ApplicationRunner {

    @Autowired
    private ProxyProperties proxyProperties;

    @Autowired
    private KibanaProperties kibanaProperties;

    @Autowired
    private ReportManagementService reportManagementService;

    /**
     * 启动proxy反向代理服务器
     *
     * @param args
     * @throws Exception
     */
    @Override
    public void run(ApplicationArguments args) throws Exception {
        InetSocketAddress address = new InetSocketAddress(proxyProperties.getHost(),
                proxyProperties.getPort());

        DefaultHttpProxyServer.bootstrap()
                .withAllowRequestToOriginServer(true)
                .withAddress(address)
                .withFiltersSource(new HttpFiltersSourceAdapter() {
                    @Override
                    public HttpFilters filterRequest(HttpRequest originalRequest, ChannelHandlerContext ctx) {
                        return new HttpFiltersAdapter(originalRequest) {
                            @Override
                            public HttpResponse clientToProxyRequest(HttpObject httpObject) {
                                if (httpObject instanceof HttpRequest) {
                                    HttpRequest httpRequest = (HttpRequest) httpObject;

                                    String uri = httpRequest.uri();
                                    // TODO
//                                    // 判断当前用户是否有权限访问kibana
//                                    if (!canVisitKibana(uri)) {
//                                        DefaultFullHttpResponse response =
//                                                new DefaultFullHttpResponse(HttpVersion.HTTP_1_1,
//                                                        HttpResponseStatus.UNAUTHORIZED);
//                                        return response;
//                                    }

                                    httpRequest.headers().remove("Host");
                                    httpRequest.headers().add("Host", kibanaProperties.getHost() + ":"
                                            + kibanaProperties.getPort());
                                }
                                return null;
                            }

                            @Override
                            public HttpObject proxyToClientResponse(HttpObject httpObject) {
                                System.out.println("hahahah");
                                return super.proxyToClientResponse(httpObject);
                            }
                        };
                    }
                })
                .start();
    }

    private boolean canVisitKibana(String uri) {
        // TODO 这样获取不到当前用户，因为不是在springSecurity管理的线程，没有经过springSecurity的过滤器
        Optional<CustomUserDetails> currentUserDetails = SecurityContextUtil.getCurrentUserDetails();
        if (currentUserDetails.isPresent()) {
            CustomUserDetails customUserDetails = currentUserDetails.get();
            if (customUserDetails.isAdmin()) {
                return true;
            }

            User user = customUserDetails.getUser();
            List<Report> reports = reportManagementService.queryReportsByRoles(user.getRoles());

            AtomicBoolean flag = new AtomicBoolean(false);
            reports.forEach((item) -> {
                if (uri.equals(item.getUrl())) {
                    flag.set(true);
                }
            });

            return flag.get();
        }
        return false;
    }

    /*public static void main(String[] args) {
        int port = 9090;
        DefaultHttpProxyServer.bootstrap()
                .withAllowRequestToOriginServer(true)
                .withPort(port)
                .withFiltersSource(new HttpFiltersSourceAdapter(){
                    @Override
                    public HttpFilters filterRequest(HttpRequest originalRequest, ChannelHandlerContext ctx) {
                        return new HttpFiltersAdapter(originalRequest){
                            @Override
                            public HttpResponse clientToProxyRequest(HttpObject httpObject) {
                                System.out.println("===============>clientToProxyRequest");
                                if(httpObject instanceof HttpRequest) {
                                    HttpRequest httpRequest = (HttpRequest)httpObject;
                                    httpRequest.headers().remove("Host");
                                    httpRequest.headers().add("Host", "35.10.28.126:8005");
                                }
                                return null;
                            }

                            @Override
                            public HttpResponse proxyToServerRequest(HttpObject httpObject) {
                                System.out.println("===============>proxyToServerRequest");
                                return super.proxyToServerRequest(httpObject);
                            }

                            @Override
                            public void proxyToServerRequestSending() {
                                System.out.println("===============>proxyToServerRequestSending");
                                super.proxyToServerRequestSending();
                            }

                            @Override
                            public void proxyToServerRequestSent() {
                                System.out.println("===============>proxyToServerRequestSent");
                                super.proxyToServerRequestSent();
                            }

                            @Override
                            public HttpObject serverToProxyResponse(HttpObject httpObject) {
                                System.out.println("===============>serverToProxyResponse");
                                return super.serverToProxyResponse(httpObject);
                            }

                            @Override
                            public void serverToProxyResponseTimedOut() {
                                System.out.println("===============>serverToProxyResponseTimedOut");
                                super.serverToProxyResponseTimedOut();
                            }

                            @Override
                            public void serverToProxyResponseReceiving() {
                                System.out.println("===============>serverToProxyResponseReceiving");
                                super.serverToProxyResponseReceiving();
                            }

                            @Override
                            public void serverToProxyResponseReceived() {
                                System.out.println("===============>serverToProxyResponseReceived");
                                super.serverToProxyResponseReceived();
                            }

                            @Override
                            public HttpObject proxyToClientResponse(HttpObject httpObject) {
                                System.out.println("===============>proxyToClientResponse");
                                return super.proxyToClientResponse(httpObject);
                            }

                            @Override
                            public void proxyToServerConnectionQueued() {
                                System.out.println("===============>proxyToServerConnectionQueued");
                                super.proxyToServerConnectionQueued();
                            }

                            @Override
                            public InetSocketAddress proxyToServerResolutionStarted(String resolvingServerHostAndPort) {
                                System.out.println("===============>proxyToServerResolutionStarted");
                                return super.proxyToServerResolutionStarted(resolvingServerHostAndPort);
                            }

                            @Override
                            public void proxyToServerResolutionFailed(String hostAndPort) {
                                System.out.println("===============>proxyToServerResolutionFailed");
                                super.proxyToServerResolutionFailed(hostAndPort);
                            }

                            @Override
                            public void proxyToServerResolutionSucceeded(String serverHostAndPort, InetSocketAddress
                            resolvedRemoteAddress) {
                                System.out.println("===============>proxyToServerResolutionSucceeded");
                                super.proxyToServerResolutionSucceeded(serverHostAndPort, resolvedRemoteAddress);
                            }

                            @Override
                            public void proxyToServerConnectionStarted() {
                                System.out.println("===============>proxyToServerConnectionStarted");
                                super.proxyToServerConnectionStarted();
                            }

                            @Override
                            public void proxyToServerConnectionSSLHandshakeStarted() {
                                System.out.println("===============>proxyToServerConnectionSSLHandshakeStarted");
                                super.proxyToServerConnectionSSLHandshakeStarted();
                            }

                            @Override
                            public void proxyToServerConnectionFailed() {
                                System.out.println("===============>proxyToServerConnectionFailed");
                                super.proxyToServerConnectionFailed();
                            }

                            @Override
                            public void proxyToServerConnectionSucceeded(ChannelHandlerContext serverCtx) {
                                System.out.println("===============>proxyToServerConnectionSucceeded");
                                super.proxyToServerConnectionSucceeded(serverCtx);
                            }
                        };
                    }
                })
                .start();
    }*/
}
