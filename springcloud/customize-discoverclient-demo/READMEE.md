# 服务发现的心得笔记

由@EnableDiscoveryClient注解说起，springcloud写了一个接口DiscoveryClient，所有服务发现的组件
（不管是Eureka，consul，nacos），都需要去实现这个接口，这个接口定义了服务发现的相关行为，像获取服务实例列表等。
不过总体来说，我也还一团乱，资历跟经验限制，我有许多地方不能理解。spring发展到现今，已经广而深，加油吧
let us speak from the annotation named @EnableDiscoveryClient,springcloud defined a interface DiscoveryClient,it provides
some actions like server find.....
2019/12/04