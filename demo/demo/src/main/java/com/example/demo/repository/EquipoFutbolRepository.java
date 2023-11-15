package com.example.demo.repository;

import com.example.demo.entity.EquipoFutbol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EquipoFutbolRepository extends JpaRepository<EquipoFutbol, Long> {
    //métodos 
}