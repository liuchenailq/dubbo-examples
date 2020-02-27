/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.alibaba.dubbo.config.ServiceConfig;
import java.io.IOException;

/**
 * 服务发布
 * @author Administrator
 */
public class Application {
    public static void main(String[] args) throws IOException {
        // ServiceConfig 服务提供者暴露服务配置 http://dubbo.apache.org/zh-cn/docs/user/references/xml/dubbo-service.html
        ServiceConfig<GreetingsService> service = new ServiceConfig<>(); // #1
        service.setApplication(new ApplicationConfig("first-dubbo-provider")); // #2
        service.setRegistry(new RegistryConfig("zookeeper://39.108.67.176:2181")); // #3
        service.setInterface(GreetingsService.class); // #4
        service.setRef(new GreetingsServiceImpl()); // #5
        service.export(); // #6
        System.out.println("dubbo service started");
        System.in.read(); // #7
    }
}
