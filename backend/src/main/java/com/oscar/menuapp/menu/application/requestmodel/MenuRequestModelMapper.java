package com.oscar.menuapp.menu.application.requestmodel;

import com.oscar.menuapp.menu.domain.model.*;

import java.util.Collection;
import java.util.stream.Collectors;

public class MenuRequestModelMapper {
    public MenuComponent mapFrom(MenuRequestModel requestModel){
        var currencyCode = CurrencyCode.valueOf(requestModel.getCurrencyCode());
        var currency = new Currency(currencyCode);

        var localeCode = LocalCode.valueOf(requestModel.getLocalCode());
        var locale = new Locale(localeCode);

        var title = new Title(requestModel.getTitle(), locale);

        var items = new MenuItemRequestModelMapper(locale)
                .mapFrom(requestModel.getMenuItems());

       return new Menu(currency, title, items);
    }

    public Collection<MenuComponent> mapFrom(Collection<MenuRequestModel> requestModels){
        return requestModels
                .stream()
                .map(this::mapFrom)
                .collect(Collectors.toList());
    }
}
