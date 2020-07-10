package com.example.demo.Service.MongoService;

import com.example.demo.Entity.MongoEntity.Chips;
import org.springframework.data.repository.CrudRepository;

public interface MongoRepository extends CrudRepository<Chips, String> {

}