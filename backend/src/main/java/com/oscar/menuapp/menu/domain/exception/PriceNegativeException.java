package com.oscar.menuapp.menu.domain.exception;

import lombok.Getter;

@Getter
public class PriceNegativeException extends RuntimeException{
   public static final String NEGATIVE = "PRICE_NEGATIVE";

    public String getErrorCode() {
        return NEGATIVE;
    }

    public String getMessage(){
        return "Price should not be negative.";
    }
}
