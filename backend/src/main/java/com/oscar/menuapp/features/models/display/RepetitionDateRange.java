package com.oscar.menuapp.features.models.display;

import com.oscar.menuapp.features.exceptions.InvalidRepetitionDateRangeException;
import com.oscar.menuapp.features.helpers.DateTimeHelper;
import com.oscar.menuapp.features.models.DateRange;
import lombok.Value;

import java.sql.Timestamp;

@Value
public class RepetitionDateRange {
    DateRange dateRange;

    public RepetitionDateRange(Timestamp startAt, Timestamp endAt){
        Timestamp now = DateTimeHelper.now();
        if(startAt.before(now))
            throw new InvalidRepetitionDateRangeException();
        this.dateRange = new DateRange(startAt, endAt);
    }
}
