package com.example.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.domain.Cat;

@Repository
public interface CatRepository extends MongoRepository<Cat, String>{

}
