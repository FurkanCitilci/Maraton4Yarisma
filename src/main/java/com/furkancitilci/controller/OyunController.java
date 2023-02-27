package com.furkancitilci.controller;

import com.furkancitilci.service.OyunService;
import com.furkancitilci.service.OyuncuService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.furkancitilci.constants.RestEndPoints.*;

@RestController
@RequestMapping(VERSION+API+OYUN)
@RequiredArgsConstructor
public class OyunController {

    private final OyunService oyunService;





}
