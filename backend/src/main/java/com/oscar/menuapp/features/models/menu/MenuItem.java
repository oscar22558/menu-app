package com.oscar.menuapp.features.models.menu;

import lombok.EqualsAndHashCode;
import lombok.Value;

@Value
@EqualsAndHashCode(callSuper = true)
public class MenuItem extends MenuComponent{
    MenuComponentName name;
    ItemPrice price;
    Discount discount;

    public MenuItem(MenuComponentName name, ItemPrice price, float discountRate) {
        this.name = name;
        this.price = price;
        this.discount = new Discount(price, discountRate);
    }

    @Override
    public boolean isMenu() {
        return false;
    }
}
