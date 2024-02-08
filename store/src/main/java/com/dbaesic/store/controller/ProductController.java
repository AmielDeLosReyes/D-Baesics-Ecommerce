package com.dbaesic.store.controller;

import com.dbaesic.store.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
    /*

        Let's break down the structure of the Object[] returned by your query and understand the index of each element:

        product[0]: This index represents the product_id field from your query. It should contain the unique identifier of the product.

        product[1]: This index represents the product_name field from your query. It contains the name of the product.

        product[2]: This index represents the old_price field from your query. It contains the old price of the product.

        product[3]: This index represents the current_price field from your query. It contains the current price of the product.

        product[4]: This index represents the image_urls field from your query. It contains a concatenated string of image URLs separated by commas.

        product[5]: This index represents the product_description field from your query. It contains the description of the product.

        So, when you access product[0], you're getting the product ID, product[1] gives you the product name, product[2] gives the old price, product[3] gives the current price, product[4] gives the concatenated image URLs, and product[5] gives the product description.
     */
        List<Object[]> products = productService.getAllProductsAndImages();

        List<Object[]> productColorAndSizes = productService.getAllProductColorAndSizes();

        // Remove duplicates from the productColorAndSizes list
        Set<Object[]> uniqueProductColorAndSizes = new HashSet<>(productColorAndSizes);
        List<Object[]> uniqueProductColorAndSizesList = new ArrayList<>(uniqueProductColorAndSizes);

        // Add the products attribute to the model
        model.addAttribute("products", products);
        model.addAttribute("productColorAndSizes", uniqueProductColorAndSizesList);

        return "index";
    }

}
