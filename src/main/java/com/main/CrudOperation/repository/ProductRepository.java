package com.main.CrudOperation.repository;

import com.main.CrudOperation.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {

    Product findByName(String name);



}
