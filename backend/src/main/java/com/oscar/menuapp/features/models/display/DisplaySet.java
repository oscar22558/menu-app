package com.oscar.menuapp.features.models.display;

import lombok.Value;

import java.util.List;
import java.util.Objects;

@Value
public class DisplaySet {
    RepetitionConfig repetitionConfig;
    List<DisplaySlot> displaySlots;

    public DisplaySet(RepetitionConfig repetitionConfig, List<DisplaySlot> displaySlots) {
        Objects.requireNonNull(repetitionConfig);
        Objects.requireNonNull(displaySlots);
        this.repetitionConfig = repetitionConfig;
        this.displaySlots = displaySlots;
    }
}
