package com.oscar.menuapp.menu.unittest.domain.model;

import com.oscar.menuapp.menu.domain.model.LocalCode;
import com.oscar.menuapp.menu.domain.model.Locale;
import com.oscar.menuapp.menu.domain.model.MenuItem;
import com.oscar.menuapp.menu.domain.model.Title;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class MenuItemTest {

    @Test
    public void testGivenUserHasMenuItemDataWhenUserCreatesMenuItemsThenMenuItemsAreCreated(){
        var locale = new Locale(LocalCode.en);
        var title = new Title("Baked Cheese and Fish Fillet Rice", locale);
        float price = 12.0f;
        float discount = 0.2f;
        new MenuItem(title, price, discount);
    }
}
