package com.stackroute;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
  @Bean(value = "Init")
    public BeanPostProcessorDemoBean Init(){
    BeanPostProcessorDemoBean beanLifeCycleDemo = new BeanPostProcessorDemoBean();
    return beanLifeCycleDemo;
  }

  @Bean(value = "destroy")
    public BeanPostProcessorDemoBean destroy(){
      BeanPostProcessorDemoBean beanLifeCycleDemo = new BeanPostProcessorDemoBean();
      return beanLifeCycleDemo;
  }

}
