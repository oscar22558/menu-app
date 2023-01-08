package com.oscar.menuapp.menu.infrastructure.repository;

import com.oscar.menuapp.menu.application.MenuRepo;
import com.oscar.menuapp.menu.domain.model.MenuComponent;
import org.springframework.stereotype.Repository;

@Repository
public class MenuNoOperationRepo implements MenuRepo {
    @Override
    public boolean isMenuExist(long id) {
        return false;
    }

    @Override
    public MenuComponent findMenuById(long id) {
        return null;
    }

    @Override
    public MenuComponent save(MenuComponent menu) {
        return null;
    }

    @Override
    public void deleteById(long id) {}
}
