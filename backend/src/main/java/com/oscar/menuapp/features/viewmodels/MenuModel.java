package com.oscar.menuapp.features.viewmodels;

import lombok.Value;

import java.util.ArrayList;
import java.util.List;

@Value
public class MenuModel {
    String currency;
    List<MenuComponentNameModel> names;
    List<MenuItemModel> items;
    List<MenuModel> subMenu;

    public MenuModel(String currency, List<MenuComponentNameModel> names, List<MenuItemModel> items, List<MenuModel> subMenu) {
        this.currency = currency;
        this.names = names;
        this.items = items;
        this.subMenu = subMenu;
    }

    public MenuModel(String currency, List<MenuComponentNameModel> names) {
        this(currency, names, new ArrayList<>(), new ArrayList<>());
    }

    public MenuModel(){
        this("", new ArrayList<>(), new ArrayList<>(), new ArrayList<>());
    }
}