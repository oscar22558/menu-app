package com.oscar.menuapp.menu.domain.exception;

import com.oscar.menuapp.common.exception.AppException;
import lombok.Getter;

@Getter
public class DiscountValueOutOfRangeException extends AppException {
    public static final String VALUE_OUT_OF_RANGE = "VALUE_OUT_OF_RANGE";

    public String getErrorCode() {
        return VALUE_OUT_OF_RANGE;
    }

    @Override
    public String getMessage() {
        return "Discount should be within [0, 1]";
    }
}
