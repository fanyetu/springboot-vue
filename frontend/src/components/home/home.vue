<template>
    <el-container class="home-container">
        <el-header class="home-title">
            <div class="app-title"></div>
            <div class="options">
                <a @click="logout">退出</a>
            </div>
        </el-header>
        <el-container>
            <el-aside class="home-menu" width="200px">
                <!--TODO 暂时只支持两层菜单，使用render可以构建递归菜单-->
                <el-menu unique-opened router>
                    <template v-for="(item, index) in menus">
                        <el-menu-item v-if="item.path !== '/'"
                                      :index="item.path"
                                      :key="index">
                            <i :class="item.iconCls || 'el-icon-document'"></i>
                            <span>{{item.name}}</span>
                        </el-menu-item>
                        <el-submenu v-else :index="index + ''"
                                    :key="index">
                            <template slot="title">
                                <i :class="item.iconCls || 'el-icon-menu'"></i>
                                <span>{{item.name}}</span>
                            </template>
                            <el-menu-item v-for="child in item.children"
                                          :index="child.path"
                                          :key="child.path">
                                <i :class="child.iconCls || 'el-icon-document'"></i>
                                <span>{{child.name}}</span>
                            </el-menu-item>
                        </el-submenu>
                    </template>
                </el-menu>
            </el-aside>
            <el-container>
                <el-main class="home-main">
                    <el-breadcrumb separator-class="el-icon-arrow-right">
                        <el-breadcrumb-item :to="{ path: '/home' }">首页</el-breadcrumb-item>
                        <el-breadcrumb-item v-text="$router.currentRoute.name"></el-breadcrumb-item>
                    </el-breadcrumb>
                    <div class="page-wrapper">
                        <keep-alive>
                            <router-view v-if="this.$route.meta.keepAlive"></router-view>
                        </keep-alive>
                        <router-view v-if="!this.$route.meta.keepAlive"></router-view>

                        <div class="home-content" v-if="$route.path === '/home'">
                            欢迎使用ELK-MANAGER
                        </div>
                    </div>
                </el-main>
                <el-footer class="home-footer" height="30px">copyright fanyetu 2018</el-footer>
            </el-container>
        </el-container>
    </el-container>
</template>
<script>
    import http from '@/common/http'
    import {mapActions, mapGetters} from 'vuex'
    import store from '@/store'
    import router from '@/router'
    import {initMenu} from "@/common/utils"

    export default {
        computed: {
            ...mapGetters(['menus'])
        },
        created() {
            initMenu(router, store)
        },
        methods: {
            ...mapActions([
                'logout'
            ])
        }
    }
</script>
<style scoped lang="less">
    @import "../../common/less/variable";

    .home-container {
        position: absolute;
        top: 0;
        bottom: 0;
        width: 100%;

        .home-title {
            display: flex;
            align-items: center;
            justify-content: space-between;
            background-color: @theme-color;
            .app-title {
                font-size: @font-size-large;
            }
        }

        .home-menu {
            background-color: @background-color-deep;
        }

        .home-main {
            position: relative;
            .el-breadcrumb{
                height: 15px;
            }
            .page-wrapper{
                position: absolute;
                top: 55px;
                bottom: 20px;
                left: 20px;
                right: 20px;
                /*overflow: hidden;*/

                .home-content{
                    font-size: @font-size-large;
                    color: @text-color;
                }
            }
        }

        .home-footer {
            border-top: 1px solid @border-color;
            line-height: 30px;
            text-align: right;
        }
    }
</style>
