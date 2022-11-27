package com.example.dependencyinjection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class DependencyInjectionApplication {

    public static void main(String[] args) {
//        ClassPathXmlApplicationContext context =
//                new ClassPathXmlApplicationContext("ConfigurationApp.xml");
//
//        // retrieve bean from spring container
//        Sport sport = context.getBean("football", Sport.class);
//
//        // call methods on the bean
//        System.out.println(sport.name());
//
//
//        System.out.println(sport.GetMessage());
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("ConfigurationApp.xml");
        ATM atm=context.getBean("atm",ATM.class);
        System.out.println(atm.getName());
        System.out.println(atm.getId());
        // close the context
        context.close();
    }
}