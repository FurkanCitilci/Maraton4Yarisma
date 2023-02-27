package com.furkancitilci.exception;

import lombok.Getter;

@Getter
public class YarismaException extends RuntimeException {

    private final ErrorType errorType;

    public YarismaException(ErrorType errorType){
        super(errorType.getMessage());
        this.errorType=errorType;
    }

    public YarismaException(ErrorType errorType, String message){
        super(message);
        this.errorType=errorType;
    }

}
