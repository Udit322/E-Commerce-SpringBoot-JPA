package com.example.ecommerce.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.ecommerce.entity.Product;
import com.example.ecommerce.repository.ProductRepository;
import com.example.ecommerce.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    
    public Product getProductById(Integer id) {
        return productRepository.findById(id).orElse(null);
    }

    
    public Product addProduct(Product product) {
        return productRepository.save(product);
    }

   
    public Product updateProduct(Integer id, Product product) {
        Product existingProduct = productRepository.findById(id).orElse(null);
        if (existingProduct != null) {
            existingProduct.setProductName(product.getProductName());
            existingProduct.setPrice(product.getPrice());
            existingProduct.setDescription(product.getDescription());
            existingProduct.setManufacturer(product.getManufacturer());
            existingProduct.setQuantity(product.getQuantity());
            existingProduct.setCategory(product.getCategory());
            existingProduct.setStatus(product.getStatus());
            existingProduct.setSeller(product.getSeller());
            return productRepository.save(existingProduct);
        }
        return null;
    }

    
//    public void deleteProduct(Integer id) {
//        productRepository.deleteById(id);
//    }


	@Override
	public void deleteProduct(Integer id) {
		productRepository.deleteById(id);
		
	}

	
}


