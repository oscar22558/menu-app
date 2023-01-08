package com.oscar.menuapp.menu.infrastructure.repository.mapper.menuitem;

import com.oscar.menuapp.common.application.ModelMapper;
import com.oscar.menuapp.menu.domain.model.MenuComponent;
import com.oscar.menuapp.menu.infrastructure.repository.entity.MenuItem;
import com.oscar.menuapp.menu.infrastructure.repository.mapper.timeslot.TimeslotToDBModelMapper;

public class MenuItemToDBModelMapper implements ModelMapper<MenuComponent, MenuItem> {

   public MenuItem mapFrom(MenuComponent domainModel){
       Long id = domainModel.getId().isPresent() ? domainModel.getId().getId() : null;
       var title = domainModel.getTitle().getContent();
       var subtitle = domainModel.getSubTitle().getContent();
       var specialNote = domainModel.getSpecialNote().getContent();
       var price = domainModel.getPrice().getBasePrice();
       var discount = domainModel.getPrice().getDiscount().getValue();
       var currencyCode = domainModel.getPrice().getCurrency().getCode().name();

       return new MenuItem(id, title, subtitle, specialNote, price, discount, currencyCode);
   }
}
