package com.furkancitilci.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

import static org.springframework.http.HttpStatus.BAD_REQUEST;
import static org.springframework.http.HttpStatus.INTERNAL_SERVER_ERROR;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public enum ErrorType {

    BAD_REQUEST_ERROR(1201,"Geçersiz Parametre Girişi Yaptınız",BAD_REQUEST),
    INTERNAL_ERROR(3000,"Sunucuda Beklenemeyen Hata",INTERNAL_SERVER_ERROR),
    VERI_BULUNAMADI(2301,"Aradığınız id ye Veri Bulunamadı",INTERNAL_SERVER_ERROR);


    private int code;
    private String message;
    private HttpStatus httpStatus;
}
