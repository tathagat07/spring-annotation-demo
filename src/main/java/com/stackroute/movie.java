package com.stackroute;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class movie {

    actor actor;
    @Autowired
    public movie(com.stackroute.actor actor) {
        this.actor = actor;
    }

    public movie() {

    }

    public com.stackroute.actor getActor() {
        return actor;
    }

    public void setActor(com.stackroute.actor actor) {
        this.actor = actor;
    }
}
