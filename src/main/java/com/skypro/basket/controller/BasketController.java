package com.skypro.basket.controller;

import com.skypro.basket.model.Basket;
import com.skypro.basket.record.BasketRequest;
import com.skypro.basket.servise.BasketService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class BasketController {
    private final BasketService basketService;

    public BasketController(BasketService basketService) {
        this.basketService = basketService;
    }

    @GetMapping("/store/order/get")
    public Collection<Integer> getAllProducts() {
        return this.basketService.getProductsId();
    }

//    @PostMapping("/store/order/add")
//    public Basket addProducts(@RequestBody BasketRequest basketRequest) {
//        return this.basketService.addProduct(basketRequest);
//    }


}
