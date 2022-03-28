package com.meli.obterdiploma.exception;

import com.meli.obterdiploma.model.ErrorDTO;
import lombok.Data;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class DiplomaException extends RuntimeException{
    private final ErrorDTO error;
    private final HttpStatus status;

    public DiplomaException(String message, HttpStatus status) {
        this.error = new ErrorDTO(this.getClass().getSimpleName(), message);
        this.status = status;
    }
}
