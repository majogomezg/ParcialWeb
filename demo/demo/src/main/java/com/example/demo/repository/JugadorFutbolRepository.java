package com.example.demo.repository;

import com.example.demo.entity.JugadorFutbol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JugadorFutbolRepository extends JpaRepository<JugadorFutbol, Long> {
    // Métodos 
}