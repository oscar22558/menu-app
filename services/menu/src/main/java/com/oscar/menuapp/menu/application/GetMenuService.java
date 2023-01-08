package com.oscar.menuapp.menu.application;

import com.oscar.menuapp.menu.application.viewmodel.MenuViewModel;
import com.oscar.menuapp.menu.domain.model.Menu;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;

@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class GetMenuService {

    MenuRepo menuRepo;
    GetMenuPresenter getMenuPresenter;

    public MenuViewModel execute(GetMenuRequest request){
        var menu =  menuRepo.findMenuById(request.getId());
        if(menu.isNotMenu())
            throw new IllegalArgumentException();
        return getMenuPresenter.responseMenuModel((Menu) menu);
    }
}
