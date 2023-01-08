package com.oscar.menuapp.menu.domain.model;

import com.oscar.menuapp.menu.domain.exception.AvailableTimeSlotListEmptyException;
import com.oscar.menuapp.menu.domain.exception.TimeslotOverlapException;
import lombok.Value;

import java.sql.Timestamp;
import java.util.List;

@Value
public class AvailableTime {
    List<Timeslot> timeslots;

    public AvailableTime(List<Timeslot> timeslots){
        if(timeslots.size() == 0) throw new AvailableTimeSlotListEmptyException();

        Timestamp endTime = timeslots.get(0).getEndAt();

        for (Timeslot nextSlot : timeslots) {
            if (endTime.after(nextSlot.getStartAt()))
                throw new TimeslotOverlapException();
            endTime = nextSlot.getEndAt();
        }

        this.timeslots = timeslots;
    }
}
