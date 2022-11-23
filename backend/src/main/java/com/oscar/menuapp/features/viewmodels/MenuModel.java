package com.oscar.menuapp.features.viewmodels;

import lombok.Value;

import java.util.ArrayList;
import java.util.List;

@Value
public class MenuModel {
    List<MenuItemModel> items;
    List<MenuModel> subMenu;

    public MenuModel(){
        items = new ArrayList<>();
        subMenu = new ArrayList<>();
    }
}