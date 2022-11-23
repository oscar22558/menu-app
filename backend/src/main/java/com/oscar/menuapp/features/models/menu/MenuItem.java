package com.oscar.menuapp.features.models.menu;

public class MenuItem{
    MenuComponentName name;
    ItemPrice price;
    Discount discount;

    public MenuItem(MenuComponentName name, ItemPrice price, float discountRate) {
        this.name = name;
        this.price = price;
        this.discount = new Discount(price, discountRate);
    }

    public MenuItem(MenuComponentName name, ItemPrice price, Discount discount){
        this.name = name;
        this.price = price;
        this.discount = discount;
    }
}
