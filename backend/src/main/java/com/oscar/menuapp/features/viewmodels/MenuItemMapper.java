package com.oscar.menuapp.features.viewmodels;

import com.oscar.menuapp.features.models.menu.MenuComponent;
import com.oscar.menuapp.features.models.menu.MenuItem;

import java.util.List;
import java.util.stream.Collectors;

public class MenuItemMapper {

    public MenuItemModel mapFrom(MenuComponent menuComponent){
        List<MenuComponentNameModel> nameModels = new MenuComponentNameMapper()
                .mapFrom(menuComponent.getNames());
        return new MenuItemModel(
                nameModels,
                menuComponent.getPrice().getPrice(),
                menuComponent.getDiscount().getDiscountedPrice()
        );
    }

    public List<MenuItemModel> mapFrom(List<MenuItem> items){
        return items.stream().map(this::mapFrom).collect(Collectors.toList());
    }
}
