package com.furkancitilci.service;

import com.furkancitilci.repository.IKazananRepository;
import com.furkancitilci.repository.entity.Kazanan;
import com.furkancitilci.utility.ServiceManager;
import org.springframework.stereotype.Service;

@Service
public class KazananService extends ServiceManager<Kazanan,Long> {

    private final IKazananRepository kazananRepository;

    public KazananService(IKazananRepository kazananRepository){
        super(kazananRepository);
        this.kazananRepository=kazananRepository;
    }

}
