const { defineConfig } = require('@vue/cli-service')
module.exports = defineConfig({
  transpileDependencies: true,
  lintOnSave: false,
  devServer:{
    open:true,
    port:9090,
    proxy:{
      '/api':{
        target:"http://localhost:9092/",
        changeOrigin:true,
        pathRewrite:{
          '/api':''
        }
      }
    }
  }
})
