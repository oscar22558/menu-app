package com.oscar.menuapp.menu.domain.model;

import com.oscar.menuapp.menu.domain.exception.PriceNegativeException;
import lombok.Value;

@Value
public class Price {
    float basePrice;
    Discount discount;
    Currency currency;

    public Price(float basePrice, Discount discount, Currency currency) {
        if(basePrice < 0f)
            throw new PriceNegativeException();
        this.basePrice = basePrice;
        this.discount = discount;
        this.currency = currency;
    }

    public float getDiscountedPrice(){
        return discount.offerDiscount(basePrice);
    }
    public static Price of(float basePrice, float discount, CurrencyCode currencyCode){
        return new Price(basePrice, new Discount(discount), new Currency(currencyCode));
    }
}
