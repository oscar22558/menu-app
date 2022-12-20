package com.oscar.menuapp.display.domain.model.display;

import lombok.Value;

@Value
public class RepetitionConfig {
    RepetitionCount count;
    RepetitionDateRange dateRange;
    RepetitionMode mode;
    RepetitionPeriod period;
}
