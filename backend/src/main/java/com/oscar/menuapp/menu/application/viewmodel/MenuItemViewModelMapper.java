package com.oscar.menuapp.menu.application.viewmodel;

import com.oscar.menuapp.common.application.ViewModelMapper;
import com.oscar.menuapp.menu.domain.model.MenuComponent;
import com.oscar.menuapp.menu.domain.model.MenuItem;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class MenuItemViewModelMapper implements ViewModelMapper<MenuItem, MenuItemViewModel> {
    public MenuItemViewModel mapFrom(MenuItem appModel){
        return new MenuItemViewModel(
                appModel.getTitle().getContent(),
                appModel.getSubTitle().getContent(),
                appModel.getSpecialNote().getContent(),
                appModel.getPrice().getCurrency().getCode().name(),
                appModel.getPrice().getBasePrice(),
                appModel.getPrice().getDiscountedPrice()
        );
    }
}
