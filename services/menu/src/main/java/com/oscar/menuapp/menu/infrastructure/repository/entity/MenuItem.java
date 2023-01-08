package com.oscar.menuapp.menu.infrastructure.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DocumentReference;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MenuItem {
    @Id
    Long id;
    String title;
    String subTitle;
    String specialNote;
    float price;
    float discount;
    String currencyCode;

    @DocumentReference(lazy = true)
    @Field("menu_id")
    Menu menu;

    public MenuItem(Long id, String title, String subTitle, String specialNote, float price, float discount, String currencyCode) {
        this(id, title, subTitle, specialNote, price, discount, currencyCode, null);
    }

    public MenuItem(String title, String subTitle, String specialNote, float price, float discount, String currencyCode) {
        this(null, title, subTitle, specialNote, price, discount, currencyCode, null);
    }
}
