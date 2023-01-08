package com.oscar.menuapp.menu.application.requestmodel;

import lombok.Value;

@Value
public class MenuItemRequestModel {
    String title;
    String subTitle;
    String specialNote;
    String currencyCode;
    float price;
    float discountedPrice;
}
