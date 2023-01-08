package com.oscar.menuapp.common.infrastructure;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class HttpCreatedResponseBuilder<S> extends HttpResponseBuilder<S>{
    public HttpCreatedResponseBuilder(S viewModel) {
        super(viewModel);
    }

    @Override
    public ResponseEntity<S> buildResponse() {
        return ResponseEntity.status(HttpStatus.CREATED).body(viewModel);
    }
}
