package com.oscar.menuapp.menu.application.requestmodel;

import lombok.Value;

import java.util.Collection;

@Value
public class MenuRequestModel {
    String localCode;
    String title;
    String currencyCode;
    Collection<MenuItemRequestModel> menuItems;
}
