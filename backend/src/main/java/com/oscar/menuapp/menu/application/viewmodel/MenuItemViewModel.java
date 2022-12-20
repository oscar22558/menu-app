package com.oscar.menuapp.menu.application.viewmodel;

import lombok.Value;

import java.util.List;

@Value
public class MenuItemViewModel {
    List<MenuComponentTitleViewModel> titles;
    float price;
    float discountedPrice;
}
