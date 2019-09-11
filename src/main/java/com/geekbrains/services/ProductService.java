package com.geekbrains.services;

import com.geekbrains.entities.Product;
import com.geekbrains.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private ProductRepository productRepository;

    @Autowired
    public void setProductRepository(ProductRepository productRepository){
        this.productRepository = productRepository;
    }
    public void addProduct (Product product){
        productRepository.addProduct(product);
    }

    public List<Product> getAll(){
        return productRepository.getProducts();
    }

    public Product getProductById(int id){
        return productRepository.getProductById(id);
    }
}
