package com.furkancitilci.repository;

import com.furkancitilci.repository.entity.Kazanan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IKazananRepository extends JpaRepository<Kazanan,Long> {
}
