package com.oscar.menuapp.menu.infrastructure.repository.mapper;

import com.oscar.menuapp.common.application.ModelMapper;
import com.oscar.menuapp.menu.domain.model.Locale;
import com.oscar.menuapp.menu.domain.model.LocaleCode;

public class LocaleFromMenuDBModelMapper implements ModelMapper<String, Locale> {
    @Override
    public Locale mapFrom(String input) {
        var localeCode = LocaleCode.valueOf(input);
        return new Locale(localeCode);
    }
}
