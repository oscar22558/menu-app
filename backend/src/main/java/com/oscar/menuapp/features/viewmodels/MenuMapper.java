package com.oscar.menuapp.features.viewmodels;

import com.oscar.menuapp.features.models.menu.MenuComponent;

public class MenuMapper {
    public MenuModel mapFrom(MenuComponent menuComponent){
        MenuModel menuModel;
        if(menuComponent.isMenu()){
            menuModel = new MenuModel();
        }else {
            throw new IllegalArgumentException("MenuComponent should be a Menu.");
        }
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
}
