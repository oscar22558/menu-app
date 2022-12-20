package com.oscar.menuapp.menu.domain.model;

import lombok.EqualsAndHashCode;
import lombok.Value;

@Value
@EqualsAndHashCode(callSuper = true)
public class MenuItem extends MenuComponent{
    Title name;
    ItemPrice price;
    Discount discount;

    public MenuItem(Title name, float price, float discountRate) {
        this.name = name;
        this.price = new ItemPrice(price);
        this.discount = new Discount(this.price, discountRate);
    }

    @Override
    public boolean isMenu() {
        return false;
    }
}
