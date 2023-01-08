package com.oscar.menuapp.menu.application.viewmodel;

import com.oscar.menuapp.common.application.ViewModelMapper;
import com.oscar.menuapp.menu.domain.model.Timeslot;

public class TimeslotViewModelMapper implements ViewModelMapper<Timeslot, TimeslotViewModel> {
    @Override
    public TimeslotViewModel mapFrom(Timeslot appModel){
        return new TimeslotViewModel(appModel.getStartAt(), appModel.getEndAt());
    }
}
