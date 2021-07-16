package com.digitalinnovation.PersonAPI.repository;

import com.digitalinnovation.PersonAPI.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {

}
