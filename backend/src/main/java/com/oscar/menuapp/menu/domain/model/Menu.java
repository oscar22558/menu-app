package com.oscar.menuapp.menu.domain.model;

import lombok.EqualsAndHashCode;
import lombok.Value;

import java.util.List;

@Value
@EqualsAndHashCode(callSuper = true)
public class Menu extends MenuComponent {
    Locale locale;
    TextBlock title;
    TextBlock subTitle;
    TextBlock specialNote;
    Price price;
    AvailableTime availableTime;
    List<MenuComponent> menuComponents;

    @Override
    public boolean isMenu() {
        return true;
    }
}
