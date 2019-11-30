package com.pac;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;

/**
 * @author 卫云鹏
 * @date in 17:20 2019/11/29
 */
public class HomeSourceApplication implements ApplicationRunner {
    private String name;
    public HomeSourceApplication() {
        this.name = "spring";
        System.out.println("无参构造："+name);
    }

    public HomeSourceApplication(String name) {
        this.name = name;
        System.out.println("有参构造："+name);
    }

    public void run(ApplicationArguments args) throws Exception {
        System.out.println("HomeSourceApplication run方法");
    }
}
