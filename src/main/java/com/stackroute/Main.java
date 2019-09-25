package com.stackroute;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);
        System.out.println("Config file loaded.");

        movie movie1 = (movie)factory.getBean("movie1");
        movie movie2 = (movie)factory.getBean("movie2");


        System.out.println("Name: "+movie1.getActor().getName());
        System.out.println("Gender: "+movie1.getActor().getGender());
        System.out.println("Age: "+movie1.getActor().getAge());
        System.out.println();
        System.out.println("Name: "+movie2.getActor().getName());
        System.out.println("Gender: "+movie2.getActor().getGender());
        System.out.println("Age: "+movie2.getActor().getAge());

        System.out.println(movie1 == movie2);
        //System.out.println(movieB.getActor());

    }
}
