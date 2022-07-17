// ActorServiceImpl.java
package com.nt.service;

import com.nt.entity.Actor;
import com.nt.repository.ActorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ActorServiceImpl implements ActorService {
    @Autowired
    private ActorRepository actorRepository;

    @Override
    public String addActor(Actor actor) {
        Actor sActor = actorRepository.save(actor);
        return "Actor saved with Id " + sActor.getId();
    }
}
