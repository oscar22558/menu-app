package com.oscar.menuapp.menu.domain.exception;

import lombok.Getter;

@Getter
public class ItemPriceInvalidException extends RuntimeException{
   public static final String NON_POSITIVE = "NON_POSITIVE";

   private String errorCode;

    public ItemPriceInvalidException() {
        super();
        this.errorCode = NON_POSITIVE;
    }
}
