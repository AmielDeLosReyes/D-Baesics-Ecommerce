package com.dbaesic.store.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Controller class for handling navigation to different pages.
 * @author Amiel De Los Reyes
 */
@Controller
public class HomeController {

    /**
     * Maps to the "/my-account" endpoint.
     *
     * @return String representing the view name "my-account".
     */
    @GetMapping("/my-account")
    public String myAccount() {
        return "my-account";
    }

    /**
     * Maps to the "/cart-page" endpoint.
     *
     * @return String representing the view name "cart_page".
     */
    @GetMapping("/cart-page")
    public String cart() {
        return "cart_page";
    }

    /**
     * Maps to the "/checkout-page" endpoint.
     *
     * @return String representing the view name "checkout_page".
     */
    @GetMapping("/checkout-page")
    public String checkout() {
        return "checkout_page";
    }

    /**
     * Maps to the "/order-confirmation" endpoint.
     *
     * @return String representing the view name "order-confirmation".
     */
    @GetMapping("order-confirmation")
    public String orderConfirmation() {
        return "order-confirmation";
    }

    /**
     * Maps to the "/product-details" endpoint.
     *
     * @return String representing the view name "product-details".
     */
    @GetMapping("product-details")
    public String productDetails() {
        return "product-details";
    }
}
