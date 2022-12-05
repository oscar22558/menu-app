package com.oscar.menuapp.features.features.menus;

import com.oscar.menuapp.features.HttpResponseBuilder;
import com.oscar.menuapp.features.models.menu.MenuComponent;
import com.oscar.menuapp.features.viewmodels.MenuModel;

public interface GetMenuPresenter {
    public HttpResponseBuilder<MenuModel> responseMenuModel(MenuComponent menu);
}
