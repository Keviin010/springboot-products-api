package com.java.springboot.backend.repositories;

import com.java.springboot.backend.entities.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
}
