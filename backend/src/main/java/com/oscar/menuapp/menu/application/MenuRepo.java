package com.oscar.menuapp.menu.application;

import com.oscar.menuapp.menu.domain.model.MenuComponent;

public interface MenuRepo {
    MenuComponent findMenuById(long id);

    MenuComponent save(MenuComponent menu);
}
