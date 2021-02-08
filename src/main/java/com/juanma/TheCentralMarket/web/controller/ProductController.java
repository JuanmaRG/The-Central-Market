package com.juanma.TheCentralMarket.web.controller;

import com.juanma.TheCentralMarket.domain.Product;
import com.juanma.TheCentralMarket.domain.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductService productService;

    public List<Product> getAll(){
        return productService.getAll();
    }
    public Optional<Product> getProduct(int productId){
        return productService.getProduct(productId);
    }
}
