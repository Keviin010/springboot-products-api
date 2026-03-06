package com.java.springboot.backend.controllers;

import com.java.springboot.backend.entities.Product;
import com.java.springboot.backend.services.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ProductController {

    final private ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<Product>> List(){
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> details (@PathVariable Long id){
        Optional<Product> optionalProduct = service.finById(id);
        if (optionalProduct.isPresent()){
            return ResponseEntity.ok(optionalProduct.orElseThrow());
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity<Product> create(@RequestBody Product product){
       return ResponseEntity.status(HttpStatus.CREATED).body(service.save(product));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Product> update(@RequestBody Product product, @PathVariable Long id){
        Optional<Product> optionalProduct = service.finById(id);
        if (optionalProduct.isPresent()){
            Product productDb = optionalProduct.orElseThrow();
            productDb.setDescription(product.getDescription());
            productDb.setName(product.getName());
            productDb.setPrice(product.getPrice());
            return ResponseEntity.ok(service.save(productDb));
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Product> delete(@PathVariable Long id){
        Optional<Product> optionalProduct = service.deleteById(id);
        if (optionalProduct.isPresent()){
            return ResponseEntity.ok(optionalProduct.orElseThrow());
        }
        return ResponseEntity.notFound().build();
    }

}
