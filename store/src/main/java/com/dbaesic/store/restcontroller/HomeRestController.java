package com.dbaesic.store.restcontroller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * REST Controller for handling home-related endpoints.
 *
 * @author Amiel De Los Reyes
 */
@RestController
@RequestMapping("/api/home")
public class HomeRestController {

    /**
     * Endpoint for navigating to the "my-account" page.
     *
     * @return ResponseEntity with HTTP status OK.
     */
    @GetMapping("/my-account")
    public ResponseEntity<String> myAccount() {
        return new ResponseEntity<>("Navigating to my-account", HttpStatus.OK);
    }

    /**
     * Endpoint for navigating to the "cart-page" page.
     *
     * @return ResponseEntity with HTTP status OK.
     */
    @GetMapping("/cart-page")
    public ResponseEntity<String> cart() {
        return new ResponseEntity<>("Navigating to cart_page", HttpStatus.OK);
    }

    /**
     * Endpoint for navigating to the "checkout-page" page.
     *
     * @return ResponseEntity with HTTP status OK.
     */
    @GetMapping("/checkout-page")
    public ResponseEntity<String> checkout() {
        return new ResponseEntity<>("Navigating to checkout_page", HttpStatus.OK);
    }

    /**
     * Endpoint for navigating to the "order-confirmation" page.
     *
     * @return ResponseEntity with HTTP status OK.
     */
    @GetMapping("/order-confirmation")
    public ResponseEntity<String> orderConfirmation() {
        return new ResponseEntity<>("Navigating to order-confirmation", HttpStatus.OK);
    }

    /**
     * Endpoint for navigating to the "product-details" page.
     *
     * @return ResponseEntity with HTTP status OK.
     */
    @GetMapping("/product-details")
    public ResponseEntity<String> productDetails() {
        return new ResponseEntity<>("Navigating to product-details", HttpStatus.OK);
    }
}
