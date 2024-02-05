package com.dbaesic.store.controller;

import com.dbaesic.store.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * Controller class for handling product-related endpoints.
 * @author Amiel De Los Reyes
 */
@Controller
public class ProductController {

    private final ProductService productService;

    /**
     * Constructor injection for ProductService.
     *
     * @param productService ProductService instance.
     */
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    /**
     * Maps to the "/" endpoint.
     *
     * @param model Model object for adding attributes.
     * @return String representing the view name "index".
     */
    @GetMapping("/")
    public String index(Model model) {
        // Retrieve products and images from the ProductService
        List<Object[]> products = productService.getAllProductsAndImages();

        // Add the products attribute to the model
        model.addAttribute("products", products);

        return "index";
    }
}
