package com.stackroute;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);
        System.out.println("Config file loaded.");

        
        movie movie = factory.getBean(movie.class);
        System.out.println("Name: "+movie.getActor().getName());
        System.out.println("Gender: "+movie.getActor().getGender());
        System.out.println("Age: "+movie.getActor().getAge());

    }
}
