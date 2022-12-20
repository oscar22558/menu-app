package com.oscar.menuapp.menu.application.viewmodel;

import com.oscar.menuapp.menu.domain.model.Title;

import java.util.List;
import java.util.stream.Collectors;

public class MenuComponentTitleViewModelMapper {
    public MenuComponentTitleViewModel mapFrom(Title name){
        return new MenuComponentTitleViewModel(
                name.getLocale().getCode().name(),
                name.getContent()
        );
    }

    public List<MenuComponentTitleViewModel> mapFrom(List<Title> name){
        return name.stream().map(this::mapFrom).collect(Collectors.toList());
    }
}
