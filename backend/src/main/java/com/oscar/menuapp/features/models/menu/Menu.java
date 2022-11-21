package com.oscar.menuapp.features.models.menu;

import lombok.Value;

import java.util.List;

@Value
public class Menu implements MenuComponent {
    Currency currency;
    MenuName name;
    List<MenuComponent> menuComponents;
}
