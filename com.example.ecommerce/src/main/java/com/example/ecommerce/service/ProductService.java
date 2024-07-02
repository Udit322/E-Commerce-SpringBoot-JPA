package com.example.ecommerce.service;

import java.util.List;
import com.example.ecommerce.entity.Product;

public interface ProductService {
    List<Product> getAllProducts();
    Product getProductById(Integer id);
    Product addProduct(Product product);
    Product updateProduct(Integer id, Product product);
    void  deleteProduct(Integer id);
}
