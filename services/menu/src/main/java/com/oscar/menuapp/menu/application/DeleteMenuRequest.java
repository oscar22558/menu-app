package com.oscar.menuapp.menu.application;

import com.oscar.menuapp.display.domain.model.DBModelId;
import lombok.Value;

@Value
public class DeleteMenuRequest {
    DBModelId menuId;
}
