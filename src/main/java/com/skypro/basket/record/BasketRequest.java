package com.skypro.basket.record;

import java.util.ArrayList;

public class BasketRequest {
    private ArrayList<Integer> productsId = new ArrayList<>();

    public ArrayList<Integer> getProductsId() {
        return productsId;
    }

    public void setProductsId(ArrayList<Integer> productsId) {
        this.productsId = productsId;
    }

}
