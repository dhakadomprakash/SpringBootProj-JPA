// ActorRepository.java
package com.nt.repository;

import com.nt.entity.Actor;
import org.springframework.data.repository.CrudRepository;

public interface ActorRepository extends CrudRepository<Actor, Integer> {
}
