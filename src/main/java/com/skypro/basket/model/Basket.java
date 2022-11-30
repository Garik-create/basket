package com.skypro.basket.model;

import org.springframework.stereotype.Repository;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;

@Repository
@SessionScope
public class Basket {
    private final List<Integer> productsId = new ArrayList<>();

    public void addToProductsId(List<Integer> ids) {
        productsId.addAll(ids);
    }

    public List<Integer> getProductsId() {
        return this.productsId;
    }
}
