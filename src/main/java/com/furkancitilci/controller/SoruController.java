package com.furkancitilci.controller;

import com.furkancitilci.dto.request.SoruOlusturRequestDto;
import com.furkancitilci.dto.response.ResultDto;
import com.furkancitilci.exception.ErrorType;
import com.furkancitilci.exception.YarismaException;
import com.furkancitilci.repository.entity.Oyuncu;
import com.furkancitilci.repository.entity.Soru;
import com.furkancitilci.service.SoruService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

import static com.furkancitilci.constants.RestEndPoints.*;

@RestController
@RequestMapping(VERSION+API+SORU)
@RequiredArgsConstructor
public class SoruController {

    private final SoruService soruService;

    @PostMapping(SORUOLUSTUR)
    @CrossOrigin(origins = "*")
    public ResponseEntity<ResultDto> soruOlustur(@RequestBody SoruOlusturRequestDto dto){

        soruService.soruOlustur(dto);
        return ResponseEntity.ok(ResultDto.builder().state(true).build());
    }

    @GetMapping(SORUGETIR)
    public ResponseEntity<Soru> getById(Long soruid){

        //id ye göre oyuncuya soru getiriyorum.
        Optional<Soru> soru = soruService.findById(soruid);
        if (soru.isEmpty()) throw new YarismaException(ErrorType.VERI_BULUNAMADI);
        return ResponseEntity.ok(soru.get());

    }

    @GetMapping(CEVAPVER)
    public ResponseEntity<Soru> cevapver(String cevap){

        //cevap alıyorum doğru cevaba gönderiyorum
        Optional<Soru> soru = soruService.findByDogruCevap(cevap);

        if (soru.isEmpty()) throw new YarismaException(ErrorType.VERI_BULUNAMADI);
        return ResponseEntity.ok(soru.get());

    }
}
