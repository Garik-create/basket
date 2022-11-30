package com.skypro.basket.controller;

import com.skypro.basket.service.BasketService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/store/order")
public class BasketController {
    private final BasketService basketService;

    public BasketController(BasketService basketService) {
        this.basketService = basketService;
    }


    @GetMapping("/get")
    public List<Integer> get() {
        return this.basketService.getFromBasket();
    }

    @GetMapping("/add")
    public String add(@RequestParam("id") List<Integer> ids) {
        this.basketService.addToBasket(ids);
        return "Приняты параметры - " + ids;
    }

}
