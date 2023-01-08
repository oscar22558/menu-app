package com.oscar.menuapp.menu.application.viewmodel;

import lombok.Value;

import java.util.ArrayList;
import java.util.List;

@Value
public class MenuViewModel {
    String localeCode;
    String title;
    String subTitle;
    String specialNote;
    String currencyCode;
    float price;
    float discountedPrice;
    List<MenuItemViewModel> items;
    List<MenuViewModel> subMenu;
    List<TimeslotViewModel> availableTimeslots;
}