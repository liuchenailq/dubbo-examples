/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service1;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ReferenceConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import java.io.IOException;

/**
 *
 * @author Administrator
 */
public class Consumer {
    public static void main(String[] args) throws IOException {
        ReferenceConfig<AddService> reference = new ReferenceConfig<>(); // #1
        reference.setApplication(new ApplicationConfig("add-client")); // #2
        reference.setRegistry(new RegistryConfig("zookeeper://39.108.67.176:2181")); // #3
        reference.setInterface(AddService.class); // #4
        AddService addService = reference.get(); // #5
        int result = addService.add(1, 1); // #6
        System.out.println("result :" + result); // #7
        System.in.read();
    }
    
}
