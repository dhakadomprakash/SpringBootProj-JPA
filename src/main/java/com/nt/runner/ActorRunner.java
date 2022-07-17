// ActorRunner.java
package com.nt.runner;

import com.nt.entity.Actor;
import com.nt.service.ActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class ActorRunner implements ApplicationRunner {
    @Autowired
    private ActorService actorService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Actor actor = new Actor("Omprakash", "Manager");
        String result = actorService.addActor(actor);
        System.out.println("here is the data " + result);
    }

}
