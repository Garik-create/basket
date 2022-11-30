package com.skypro.basket.service;


import com.skypro.basket.model.Basket;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BasketService {
    private final Basket basket;

    public BasketService(Basket basket) {
        this.basket = basket;
    }

    public void addToBasket(List<Integer> ids) {
        this.basket.addToProductsId(ids);
    }

    public List<Integer> getFromBasket() {
        return this.basket.getProductsId();

    }

}
