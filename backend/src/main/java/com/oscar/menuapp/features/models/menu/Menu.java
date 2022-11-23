package com.oscar.menuapp.features.models.menu;

import lombok.Value;

import java.util.List;

@Value
public class Menu {
    Currency currency;
    MenuComponentName name;
    List<MenuComponent> menuComponents;
}
