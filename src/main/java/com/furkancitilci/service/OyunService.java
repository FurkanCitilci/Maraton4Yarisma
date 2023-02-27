package com.furkancitilci.service;

import com.furkancitilci.repository.IOyunRepository;
import com.furkancitilci.repository.entity.Oyun;
import com.furkancitilci.utility.ServiceManager;
import org.springframework.stereotype.Service;

@Service
public class OyunService extends ServiceManager<Oyun,Long> {

    private final IOyunRepository oyunRepository;

    public OyunService(IOyunRepository oyunRepository){
        super(oyunRepository);
        this.oyunRepository=oyunRepository;

    }
}
