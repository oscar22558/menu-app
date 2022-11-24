package com.oscar.menuapp.features.helpers;

import java.sql.Timestamp;

public class DateTimeHelper {
    public static Timestamp now(){
        return new Timestamp(System.currentTimeMillis());
    }
}
