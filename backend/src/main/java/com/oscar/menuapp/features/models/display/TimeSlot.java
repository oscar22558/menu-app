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

    public long getStartAtInMilliSec(){
        return dateRange.getStartAt().getTime();
    }

    public long getEndAtInMilliSec(){
        return dateRange.getEndAt().getTime();
    }

    public boolean isInclude(Timestamp timestamp){
        return getStartAtInMilliSec() <= timestamp.getTime() && timestamp.getTime() <= getEndAtInMilliSec();
    }

    public boolean isOverlapWith(TimeSlot other){
        return isInclude(other.getDateRange().getStartAt())
                || isInclude(other.getDateRange().getEndAt());
    }
}
