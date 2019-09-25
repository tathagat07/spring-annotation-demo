package com.stackroute;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);
        System.out.println("Config file loaded.");

        movie movie = (movie)factory.getBean("movie2");
        System.out.println(movie.getActor().getName());
        System.out.println(movie.getActor().getGender());
        System.out.println(movie.getActor().getAge());
        movie.setBeanFactory(factory);
        movie.setBeanName("beam123");


    }
}
