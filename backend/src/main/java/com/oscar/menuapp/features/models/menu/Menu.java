package com.oscar.menuapp.features.models.menu;

import com.oscar.menuapp.features.exceptions.InvalidOperationException;
import lombok.EqualsAndHashCode;
import lombok.Value;

import java.util.List;

@Value
@EqualsAndHashCode(callSuper = true)
public class Menu extends MenuComponent {
    Currency currency;
    MenuComponentName name;
    List<MenuComponent> menuComponents;

    @Override
    public boolean isMenu() {
        return true;
    }
}
