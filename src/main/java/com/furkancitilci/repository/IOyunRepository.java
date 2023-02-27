package com.furkancitilci.repository;

import com.furkancitilci.repository.entity.Oyun;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IOyunRepository extends JpaRepository<Oyun,Long> {
}
