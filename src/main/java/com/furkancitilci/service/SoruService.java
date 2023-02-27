package com.furkancitilci.service;

import com.furkancitilci.dto.request.SoruOlusturRequestDto;
import com.furkancitilci.mapper.ISoruMapper;
import com.furkancitilci.repository.ISoruRepository;
import com.furkancitilci.repository.entity.Soru;
import com.furkancitilci.utility.ServiceManager;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SoruService extends ServiceManager<Soru,Long> {

    private final ISoruRepository soruRepository;

    public SoruService(ISoruRepository soruRepository){
        super(soruRepository);
        this.soruRepository=soruRepository;
    }

    public void soruOlustur(SoruOlusturRequestDto dto) {

        save(ISoruMapper.INSTANCE.toSoruOlustur(dto));
    }

    public Optional<Soru> findByDogruCevap(String cevap) {
        return soruRepository.findByDogrucevap(cevap);
    }
}
