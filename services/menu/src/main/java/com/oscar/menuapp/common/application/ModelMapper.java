package com.oscar.menuapp.common.application;

import java.util.Collection;

public interface ModelMapper<I, O> {
    O mapFrom(I input);
    default Collection<O> mapFrom(Collection<I> inputList){
        return inputList.stream().map(this::mapFrom).toList();
    }
}
