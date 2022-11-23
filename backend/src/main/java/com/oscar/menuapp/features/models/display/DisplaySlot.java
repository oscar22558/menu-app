package com.oscar.menuapp.features.models.display;

import lombok.Value;

import java.util.Objects;

@Value
public class DisplaySlot {
    TimeSlot timeSlot;
    Sequence sequence;

    public DisplaySlot(TimeSlot timeSlot, Sequence sequence) {
        Objects.requireNonNull(timeSlot);
        Objects.requireNonNull(sequence);
        this.timeSlot = timeSlot;
        this.sequence = sequence;
    }
}
