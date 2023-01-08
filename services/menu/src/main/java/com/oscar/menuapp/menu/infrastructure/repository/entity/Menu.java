package com.oscar.menuapp.menu.infrastructure.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.ReadOnlyProperty;
import org.springframework.data.mongodb.core.mapping.DocumentReference;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Menu {
    @Id
    Long id;
    String title;
    String subTitle;
    String specialNote;
    float price;
    float discount;
    String localeCode;
    String currencyCode;
    List<Timeslot> availableTimes;

    @ReadOnlyProperty
    @DocumentReference(lookup = "{'menu_id':?#{#self._id}}")
    List<MenuItem> menuItems;

    @ReadOnlyProperty
    @DocumentReference(lookup = "{'parent_id':?#{#self._id}}")
    List<Menu> subMenus;

    @Field("parent_id")
    @DocumentReference(lazy = true)
    Menu parent;

    public Menu(Long id, String title, String subTitle, String specialNote, float price, float discount, String localeCode, String currencyCode, List<Timeslot> availableTimes) {
        this(id, title, subTitle, specialNote, price, discount, localeCode, currencyCode, availableTimes, null, null, null);
    }

    public Menu(String title, String subTitle, String specialNote, float price, float discount, String localeCode, String currencyCode, List<Timeslot> availableTimes) {
        this(null, title, subTitle, specialNote, price, discount, localeCode, currencyCode, availableTimes, null, null, null);
    }
}
