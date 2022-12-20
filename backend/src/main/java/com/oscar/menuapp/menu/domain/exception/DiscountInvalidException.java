package com.oscar.menuapp.menu.domain.exception;

import lombok.Getter;

@Getter
public class DiscountInvalidException extends RuntimeException{
    public static final String VALUE_OUT_OF_RANGE = "VALUE_OUT_OF_RANGE";

    private String errorCode;

    public DiscountInvalidException() {
        errorCode = VALUE_OUT_OF_RANGE;
    }
}
