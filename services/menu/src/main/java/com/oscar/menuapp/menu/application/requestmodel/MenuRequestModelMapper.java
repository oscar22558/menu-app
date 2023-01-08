package com.oscar.menuapp.menu.application.requestmodel;

import com.oscar.menuapp.common.application.RequestModelMapper;
import com.oscar.menuapp.display.domain.model.DBModelId;
import com.oscar.menuapp.menu.domain.model.*;

public class MenuRequestModelMapper implements RequestModelMapper<MenuRequestModel, MenuComponent> {
    public MenuComponent mapFrom(MenuRequestModel requestModel){
        var emptyDBModelId = new DBModelId();
        var localeCode = LocaleCode.valueOf(requestModel.getLocaleCode());
        var locale = new Locale(localeCode);

        var title = new TextBlock(requestModel.getTitle());
        var subTitle = new TextBlock(requestModel.getSubTitle());
        var specialNote = new TextBlock(requestModel.getSpecialNote());

        var currencyCode = CurrencyCode.valueOf(requestModel.getCurrencyCode());
        var currency = new Currency(currencyCode);
        var discount = new Discount(requestModel.getDiscountedPrice());
        var price = new Price(requestModel.getPrice(), discount, currency);

        var timeslots = new TimeslotRequestModelMapper()
                .mapFrom(requestModel.getAvailableTimeslots())
                .stream()
                .toList();
        var availableTime = new AvailableTime(timeslots);
        var items = new MenuItemRequestModelMapper()
                .mapFrom(requestModel.getMenuItems())
                .stream()
                .toList();

       return new Menu(emptyDBModelId, locale, title, subTitle, specialNote, price, availableTime, items);
    }
}
