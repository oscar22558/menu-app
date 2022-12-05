package com.oscar.menuapp.features.features.menus;

import com.oscar.menuapp.features.models.menu.MenuComponent;

public interface MenuRepo {
    MenuComponent findMenuById(long id);
}
