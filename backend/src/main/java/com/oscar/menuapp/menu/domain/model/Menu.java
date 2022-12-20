package com.oscar.menuapp.menu.domain.model;

import lombok.EqualsAndHashCode;
import lombok.Value;

import java.util.List;

@Value
@EqualsAndHashCode(callSuper = true)
public class Menu extends MenuComponent {
    Currency currency;
    Title title;
    List<MenuComponent> menuComponents;

    @Override
    public boolean isMenu() {
        return true;
    }
}
