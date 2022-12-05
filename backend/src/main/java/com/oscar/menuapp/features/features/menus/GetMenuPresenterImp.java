package com.oscar.menuapp.features.features.menus;

import com.oscar.menuapp.features.HttpOkResponseBuilder;
import com.oscar.menuapp.features.HttpResponseBuilder;
import com.oscar.menuapp.features.models.menu.MenuComponent;
import com.oscar.menuapp.features.viewmodels.MenuMapper;
import com.oscar.menuapp.features.viewmodels.MenuModel;

public class GetMenuPresenterImp implements GetMenuPresenter{
    @Override
    public HttpResponseBuilder<MenuModel> responseMenuModel(MenuComponent menu) {
        var menuModel = new MenuMapper().mapFrom(menu);
        return new HttpOkResponseBuilder<>(menuModel);
    }
}
