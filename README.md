##简介
本项目基本 [spring boot](https://github.com/spring-projects/spring-boot) , spring data, mysql, [rest-assured](https://github.com/rest-assured/rest-assured) 。基于spring mvc提供restful风格接口调用，并提供cors跨域请求支持
即将集成(实现)：spring security（token), log4j(logback), web socket

##参考，感谢
* [spring boot quick start](http://projects.spring.io/spring-boot/)
* [spring boot filter](http://www.jianshu.com/p/f317a0ee3ef4)
* [spring data 规范](http://docs.spring.io/spring-data/jpa/docs/1.5.0.RC1/reference/html/jpa.repositories.html#jpa.query-methods)
* [RESTful API 设计最佳实践](http://blog.jobbole.com/41233/)
* [spring boot集成spring security入门](http://blog.didispace.com/springbootsecurity/)
* [Thymeleaf](http://blog.didispace.com/springbootweb/)
* [spring security](https://hellokoding.com/registration-and-login-example-with-spring-security-spring-boot-spring-data-jpa-hsql-jsp/)

##问题解决
* [csrf](http://stackoverflow.com/questions/21128058/invalid-csrf-token-null-was-found-on-the-request-parameter-csrf-or-header)
* [Thymeleaf form表单](http://blog.csdn.net/chenloveit/article/details/38910803)

##TODO
* 注册页面的错误显示
* 登录密码加密传输
* 登录验证码及记住密码
* ajax方式登录及token的应用