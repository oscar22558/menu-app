package com.oscar.menuapp.display.domain.model.display;

import com.oscar.menuapp.display.domain.model.DBModelId;
import com.oscar.menuapp.menu.domain.model.MenuComponent;
import lombok.Value;

@Value
public class DisplaySlot {
    DBModelId id;
    TimeSlot timeSlot;
    MenuComponent menuComponent;
}
