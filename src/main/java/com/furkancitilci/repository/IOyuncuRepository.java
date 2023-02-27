package com.furkancitilci.repository;

import com.furkancitilci.repository.entity.Oyuncu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IOyuncuRepository extends JpaRepository<Oyuncu,Long> {
}
