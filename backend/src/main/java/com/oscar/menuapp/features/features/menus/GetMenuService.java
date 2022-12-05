package com.oscar.menuapp.features.features.menus;

import com.oscar.menuapp.features.HttpOkResponseBuilder;
import com.oscar.menuapp.features.HttpResponseBuilder;
import com.oscar.menuapp.features.viewmodels.MenuModel;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class GetMenuService {

    private MenuRepo menuRepo;
    private GetMenuPresenter getMenuPresenter;

    public HttpResponseBuilder<MenuModel> getMenu(long menuId){
        var menu =  menuRepo.findMenuById(menuId);
        return getMenuPresenter.responseMenuModel(menu);
    }
}
