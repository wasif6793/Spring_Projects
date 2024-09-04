package org.wasif.namegenderapp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.wasif.namegenderapp.model.Person;

import java.util.List;

@Repository
public interface PersonRepository extends MongoRepository<Person, String> {

}
