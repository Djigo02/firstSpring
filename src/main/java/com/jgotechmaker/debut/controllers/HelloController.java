package com.jgotechmaker.debut.controllers;

import com.jgotechmaker.debut.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class HelloController {

    private final ProductService productService;

    @Autowired
    public HelloController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping()
    public String helloWorld(Model model) {
        model.addAttribute("products", productService.getProducts());
        return "hello";
    }
}
