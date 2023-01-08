package com.oscar.menuapp.menu.infrastructure.repository.mapper;

import com.oscar.menuapp.menu.domain.model.Currency;
import com.oscar.menuapp.menu.domain.model.CurrencyCode;
import com.oscar.menuapp.menu.domain.model.Discount;
import com.oscar.menuapp.menu.domain.model.Price;

public class PriceFromDBModelMapper {
    public Price mapFrom(float discount, String currencyCode, float basePrice) {
        var discountModel = new Discount(discount);
        var currencyCodeModel = CurrencyCode.valueOf(currencyCode);
        var currency = new Currency(currencyCodeModel);
        return new Price(basePrice, discountModel, currency);
    }
}
