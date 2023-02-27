package com.furkancitilci.service;

import com.furkancitilci.dto.request.LoginRequestDto;
import com.furkancitilci.dto.request.RegisterRequestDto;
import com.furkancitilci.mapper.IOyuncuMapper;
import com.furkancitilci.repository.IOyuncuRepository;
import com.furkancitilci.repository.entity.Oyuncu;
import com.furkancitilci.utility.ServiceManager;
import org.springframework.stereotype.Service;

@Service
public class OyuncuService extends ServiceManager<Oyuncu,Long> {

    private final IOyuncuRepository oyuncuRepository;

    public OyuncuService(IOyuncuRepository oyuncuRepository){
        super(oyuncuRepository);
        this.oyuncuRepository=oyuncuRepository;
    }


    public Boolean register(RegisterRequestDto dto) {
        save(IOyuncuMapper.INSTANCE.toOyuncu(dto));
        return true;
    }

}
