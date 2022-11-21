package com.oscar.menuapp.features.models.menu;

import lombok.Value;
import org.springframework.cglib.core.Local;

@Value
public class MenuName {
    String name;
    Locale locale;
}
