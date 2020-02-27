/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service1;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.alibaba.dubbo.config.ServiceConfig;
import java.io.IOException;

/**
 *
 * @author Administrator
 */
public class PublishService {
    public static void main(String[] args) throws IOException {
        // ServiceConfig 服务提供者暴露服务配置 http://dubbo.apache.org/zh-cn/docs/user/references/xml/dubbo-service.html
        ServiceConfig<AddService> service = new ServiceConfig<>(); // #1
        service.setApplication(new ApplicationConfig("add-provider")); // #2
        service.setRegistry(new RegistryConfig("zookeeper://39.108.67.176:2181")); // #3
        service.setInterface(AddService.class); // #4
        service.setRef(new AddServiceImpl()); // #5
        service.export(); // #6
        System.out.println("add service started");
        System.in.read(); // #7
    }
    
}
