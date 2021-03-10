接口 + 注解 (微服务调用接口 + @FeignClient)
    1. pom引入相应jar
    2. yml配置eureka
    3. 主启动类添加@EnableFeignClients
    4. controller调用service
    5. interface通过接口 + 注解方式调用服务方接口
