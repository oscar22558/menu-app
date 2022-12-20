package com.oscar.menuapp.menu.infrastructure.repository;

import com.oscar.menuapp.menu.application.MenuRepo;
import com.oscar.menuapp.menu.domain.model.MenuComponent;

public class MenuJdbcPostgresRepo implements MenuRepo {
    @Override
    public MenuComponent findMenuById(long id) {
        return null;
    }

    @Override
    public MenuComponent save(MenuComponent menu) {
        return null;
    }
}
