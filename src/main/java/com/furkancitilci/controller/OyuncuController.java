package com.furkancitilci.controller;

import com.furkancitilci.dto.request.LoginRequestDto;
import com.furkancitilci.dto.request.RegisterRequestDto;
import com.furkancitilci.exception.ErrorType;
import com.furkancitilci.exception.YarismaException;
import com.furkancitilci.repository.entity.Oyuncu;
import com.furkancitilci.repository.entity.Soru;
import com.furkancitilci.service.OyuncuService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

import static com.furkancitilci.constants.RestEndPoints.*;

@RestController
@RequestMapping(VERSION+API+OYUNCU)
@RequiredArgsConstructor
public class OyuncuController {

    private final OyuncuService oyuncuService;


    @GetMapping(REGISTER)
    public ResponseEntity<Boolean> register(RegisterRequestDto dto){
        //OYUNCU SİSTEME KAYIT YAPIYOR
        return ResponseEntity.ok(oyuncuService.register(dto));
    }

    @GetMapping(FINDBYID)
    public ResponseEntity<Oyuncu> getById(Long oyuncuid){

        //id ye göre oyuncu getiriyorum
        //oyuncuya login yaptırıyorum
        Optional<Oyuncu> oyuncu = oyuncuService.findById(oyuncuid);
        if (oyuncu.isEmpty()) throw new YarismaException(ErrorType.VERI_BULUNAMADI);
        return ResponseEntity.ok(oyuncu.get());

    }
}
