package com.oscar.menuapp.menu.application;

import com.oscar.menuapp.menu.application.viewmodel.MenuViewModelMapper;
import com.oscar.menuapp.menu.domain.model.MenuComponent;
import com.oscar.menuapp.menu.application.viewmodel.MenuViewModel;

public class GetMenuPresenter {
    public MenuViewModel responseMenuModel(MenuComponent menu) {
        return new MenuViewModelMapper().mapFrom(menu);
    }
}
