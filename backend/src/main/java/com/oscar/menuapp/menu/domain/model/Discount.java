package com.oscar.menuapp.menu.domain.model;

import com.oscar.menuapp.menu.domain.exception.DiscountInvalidException;
import lombok.Value;

@Value
public class Discount {
    ItemPrice price;
    float discount;

    public Discount(ItemPrice price, float discount) {
        if(discount > 1f || discount < 0) throw new DiscountInvalidException();
        this.price = price;
        this.discount = discount;
    }

    public float getDiscountedPrice(){
        return price.getPrice()* discount;
    }
}
