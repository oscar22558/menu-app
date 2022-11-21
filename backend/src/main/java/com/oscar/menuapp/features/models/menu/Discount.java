package com.oscar.menuapp.features.models.menu;

import lombok.Value;

@Value
public class Discount {
    ItemPrice price;
    float discountRate;

    public float getDiscountedPrice(){
        return price.getPrice()* discountRate;
    }
}
