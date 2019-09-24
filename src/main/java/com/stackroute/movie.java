package com.stackroute;

import org.springframework.beans.factory.annotation.Autowired;

public class movie {
    @Autowired
    actor actor;

    public com.stackroute.actor getActor() {
        return actor;
    }

    public void setActor(com.stackroute.actor actor) {
        this.actor = actor;
    }
}
