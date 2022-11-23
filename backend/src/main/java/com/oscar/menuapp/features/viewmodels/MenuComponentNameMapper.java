package com.oscar.menuapp.features.viewmodels;

import com.oscar.menuapp.features.models.menu.MenuComponentName;

import java.util.List;
import java.util.stream.Collectors;

public class MenuComponentNameMapper {
    public MenuComponentNameModel mapFrom(MenuComponentName name){
        return new MenuComponentNameModel(
                name.getLocale().getCode().name(),
                name.getName()
        );
    }

    public List<MenuComponentNameModel> mapFrom(List<MenuComponentName> name){
        return name.stream().map(this::mapFrom).collect(Collectors.toList());
    }
}
