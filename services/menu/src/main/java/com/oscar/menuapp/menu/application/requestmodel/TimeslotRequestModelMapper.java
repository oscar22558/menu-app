package com.oscar.menuapp.menu.application.requestmodel;

import com.oscar.menuapp.common.application.RequestModelMapper;
import com.oscar.menuapp.menu.domain.model.Timeslot;

public class TimeslotRequestModelMapper implements RequestModelMapper<TimeslotRequestModel, Timeslot> {
    public Timeslot mapFrom(TimeslotRequestModel requestModel){
        return new Timeslot(requestModel.getStart(), requestModel.getEnd());
    }
}
