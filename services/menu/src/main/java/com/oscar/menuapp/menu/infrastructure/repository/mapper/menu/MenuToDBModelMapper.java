package com.oscar.menuapp.menu.infrastructure.repository.mapper.menu;

import com.oscar.menuapp.common.application.ModelMapper;
import com.oscar.menuapp.menu.domain.model.MenuComponent;
import com.oscar.menuapp.menu.infrastructure.repository.entity.Menu;
import com.oscar.menuapp.menu.infrastructure.repository.entity.MenuItem;
import com.oscar.menuapp.menu.infrastructure.repository.entity.Timeslot;
import com.oscar.menuapp.menu.infrastructure.repository.mapper.menuitem.MenuItemToDBModelMapper;
import com.oscar.menuapp.menu.infrastructure.repository.mapper.timeslot.TimeslotToDBModelMapper;

import java.util.List;

public class MenuToDBModelMapper implements ModelMapper<MenuComponent, Menu> {

    public Menu mapFrom(MenuComponent domainModel){
        Long id = domainModel.getId().isPresent() ? domainModel.getId().getId() : null;
        String title = domainModel.getTitle().getContent();
        String subTitle = domainModel.getSubTitle().getContent();
        String specialNote = domainModel.getSpecialNote().getContent();
        float price = domainModel.getPrice().getBasePrice();
        float discount = domainModel.getPrice().getDiscount().getValue();
        String localeCode = domainModel.getLocale().getCode().name();
        String currencyCode = domainModel.getPrice().getCurrency().getCode().name();
        var availableTimes = getAvailableTimes(domainModel);

        var menuDBModel = new Menu(id, title, subTitle, specialNote, price, discount, localeCode, currencyCode, availableTimes);
        var menuItemDBModels = getMenuItemDBModels(domainModel);
        var subMenuDBModels = getSubMenuDBModels(domainModel, menuDBModel);
        menuDBModel.setMenuItems(menuItemDBModels);
        menuDBModel.setSubMenus(subMenuDBModels);
        return menuDBModel;
    }

    private List<Timeslot> getAvailableTimes(MenuComponent domainModel){
        return new TimeslotToDBModelMapper()
                .mapFrom(domainModel.getAvailableTime().getTimeslots())
                .stream().toList();
    }
    private List<MenuItem> getMenuItemDBModels(MenuComponent domainModel){
        List<MenuComponent> menuItemDomainModels = domainModel.getMenuComponents()
                .stream().filter(MenuComponent::isNotMenu)
                .toList();
        return new MenuItemToDBModelMapper()
                .mapFrom(menuItemDomainModels)
                .stream().toList();
    }

    private List<Menu> getSubMenuDBModels(MenuComponent domainModel, Menu dbModel){
        List<MenuComponent> subMenuDomainModels = domainModel.getMenuComponents()
                .stream().filter(MenuComponent::isMenu)
                .toList();

        var subMenuDBModels =  new MenuToDBModelMapper()
                .mapFrom(subMenuDomainModels)
                .stream()
                .toList();
        subMenuDBModels.forEach(subMenu->subMenu.setParent(dbModel));
        return subMenuDBModels;
    }
}
