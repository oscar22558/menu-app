package com.oscar.menuapp.menu.application.viewmodel;

import lombok.Value;

import java.util.ArrayList;
import java.util.List;

@Value
public class MenuViewModel {
    String currency;
    List<MenuComponentTitleViewModel> titles;
    List<MenuItemViewModel> items;
    List<MenuViewModel> subMenu;

    public MenuViewModel(String currency, List<MenuComponentTitleViewModel> titles, List<MenuItemViewModel> items, List<MenuViewModel> subMenu) {
        this.currency = currency;
        this.titles = titles;
        this.items = items;
        this.subMenu = subMenu;
    }

    public MenuViewModel(String currency, List<MenuComponentTitleViewModel> titles) {
        this(currency, titles, new ArrayList<>(), new ArrayList<>());
    }

    public MenuViewModel(){
        this("", new ArrayList<>(), new ArrayList<>(), new ArrayList<>());
    }
}