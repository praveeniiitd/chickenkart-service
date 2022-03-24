package com.ecommerce.api;

import com.ecommerce.model.Product;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/v1")
public class CatalogResource {

    @GetMapping(value = "/health")
    public String health() {
        return "hey yeah!";
    }

    @GetMapping("/catalog")
    public ResponseEntity<List<Product>> getCatalog() {
        Product product = new Product();
        product.setDescription("dummy");
        product.setId("first");

        List<Product> products = new ArrayList<>();
        products.add(product);
        return new ResponseEntity<>(products, HttpStatus.OK);
    }
}
