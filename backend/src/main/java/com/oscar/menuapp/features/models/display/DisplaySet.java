package com.oscar.menuapp.features.models.display;

import com.oscar.menuapp.features.exceptions.TimeSlotOverlapException;
import com.oscar.menuapp.features.models.DBModelId;
import lombok.Value;

import java.sql.Timestamp;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Value
public class DisplaySet {
    DBModelId id;
    RepetitionConfig repetitionConfig;
    List<DisplaySlot> displaySlots;

    public DisplaySet(DBModelId id, RepetitionConfig repetitionConfig, List<DisplaySlot> displaySlots) {
        Objects.requireNonNull(id);
        Objects.requireNonNull(repetitionConfig);
        Objects.requireNonNull(displaySlots);
        this.id = id;
        this.repetitionConfig = repetitionConfig;
        this.displaySlots = displaySlots;
    }

    public void addDisplaySlot(DisplaySlot displaySlot){
        int slotCount = displaySlots.size();
        Optional<Timestamp> lastSlot = Optional.ofNullable(
                slotCount > 0 ? displaySlots.get(slotCount - 1) : null
        ).flatMap(value->
                Optional.of(value.getTimeSlot().getDateRange().getEndAt())
        );
        long newSlotEndAt = displaySlot.getTimeSlot().getEndAtInMilliSec();

        boolean cannotAddNewSlot = lastSlot.isPresent() && lastSlot.get().getTime() > newSlotEndAt;
        if(cannotAddNewSlot){
            throw new TimeSlotOverlapException();
        }
        displaySlots.add(displaySlot);
    }
}
