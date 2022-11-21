package com.oscar.menuapp.features.models.menu;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.sql.Timestamp;

@Getter
@AllArgsConstructor
public class DateRange {
    private Timestamp startAt;
    private Timestamp endAt;
}