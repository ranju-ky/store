package org.factoriaf5.store.controllers;

import org.factoriaf5.store.model.Product;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.ArrayList;

@RestController
public class ProductController {
    @GetMapping("/health")
    public String check() {
        String greeting = "Hello! I'm a server.";
        return greeting;

    }
    private List<Product> products = new ArrayList<>();
    @GetMapping("/prouducts")
    public List<Product> allproducts(){
        return products;
    }

    @PostMapping("/prouducts")
       public addProduct(Product product){
        products.add(product);

        @DeleteMapping("/products")
         public Product findProduct(String,
                name, List<Product> products),
         List<product>){
           for (product.getName().equals(name)) {
                return product;
            }
        }

    }


}
