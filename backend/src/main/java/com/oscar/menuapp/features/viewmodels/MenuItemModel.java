package com.oscar.menuapp.features.viewmodels;

import lombok.Value;

import java.util.List;

@Value
public class MenuItemModel {
    List<MenuComponentNameModel> names;
    float price;
    float discountedPrice;
}
