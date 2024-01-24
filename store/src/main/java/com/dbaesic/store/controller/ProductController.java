package com.dbaesic.store.controller;


import com.dbaesic.store.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/")
    public String index(Model model) {
        List<Object[]> products = productService.getAllProductsAndImages();
        model.addAttribute("products", products);

        return "index";
    }

}
