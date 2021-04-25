# 结构
distributed1                  「库名」
  distributed                 「项目名」
    api                       「对外api层」
      client-api              「app对接中心」
      oms-api                 「管理平台对接中心」
    common                    「公共包」
      common.web              「公共web功能引入」
    doc                       「说明文件夹」
      doc.md                  「说明文档」
    service                   「微服务」
      order-center            「订单中心」
      user-center             「用户中心」
    support                   「支持中间件」
      eureka-service          「注册中心」
      zuul-service            「网关」
      
## 端口定义
# `api层`
client-api       : 8101
oms-api          : 8102
# `微服务层`
order-center     : 8201
user-center      : 8202
# `支持层`
eureka-service   : 8801
zuul-service     : 8802