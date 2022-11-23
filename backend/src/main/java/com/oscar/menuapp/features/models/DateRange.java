package com.oscar.menuapp.features.models;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.sql.Timestamp;
import java.util.Objects;

@Getter
@AllArgsConstructor
public class DateRange {
    private Timestamp startAt;
    private Timestamp endAt;

    public DateRange(Timestamp startAt, Timestamp endAt) {
        Objects.requireNonNull(startAt);
        Objects.requireNonNull(endAt);
        this.startAt = startAt;
        this.endAt = endAt;
    }
}