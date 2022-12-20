package com.oscar.menuapp.menu.application.requestmodel;

import com.oscar.menuapp.common.application.RequestModelMapper;
import com.oscar.menuapp.menu.domain.model.*;

public class MenuItemRequestModelMapper implements RequestModelMapper<MenuItemRequestModel, MenuComponent> {
    @Override
    public MenuComponent mapFrom(MenuItemRequestModel requestModel){
        var title = new TextBlock(requestModel.getTitle());
        var subTitle = new TextBlock(requestModel.getSubTitle());
        var specialNote = new TextBlock(requestModel.getSpecialNote());

        var currencyCode = CurrencyCode.valueOf(requestModel.getCurrencyCode());
        var discount = requestModel.getDiscountedPrice();
        var price = Price.of(requestModel.getPrice(), discount, currencyCode);

        return new MenuItem(title, subTitle, specialNote, price);
    }
}
