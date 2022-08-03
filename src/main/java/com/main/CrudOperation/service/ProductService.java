package com.main.CrudOperation.service;


import com.main.CrudOperation.entity.Product;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface ProductService {


    Product saveProduct(Product product);

    List<Product> getProducts();

    Product getProductById(int id);

    Product getProductByName(String name);

    Product updateProduct(Product product);

    String deleteProduct(int id);
}
