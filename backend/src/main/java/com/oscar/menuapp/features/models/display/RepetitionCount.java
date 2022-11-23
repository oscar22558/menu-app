package com.oscar.menuapp.features.models.display;

import com.oscar.menuapp.features.exceptions.NegativeValueException;
import lombok.Value;

@Value
public class RepetitionCount {
    int value;

    public RepetitionCount(int value) {
        if(value < 0)
            throw new NegativeValueException();
        this.value = value;
    }
}
