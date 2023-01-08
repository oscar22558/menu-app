package com.oscar.menuapp.common.exception;

public class AppException extends RuntimeException{
    private String errorCode;

    public String getErrorCode(){
        return errorCode;
    }
}
