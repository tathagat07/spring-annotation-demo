package com.stackroute.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class movie implements ApplicationContextAware, BeanFactoryAware, BeanNameAware {

    actor actor;
    @Autowired
    public movie(com.stackroute.domain.actor actor) {
        this.actor = actor;
    }

    public movie() {

    }

    public com.stackroute.domain.actor getActor() {
        return actor;
    }

    public void setActor(com.stackroute.domain.actor actor) {
        this.actor = actor;
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("SetBeanFactory method called");
    }

    @Override
    public void setBeanName(String s) {

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("setApplicationContext called.");
    }
}
