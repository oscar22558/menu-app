package com.oscar.menuapp.menu.application.requestmodel;

import lombok.Value;

import java.util.List;

@Value
public class MenuRequestModel {
    String localeCode;
    String title;
    String subTitle;
    String specialNote;
    List<TimeslotRequestModel> availableTimeslots;
    String currencyCode;
    float price;
    float discountedPrice;
    List<MenuItemRequestModel> menuItems;

}
