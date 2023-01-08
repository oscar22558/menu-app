package com.oscar.menuapp.menu.application.viewmodel;

import com.oscar.menuapp.common.application.ViewModelMapper;
import com.oscar.menuapp.menu.domain.model.Menu;
import com.oscar.menuapp.menu.domain.model.MenuComponent;
import com.oscar.menuapp.menu.domain.model.MenuItem;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class MenuViewModelMapper implements ViewModelMapper<Menu, MenuViewModel> {
    @Override
    public MenuViewModel mapFrom(Menu appModel){
        if(!appModel.isMenu())
            throw new IllegalArgumentException("MenuComponent should be a Menu.");


        var subMenus = new MenuViewModelMapper()
                .mapFrom(appModel
                        .getMenuComponents()
                        .stream()
                        .filter(MenuComponent::isMenu)
                        .map(component -> (Menu) component)
                        .toList()
                )
                .stream()
                .toList();
        var items = new MenuItemViewModelMapper()
                .mapFrom(appModel
                        .getMenuComponents()
                        .stream()
                        .filter(MenuComponent::isNotMenu)
                        .map(menuComponent -> (MenuItem) menuComponent)
                        .toList()
                )
                .stream()
                .toList();
        var timeslots = new TimeslotViewModelMapper()
                .mapFrom(appModel.getAvailableTime().getTimeslots())
                .stream()
                .toList();

        return new MenuViewModel(
            appModel.getLocale().getCode().name(),
            appModel.getTitle().getContent(),
            appModel.getSubTitle().getContent(),
            appModel.getSpecialNote().getContent(),
            appModel.getPrice().getCurrency().getCode().name(),
            appModel.getPrice().getBasePrice(),
            appModel.getPrice().getDiscountedPrice(),
            items,
            subMenus,
            timeslots
        );
    }
}
