package com.oscar.menuapp.menu.domain.model;

import com.oscar.menuapp.display.domain.model.DBModelId;
import lombok.EqualsAndHashCode;
import lombok.Value;

@Value
@EqualsAndHashCode(callSuper = true)
public class MenuItem extends MenuComponent{
    DBModelId id;
    TextBlock title;
    TextBlock subTitle;
    TextBlock specialNote;
    Price price;

    @Override
    public boolean isMenu() {
        return false;
    }
}
