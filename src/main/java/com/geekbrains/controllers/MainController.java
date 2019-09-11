package com.geekbrains.controllers;

import com.geekbrains.entities.Product;
import com.geekbrains.repositories.ProductRepository;
import com.geekbrains.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/products")
public class MainController {
    //private List<Product> products = new ArrayList<>();
    private ProductService productService;

    @Autowired
    private void setProductService (ProductService productService){
        this.productService=productService;
    }

    @RequestMapping(path = "/add")
    public String add(Model model){
        Product product = new Product();
        model.addAttribute("product",product);
        return "add-form";
    }

    @RequestMapping(path = "/result")
    public String create (@ModelAttribute("product") Product product){
        productService.addProduct(product);
        return "result";
    }
    @RequestMapping("/all")
    public String showAll(Model model){
        model.addAttribute("products", productService.getAll());
        return "all";
    }
    @RequestMapping(value = "getById", method = RequestMethod.GET)
    public String getById(Model model, @RequestParam int id){
        Product product = productService.getProductById(id);
        model.addAttribute("product", product);
        return "result";
    }
}
