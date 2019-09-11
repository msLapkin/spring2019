package com.geekbrains.repositories;

import com.geekbrains.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepository {
    public List<Product> products = new ArrayList<Product>();

    public void addProduct(Product product){
       products.add(product);
    }

    public List<Product> getProducts() {
        return products;
    }

    public Product getProductById(int id){
        for (Product product: products){
            if (product.getId()==id)
                return product;
        }
        return null;
    }
}
