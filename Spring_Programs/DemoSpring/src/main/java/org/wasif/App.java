package org.wasif;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Dev obj = (Dev) context.getBean("dev");
        //obj.setAge(10);
        System.out.println("printing from App.java:-> " + obj.getAge());
//        System.out.println( "Its App class" );
        System.out.println(obj.getComp());

    }
}
