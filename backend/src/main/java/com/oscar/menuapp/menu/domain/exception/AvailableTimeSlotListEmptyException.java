package com.oscar.menuapp.menu.domain.exception;

import com.oscar.menuapp.common.exception.AppException;

public class AvailableTimeSlotListEmptyException extends AppException {
    public static final String EMPTY_TIME_SLOT_LIST_EMPTY = "EMPTY_TIME_SLOT_LIST_EMPTY";
    public String getErrorCode(){
       return EMPTY_TIME_SLOT_LIST_EMPTY;
    }
}
