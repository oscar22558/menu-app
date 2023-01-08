package com.oscar.menuapp.menu.infrastructure.repository.mapper.menu;

import com.oscar.menuapp.common.application.ModelMapper;
import com.oscar.menuapp.display.domain.model.DBModelId;
import com.oscar.menuapp.menu.domain.model.AvailableTime;
import com.oscar.menuapp.menu.domain.model.Menu;
import com.oscar.menuapp.menu.domain.model.MenuComponent;
import com.oscar.menuapp.menu.domain.model.TextBlock;
import com.oscar.menuapp.menu.infrastructure.repository.mapper.LocaleFromMenuDBModelMapper;
import com.oscar.menuapp.menu.infrastructure.repository.mapper.PriceFromDBModelMapper;
import com.oscar.menuapp.menu.infrastructure.repository.mapper.timeslot.TimeslotFromDbModelMapper;

public class MenuFromDBModelMapper implements ModelMapper<com.oscar.menuapp.menu.infrastructure.repository.entity.Menu, MenuComponent> {

    public MenuComponent mapFrom(com.oscar.menuapp.menu.infrastructure.repository.entity.Menu dbModel){
        var id = new DBModelId(dbModel.getId());
        var title = new TextBlock(dbModel.getTitle());
        var subTitle = new TextBlock(dbModel.getSubTitle());
        var specialNote = new TextBlock(dbModel.getSpecialNote());
        var price = new PriceFromDBModelMapper().mapFrom(
                dbModel.getDiscount(), dbModel.getCurrencyCode(), dbModel.getPrice()
        );
        var availableTimes = new TimeslotFromDbModelMapper()
                .mapFrom(dbModel.getAvailableTimes())
                .stream().toList();
        var locale = new LocaleFromMenuDBModelMapper()
                .mapFrom(dbModel.getLocaleCode());

        return new Menu(id, locale, title, subTitle, specialNote, price, new AvailableTime(availableTimes));
    }


}
