package com.oscar.menuapp.features.models.display;

import com.oscar.menuapp.features.models.DBModelId;
import com.oscar.menuapp.features.models.menu.MenuComponent;
import lombok.Value;

import java.util.Objects;

@Value
public class DisplaySlot {
    DBModelId id;
    TimeSlot timeSlot;
    MenuComponent menuComponent;
}
