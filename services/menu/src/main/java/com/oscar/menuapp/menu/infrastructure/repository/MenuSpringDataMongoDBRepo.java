package com.oscar.menuapp.menu.infrastructure.repository;

import com.oscar.menuapp.menu.infrastructure.repository.entity.Menu;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MenuSpringDataMongoDBRepo extends MongoRepository<Menu, Long> {
}
