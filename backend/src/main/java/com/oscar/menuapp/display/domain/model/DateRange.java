package com.oscar.menuapp.display.domain.model;

import lombok.Value;

import java.sql.Timestamp;
import java.util.Objects;

@Value
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