package com.oscar.menuapp.display.domain.model.display;

import com.oscar.menuapp.common.exception.NegativeValueException;
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
