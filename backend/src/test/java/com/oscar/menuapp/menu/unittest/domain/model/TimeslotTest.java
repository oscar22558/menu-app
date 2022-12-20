package com.oscar.menuapp.menu.unittest.domain.model;

import com.oscar.menuapp.common.helper.DateTimeHelper;
import com.oscar.menuapp.menu.domain.exception.TimeslotStartEndTimeInvalidException;
import com.oscar.menuapp.menu.domain.model.Timeslot;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.sql.Timestamp;
import java.util.Calendar;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@ExtendWith(MockitoExtension.class)
public class TimeslotTest {
    @Test
    public void testWhenUserHasTimeslotDataWhenUserCreatesTimeslotThenTimeslotIsCreated(){
        var calendar = Calendar.getInstance();
        Timestamp start = DateTimeHelper.now();
        calendar.add(Calendar.HOUR, 1);
        Timestamp end = new Timestamp(calendar.getTimeInMillis());
        Timeslot timeslot = new Timeslot(start, end);

        assertEquals(start, timeslot.getStartAt(), "Start time not match.");
        assertEquals(end, timeslot.getEndAt(), "Start time not match.");
    }

    @Test
    public void testWhenUserHasInvalidTimeslotDataWhenUserCreatesTimeslotThenTimeslotIsCreated(){
        var calendar = Calendar.getInstance();
        Timestamp start = DateTimeHelper.now();
        calendar.add(Calendar.HOUR, -1);
        Timestamp end = new Timestamp(calendar.getTimeInMillis());
        assertThrows(TimeslotStartEndTimeInvalidException.class, ()->{
            new Timeslot(start, end);
        }, "Time slot start and end time invalid exception not thrown.");
    }
}
