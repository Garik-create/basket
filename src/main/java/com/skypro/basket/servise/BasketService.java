package com.skypro.basket.servise;


import com.skypro.basket.record.BasketRequest;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;

@Service
public class BasketService {

    private final ArrayList<Integer> productsId = new ArrayList<>();

//    public void addProduct(BasketRequest productId) {
//        productsId.getProductId().add(productId);
//
//    }

//    public ArrayList<Integer> getAllProducts() {
//        ArrayList<Integer> integers = new ArrayList<>(productsId);
//        return integers;
//    }

    public ArrayList<Integer> getProductsId() {
        return productsId;
    }
}
