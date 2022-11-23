package com.oscar.menuapp.features.viewmodels;

import com.oscar.menuapp.features.models.menu.MenuComponent;

import java.util.List;
import java.util.stream.Collectors;

public class MenuMapper {
    public MenuModel mapFrom(MenuComponent menuComponent){
        if(!menuComponent.isMenu())
            throw new IllegalArgumentException("MenuComponent should be a Menu.");

        List<MenuComponentNameModel> nameModels = new MenuComponentNameMapper()
                .mapFrom(menuComponent.getNames());
        MenuModel menuModel = new MenuModel(
                menuComponent.getCurrency().getCode().name(),
                nameModels
        );

        menuComponent.getMenuComponents().forEach(component->{
            if(component.isMenu()){
                MenuModel subMenuModel = new MenuMapper().mapFrom(component);
                menuModel.getSubMenu().add(subMenuModel);
            }else {
                MenuItemModel itemModel = new MenuItemMapper().mapFrom(component);
                menuModel.getItems().add(itemModel);
            }
        });
        return menuModel;
    }

    public List<MenuModel> mapFrom(List<MenuComponent> menuComponents){
        return menuComponents.stream().map(this::mapFrom).collect(Collectors.toList());
    }
}
