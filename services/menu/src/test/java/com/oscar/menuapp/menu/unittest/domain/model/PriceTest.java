package com.oscar.menuapp.menu.unittest.domain.model;

import com.oscar.menuapp.menu.domain.exception.PriceNegativeException;
import com.oscar.menuapp.menu.domain.model.Currency;
import com.oscar.menuapp.menu.domain.model.CurrencyCode;
import com.oscar.menuapp.menu.domain.model.Discount;
import com.oscar.menuapp.menu.domain.model.Price;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@ExtendWith(MockitoExtension.class)
public class PriceTest {
    @Test
    public void testGivenUserHasPriceDataWhenUserCreatesPriceThenPriceIsCreated(){
        var currency = new Currency(CurrencyCode.HKD);
        var discount = new Discount(0.2f);
        var price = new Price(12.0f, discount, currency);

        assertEquals(price.getBasePrice(), 12.0f, "Price is not match.");
        assertEquals(price.getDiscount().getValue(), 0.2f, "Discounted is not match.");
        assertEquals(price.getDiscountedPrice(), 12.0f*0.2f, "Discounted price is not match.");
        assertEquals(price.getCurrency().getCode(), currency.getCode(), "Discounted price is not match.");

    }

    @Test
    public void testGivenUserHasNegativePriceDataWhenUserCreatesPriceThenExceptionIsThrown(){
        assertThrows(PriceNegativeException.class, ()->{
            var discount = new Discount(0.2f);
            new Price(-12.0f, discount, new Currency(CurrencyCode.HKD));
        }, "Price negative value exception is not thrown.");
    }
}
