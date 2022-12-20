package com.oscar.menuapp.menu.domain.model;

import com.oscar.menuapp.menu.domain.exception.ItemPriceInvalidException;
import lombok.Value;

@Value
public class ItemPrice {
    float price;

    public ItemPrice(float price) {
        if(price <= 0f)
            throw new ItemPriceInvalidException();
        this.price = price;
    }
}
