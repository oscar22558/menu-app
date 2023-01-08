package com.oscar.menuapp.menu.unittest.domain.model;

import com.oscar.menuapp.menu.domain.exception.PriceNegativeException;
import com.oscar.menuapp.menu.domain.model.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class MenuItemTest {

    @Test
    public void testGivenUserHasMenuItemDataWhenUserCreatesMenuItemsThenMenuItemsAreCreated(){
        var titleString = "Baked Cheese and Fish Fillet Rice";
        var title = new TextBlock(titleString);
        var subTitle = new TextBlock("");
        var specialNote = new TextBlock("");
        var discount = new Discount(0.2f);
        Price price = new Price(12.0f, discount, new Currency(CurrencyCode.HKD));
        var menuItem = new MenuItem(title, subTitle, specialNote, price);

        assertEquals(menuItem.getTitle().getContent(), titleString, "Menu item title not match.");
        assertEquals(menuItem.getSubTitle().getContent(), "", "Menu item sub title not match.");
        assertEquals(menuItem.getSpecialNote().getContent(), "", "Menu item description not match.");
        assertEquals(menuItem.getPrice().getBasePrice(), 12.0f, "Menu item base price not match");
        assertEquals(menuItem.getPrice().getDiscountedPrice(), 12.0f*0.2f, "Menu item discounted price not match");
    }

}
