package com.oscar.menuapp.menu.domain.model;


import com.oscar.menuapp.menu.domain.exception.TimeslotStartEndTimeInvalidException;
import lombok.Value;

import java.sql.Timestamp;
import java.util.Objects;

@Value
public class Timeslot {
    Timestamp startAt;
    Timestamp endAt;

    public Timeslot(Timestamp startAt, Timestamp endAt) {
        Objects.requireNonNull(startAt);
        Objects.requireNonNull(endAt);
        if(startAt.after(endAt))
            throw new TimeslotStartEndTimeInvalidException();
        this.startAt = startAt;
        this.endAt = endAt;
    }
}
