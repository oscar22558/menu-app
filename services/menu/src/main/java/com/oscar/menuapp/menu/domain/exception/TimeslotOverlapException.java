package com.oscar.menuapp.menu.domain.exception;

import com.oscar.menuapp.common.exception.AppException;

public class TimeslotOverlapException extends AppException {
    public static final String TIMESLOT_OVERLAP = "TIMESLOT_OVERLAP";
    @Override
    public String getErrorCode() {
        return TIMESLOT_OVERLAP;
    }
}
