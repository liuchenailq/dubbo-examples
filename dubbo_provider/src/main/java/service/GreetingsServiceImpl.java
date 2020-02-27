/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

/**
 * 服务契约的实现者
 * @author Administrator
 */
public class GreetingsServiceImpl implements GreetingsService{

    @Override
    public String sayHi(String name) {
        return "hi, " + name;
    }
    
}
