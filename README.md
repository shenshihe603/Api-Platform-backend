# Api- Platform- backend
一个可提供sdk调用的项目
基于Springboot + Ant Design Pro + react开发的前后端分离系统

## 在线地址：
- 项目链接： 
- 测试账号： admin，密码：12345678

## 项目特点
根据业务流程，将整个项目后端划分为 Web 系统，接口服务，公共模块，客户端 SDK，API 网关五个子项目，使用 Maven 聚合项目，进行多模块依赖管理和打包。

后端使用 Swagger + Knife4j 自动生成 OpenAPI 规范的接口文档，前端在此基础上使用插件自动生成接口请求代码，降低前后端协作成本

为防止接口被恶意调用，设计 API 签名认证算法，为用户分配唯一 ak / sk 以鉴权，保障调用的安全性、可溯源性（指便 于统计接口调用次数）。

为解决开发者调用成本过高的问题（须自己使用 HTTP + 封装签名去调用接口，平均 20 行左右代码），基于 Spring Boot Starter 开发了客户端 SDK ，一行代码 即可调用接口，提高开发体验。

为解决多个子系统内代码大量重复的问题，抽象模型层和业务层代码为公共模块，并使用 Dubbo RPC 框架实现子系统间 的高性能接口调用，大幅减少重复代码。

选用 Spring Cloud Gateway 作为 API 网关，实现了路由转发、访问控制、流量染色，并集中处理签名校验、请求参数 校验、接口调用统计等业务逻辑，提高安全性的同时、便于系统开发维护。

前端:参考 Swagger2+knif4j等 API 管理产品实现了 API 文档浏览及在线调用功能，提供 Json 编辑器与显示器来提升 用户输入请求参数 json 的体验。

客户端 SDK 尽量用最少的依赖，基于 Spring Boot Starter 自主设计 SDK ，保证 SDK 的精简、避免依赖冲突。

## 技术介绍
前端： React + Ant Design pro +Echarts + OpenApi插件

后端： SpringBoot + Mysql + Redis + Nginx + Nacos + Swagger2&knif4j + MyBatisPlus + Dubbo + gateway




## 项目截图
   ![image](https://github.com/shenshihe603/Api-Platform-backend/assets/82700340/b779e011-e0d6-4ee3-8438-2a2f3c788f70)
![image](https://github.com/shenshihe603/Api-Platform-backend/assets/82700340/96a31930-76d1-4a0f-9260-4fddb735ca38)
![image](https://github.com/shenshihe603/Api-Platform-backend/assets/82700340/d9692435-60ea-4602-89f1-f13564d8e2b0)
![image](https://github.com/shenshihe603/Api-Platform-backend/assets/82700340/0c4b4536-6dda-4cca-9684-b1bcede022d1)
![image](https://github.com/shenshihe603/Api-Platform-backend/assets/82700340/d9301129-9d60-4ad9-861e-ad79b619335f)
![image](https://github.com/shenshihe603/Api-Platform-backend/assets/82700340/6c047a54-07ee-49ff-9932-9ee4064114f5)
![image](https://github.com/shenshihe603/Api-Platform-backend/assets/82700340/c1971e3e-bfed-4759-805d-99ee28d2e77b)
![image](https://github.com/shenshihe603/Api-Platform-backend/assets/82700340/1427e87e-666d-41de-ae16-30a0a8e5a6ba)
![image](https://github.com/shenshihe603/Api-Platform-backend/assets/82700340/81102a78-7dd9-4430-92c0-14e4932bc66f)


为解决开发者调用成本过高的问题（须自己使用 HTTP + 封装签名去调用接口，平均 20 行左右代码），基于 Spring Boot Starter 开发了客户端 SDK ，一行代码 即可调用接口，提高开发体验。 
![image](https://github.com/shenshihe603/Api-Platform-backend/assets/82700340/73da22f5-3249-45c2-9045-1afffdf81916)

## 后续计划
- 加入真正的开发者管理平台 
- 加入真实计费扣费 
- 用户可以申请更换签名
- 让其他用户也上传接口
- 提供一个机制（界面），让用户输入自己的接口 host（服务器地址）、接口信息，将接口信息写入数据库。
- 网关校验是否还有调用次数
- 考虑并发问题，防止瞬间调用超额。
- 网关优化
  比如增加限流 / 降级保护，提高性能等。还可以考虑搭配 Nginx 网关使用。
- 功能增强
  可以针对不同的请求头或者接口类型来设计前端界面和表单，便于用户调用，获得更好的体验。
  可以参考 swagger、postman、knife4j 的页面。
