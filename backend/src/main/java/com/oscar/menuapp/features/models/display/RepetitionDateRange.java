package com.oscar.menuapp.features.models.display;

import com.oscar.menuapp.features.models.DateRange;
import lombok.Value;

import java.sql.Timestamp;
import java.util.Objects;

@Value
public class RepetitionDateRange {
    DateRange dateRange;

    public RepetitionDateRange(DateRange dateRange) {
        this.dateRange = dateRange;
    }

    public RepetitionDateRange(Timestamp startAt, Timestamp endAt){
        this.dateRange = new DateRange(startAt, endAt);
    }
}
