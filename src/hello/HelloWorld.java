/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello;

import org.joda.time.LocalTime;

/**
 *
 * @author yusuke ohashi
 */
public class HelloWorld {
    public static void main(String[] args) {
        LocalTime currentTime = new LocalTime();
        System.out.println("The current local time is: " + currentTime);
        
        Greeter greeter = new Greeter();
        System.out.println(greeter.sayHello());
    }
}
