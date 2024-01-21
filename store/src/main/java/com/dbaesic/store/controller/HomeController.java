package com.dbaesic.store.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/my-account")
    public String myAccount() {
        return "my-account";
    }

    @GetMapping("/cart-page")
    public String cart() {
        return "cart_page";
    }

    @GetMapping("/checkout-page")
    public String checkout() {
        return "checkout_page";
    }

    @GetMapping("order-confirmation")
    public String orderConfirmation() {
        return "order-confirmation";
    }

    @GetMapping("product-details")
    public String productDetails(){
        return "product-details";
    }
}
