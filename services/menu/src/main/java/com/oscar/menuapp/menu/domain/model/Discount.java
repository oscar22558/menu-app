package com.oscar.menuapp.menu.domain.model;

import com.oscar.menuapp.menu.domain.exception.DiscountValueOutOfRangeException;
import lombok.Value;

@Value
public class Discount {
    float value;

    public Discount(float value) {
        if(value > 1f || value < 0) throw new DiscountValueOutOfRangeException();
        this.value = value;
    }

    public float offerDiscount(float basePrice){
        return basePrice*value;
    }
}
