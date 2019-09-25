package com.stackroute;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
  @Bean(value = "Init")
    public BeanLifeCycleDemo Init(){
    BeanLifeCycleDemo beanLifeCycleDemo = new BeanLifeCycleDemo();
    return beanLifeCycleDemo;
  }

  @Bean(value = "destroy")
    public BeanLifeCycleDemo destroy(){
      BeanLifeCycleDemo beanLifeCycleDemo = new BeanLifeCycleDemo();
      return beanLifeCycleDemo;
  }

}
