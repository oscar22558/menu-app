package com.oscar.menuapp.display.domain.model;

import lombok.Value;

@Value
public class DBModelId {
    long id;
    boolean isEmpty;

    public DBModelId(long id){
        this.id = id;
        this.isEmpty = false;
    }

    public DBModelId(){
        this.id = 0;
        this.isEmpty = true;
    }

    public long getId(){
        if(isEmpty)
            throw new NullPointerException();
        return id;
    }

    public boolean isPresent(){
        return !this.isEmpty();
    }
}
