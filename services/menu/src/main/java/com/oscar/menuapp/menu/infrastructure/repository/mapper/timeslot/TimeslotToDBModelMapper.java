package com.oscar.menuapp.menu.infrastructure.repository.mapper.timeslot;

import com.oscar.menuapp.common.application.ModelMapper;
import com.oscar.menuapp.menu.infrastructure.repository.entity.Timeslot;

import java.util.List;

public class TimeslotToDBModelMapper implements ModelMapper<com.oscar.menuapp.menu.domain.model.Timeslot, Timeslot> {
    public Timeslot mapFrom(com.oscar.menuapp.menu.domain.model.Timeslot domainModel){
        return new Timeslot(domainModel.getStartAt(), domainModel.getEndAt());
    }
}
