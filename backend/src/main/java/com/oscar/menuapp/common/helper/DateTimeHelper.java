package com.oscar.menuapp.common.helper;

import java.sql.Timestamp;

public class DateTimeHelper {
    public static Timestamp now(){
        return new Timestamp(System.currentTimeMillis());
    }
}
