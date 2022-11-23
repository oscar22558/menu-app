package com.oscar.menuapp.features.models.display;

import com.oscar.menuapp.features.exceptions.NegativeValueException;
import lombok.Value;

@Value
public class RepetitionPeriod {
    int value;

    public RepetitionPeriod(int value) {
        if(value < 0)
            throw new NegativeValueException();
        this.value = value;
    }
}
