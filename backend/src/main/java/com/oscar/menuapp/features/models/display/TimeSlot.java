package com.oscar.menuapp.features.models.display;

import com.oscar.menuapp.features.models.DateRange;
import lombok.Value;

import java.sql.Timestamp;

@Value
public class TimeSlot {
    DateRange dateRange;

    public TimeSlot(DateRange dateRange) {
        this.dateRange = dateRange;
    }

    public TimeSlot(Timestamp startAt, Timestamp endAt){
        this.dateRange = new DateRange(startAt, endAt);
    }
}
