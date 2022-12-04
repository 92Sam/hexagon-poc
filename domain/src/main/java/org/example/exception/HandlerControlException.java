package org.example.exception;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice
public class HandlerControlException extends ResponseEntityExceptionHandler {

    @ExceptionHandler(value = DataAccessException.class)
    public ResponseEntity<Object> handlerDataAccessException(final Exception ex, final WebRequest request) {
        return this.handleException(ex, request, HttpStatus.INTERNAL_SERVER_ERROR, ex.getMessage());
    }
    
    @ExceptionHandler(value = PriceNotFoundException.class)
    public ResponseEntity<Object> handlerPriceNotFoundException(final Exception ex, final WebRequest request) {
        return this.handleException(ex, request, HttpStatus.NOT_FOUND, ex.getMessage());
    }

    private ResponseEntity<Object> handleException(final Exception ex, final WebRequest request, final HttpStatus status, final String message) {
        return this.handleExceptionInternal(ex, message, new HttpHeaders(), status, request);
    }
}
