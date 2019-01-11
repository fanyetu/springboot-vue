module.exports = {
    outputDir: 'target/dist/static',
    devServer: {
        port: 9998,
        // 配置开发环境的代理，打包后前端工程会直接成为后端的resource
        proxy: {
            '/': {
                target: 'http://localhost:9999',
                changeOrigin: false,
                ws: false
            }
        }
    }/*,
    chainWebpack: config => {
        config.resolve.alias
            .set('@', resolve('src'))
            .set('api', resolve('src/api'))
            .set('assets',resolve('src/assets'))
            .set('common',resolve('src/common'))
            .set('components',resolve('src/components'))
    }*/
}
