package com.oscar.menuapp.menu.application.viewmodel;

import lombok.Value;

import java.sql.Timestamp;

@Value
public class TimeslotViewModel {
    Timestamp start;
    Timestamp end;
}
