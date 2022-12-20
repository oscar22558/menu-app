package com.oscar.menuapp.menu.application.requestmodel;

import lombok.Value;

@Value
public class MenuItemRequestModel {
    String title;
    float price;
    float discount;
}
