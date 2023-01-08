package com.oscar.menuapp.menu.application.viewmodel;

import lombok.Value;

@Value
public class MenuItemViewModel {
    String title;
    String subTitle;
    String specialNote;
    String currencyCode;
    float price;
    float discountedPrice;
}
