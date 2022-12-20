package com.oscar.menuapp.common.infrastructure;

import org.springframework.http.ResponseEntity;

public class HttpOkResponseBuilder<S> extends HttpResponseBuilder<S>{
    public HttpOkResponseBuilder(S viewModel) {
        super(viewModel);
    }

    @Override
    public ResponseEntity<S> buildResponse() {
        return ResponseEntity.ok(viewModel);
    }
}
