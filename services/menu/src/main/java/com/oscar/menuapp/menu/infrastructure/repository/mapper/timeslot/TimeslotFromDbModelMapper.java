package com.oscar.menuapp.menu.infrastructure.repository.mapper.timeslot;

import com.oscar.menuapp.common.application.ModelMapper;
import com.oscar.menuapp.menu.domain.model.Timeslot;

public class TimeslotFromDbModelMapper implements ModelMapper<com.oscar.menuapp.menu.infrastructure.repository.entity.Timeslot, Timeslot> {
    public Timeslot mapFrom(com.oscar.menuapp.menu.infrastructure.repository.entity.Timeslot dbEntity){
        return new Timeslot(dbEntity.getStartAt(), dbEntity.getEndAt());
    }
}
