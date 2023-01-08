package com.oscar.menuapp.display.domain.model.display;

import com.oscar.menuapp.common.exception.InvalidRepetitionDateRangeException;
import com.oscar.menuapp.common.helper.DateTimeHelper;
import com.oscar.menuapp.display.domain.model.DateRange;
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
