package com.oscar.menuapp.menu.application.requestmodel;

import lombok.Value;

import java.sql.Timestamp;

@Value
public class TimeslotRequestModel {
    Timestamp start;
    Timestamp end;
}
