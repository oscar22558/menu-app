package com.oscar.menuapp.menu.application.viewmodel;

import com.oscar.menuapp.menu.domain.model.MenuComponent;
import com.oscar.menuapp.menu.domain.model.MenuItem;

import java.util.List;
import java.util.stream.Collectors;

public class MenuItemViewModelMapper {

    public MenuItemViewModel mapFrom(MenuComponent appModel){
        List<MenuComponentTitleViewModel> nameModels = new MenuComponentTitleViewModelMapper()
                .mapFrom(appModel.getNames());
        return new MenuItemViewModel(
                nameModels,
                appModel.getPrice().getPrice(),
                appModel.getDiscount().getDiscountedPrice()
        );
    }

    public List<MenuItemViewModel> mapFrom(List<MenuItem> appModels){
        return appModels.stream().map(this::mapFrom).collect(Collectors.toList());
    }
}
