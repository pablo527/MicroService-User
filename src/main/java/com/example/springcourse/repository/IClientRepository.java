package com.example.springcourse.repository;

import com.example.springcourse.models.Client;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface IClientRepository extends CrudRepository<Client, Long> {

    @Query(value = "SELECT * FROM Client WHERE Name= ?1", nativeQuery = true)
    Client searchByName(String name);

   @Query(value = "SELECT * FROM Client WHERE id= ?1", nativeQuery = true)
    Client searchById(Long id);
}
