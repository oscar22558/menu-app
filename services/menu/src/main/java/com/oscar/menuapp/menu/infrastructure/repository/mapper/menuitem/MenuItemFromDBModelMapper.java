package com.oscar.menuapp.menu.infrastructure.repository.mapper.menuitem;

import com.oscar.menuapp.common.application.ModelMapper;
import com.oscar.menuapp.display.domain.model.DBModelId;
import com.oscar.menuapp.menu.domain.model.*;
import com.oscar.menuapp.menu.infrastructure.repository.mapper.PriceFromDBModelMapper;

public class MenuItemFromDBModelMapper implements ModelMapper<com.oscar.menuapp.menu.infrastructure.repository.entity.MenuItem , MenuComponent> {

    public MenuComponent mapFrom(com.oscar.menuapp.menu.infrastructure.repository.entity.MenuItem dbEntity){
        var id = new DBModelId(dbEntity.getId());
        var title = new TextBlock(dbEntity.getTitle());
        var subTitle = new TextBlock(dbEntity.getSubTitle());
        var specialNote = new TextBlock(dbEntity.getSpecialNote());
        var price = new PriceFromDBModelMapper().mapFrom(
                dbEntity.getDiscount(), dbEntity.getCurrencyCode(), dbEntity.getPrice()
        );
        return new MenuItem(id, title, subTitle, specialNote, price);
    }
}
