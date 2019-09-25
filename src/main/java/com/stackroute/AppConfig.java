package com.stackroute;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public actor getactor1()
    {
        actor actor = new actor("Amitabh Bachchan","Male",70);
        return actor;
    }
    @Bean
    public actor getactor2()
    {
        actor actor1 = new actor("SRK","Male",55);
        return actor1;
    }

    @Bean(value = "movie1")
    public movie getmovie1()
    {
        movie movie1 = new movie(getactor1());
        return movie1;
    }

    @Bean(value = "movie2")
    public movie getmovie2()
    {
        movie movie2 = new movie(getactor2());
        return movie2;
    }
}
