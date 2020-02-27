/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

/**
 * 定义一个服务契约
 * Dubbo使用 Java 的 Interface 作为服务契约
 * @author Administrator
 */
public interface GreetingsService {
    String sayHi(String name);
}
