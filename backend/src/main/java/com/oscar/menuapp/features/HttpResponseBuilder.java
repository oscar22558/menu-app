package com.oscar.menuapp.features;


import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;

@AllArgsConstructor
public abstract class HttpResponseBuilder<S> {
    protected S viewModel;

    public abstract ResponseEntity<S> buildResponse();
}
