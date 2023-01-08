package com.oscar.menuapp.menu.domain.exception;

import com.oscar.menuapp.common.exception.AppException;

public class TimeslotStartEndTimeInvalidException extends AppException {
    public static final String TIMESLOT_START_END_INVALID = "TIMESLOT_START_END_INVALID";

    @Override
    public String getErrorCode() {
        return TIMESLOT_START_END_INVALID;
    }

    @Override
    public String getMessage() {
        return "Timeslot start time should before or equal end time.";
    }
}
