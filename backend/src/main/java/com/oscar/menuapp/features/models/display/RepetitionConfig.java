package com.oscar.menuapp.features.models.display;

import lombok.Value;

@Value
public class RepetitionConfig {
    RepetitionCount count;
    RepetitionDateRange dateRange;
    RepetitionMode mode;
    RepetitionPeriod period;
}
