package com.oscar.menuapp.menu.domain.model;

import lombok.EqualsAndHashCode;
import lombok.Value;

@Value
@EqualsAndHashCode(callSuper = true)
public class MenuItem extends MenuComponent{
    TextBlock title;
    TextBlock subTitle;
    TextBlock specialNote;
    Price price;

    @Override
    public boolean isMenu() {
        return false;
    }
}
