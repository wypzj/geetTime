当我们不想一个springboot web应用程序启动时启动web容器，有两种方式可以关闭
1. 配置文件中配置：spring.main.web-application-type=none
2. 在springboot启动类main方法中使用编程方式关闭

``
new SpringApplicationBuilder(启动类.class)
.web(WebApplicationType.NONE)
.run(args);
``

==================分割线========================

有时候，我们会在项目启动时初始化一些东西，springboot提供了两种方式让我们实现初始化时加入自己的初始化内容，同时还能指定初始化顺序
1. 加入初始化内容-实现CommandLineRunner/ApplicationRunner，重写其中的run方法
2. 指定加载顺序-@Order(1),注解参数越小，越先加载

==================分割线========================
springboot还提供了一种返回码生成的接口ExitCodeGenerator，可以按照自己的逻辑生成code，每次应用程序需要时就会调用当前的实现类中生成code的方法