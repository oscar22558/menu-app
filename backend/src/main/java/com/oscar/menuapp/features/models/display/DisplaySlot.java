package com.oscar.menuapp.features.models.display;

import com.oscar.menuapp.features.models.DBModelId;
import lombok.Value;

import java.util.Objects;

@Value
public class DisplaySlot {
    DBModelId id;
    TimeSlot timeSlot;
    Sequence sequence;

    public DisplaySlot(DBModelId id, TimeSlot timeSlot, Sequence sequence) {
        Objects.requireNonNull(id);
        Objects.requireNonNull(timeSlot);
        Objects.requireNonNull(sequence);
        this.id = id;
        this.timeSlot = timeSlot;
        this.sequence = sequence;
    }
}
