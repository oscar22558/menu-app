package com.oscar.menuapp.common.application;


public interface RequestModelMapper<R, A> extends ModelMapper<R, A>{
    A mapFrom(R requestModel);
}
