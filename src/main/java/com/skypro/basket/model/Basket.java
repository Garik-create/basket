package com.skypro.basket.model;

import java.util.ArrayList;
import java.util.Collection;

public class Basket {
//    private Integer productId;
    private ArrayList<Integer> productsId = new ArrayList<>();

    public Basket(ArrayList<Integer> productsId) {
        this.productsId = productsId;
    }

    public ArrayList<Integer> getProductsId() {
        return productsId;
    }

    public void setProductId(ArrayList<Integer> productsId) {
        this.productsId = productsId;
    }
}
