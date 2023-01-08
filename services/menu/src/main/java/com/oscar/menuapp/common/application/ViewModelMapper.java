package com.oscar.menuapp.common.application;

public interface ViewModelMapper<A, V> extends ModelMapper<A, V> {
    V mapFrom(A appModel);
}
