package com.oscar.menuapp.menu.application.requestmodel;

import com.oscar.menuapp.menu.domain.model.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class MenuItemRequestModelMapper {

    private Locale locale;

    public MenuComponent mapFrom(MenuItemRequestModel requestModel){
        var title = new Title(requestModel.getTitle(), locale);
        var price = requestModel.getPrice();
        var discount = requestModel.getDiscount();
        return new MenuItem(title, price, discount);
    }

    public List<MenuComponent> mapFrom(Collection<MenuItemRequestModel> requestModels){
        return requestModels
                .stream()
                .map(this::mapFrom)
                .collect(Collectors.toList());
    }
}
