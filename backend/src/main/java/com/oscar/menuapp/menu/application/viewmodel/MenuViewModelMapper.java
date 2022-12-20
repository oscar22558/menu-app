package com.oscar.menuapp.menu.application.viewmodel;

import com.oscar.menuapp.menu.domain.model.MenuComponent;

import java.util.List;
import java.util.stream.Collectors;

public class MenuViewModelMapper {
    public MenuViewModel mapFrom(MenuComponent appModel){
        if(!appModel.isMenu())
            throw new IllegalArgumentException("MenuComponent should be a Menu.");

        List<MenuComponentTitleViewModel> nameModels = new MenuComponentTitleViewModelMapper()
                .mapFrom(appModel.getNames());
        MenuViewModel menuViewModel = new MenuViewModel(
                appModel.getCurrency().getCode().name(),
                nameModels
        );

        appModel.getMenuComponents().forEach(component->{
            if(component.isMenu()){
                MenuViewModel subMenuViewModel = new MenuViewModelMapper().mapFrom(component);
                menuViewModel.getSubMenu().add(subMenuViewModel);
            }else {
                MenuItemViewModel itemModel = new MenuItemViewModelMapper().mapFrom(component);
                menuViewModel.getItems().add(itemModel);
            }
        });
        return menuViewModel;
    }

    public List<MenuViewModel> mapFrom(List<MenuComponent> appModels){
        return appModels.stream().map(this::mapFrom).collect(Collectors.toList());
    }
}
