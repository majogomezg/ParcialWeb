package com.example.demo.service;

import com.example.demo.entity.EquipoFutbol;
import com.example.demo.repository.EquipoFutbolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EquipoFutbolService {

    private final EquipoFutbolRepository equipoFutbolRepository;

    @Autowired
    public EquipoFutbolService(EquipoFutbolRepository equipoFutbolRepository) {
        this.equipoFutbolRepository = equipoFutbolRepository;
    }

    public List<EquipoFutbol> findAll() {
        return equipoFutbolRepository.findAll();
    }

    public Optional<EquipoFutbol> findById(Long id) {
        return equipoFutbolRepository.findById(id);
    }

    public EquipoFutbol save(EquipoFutbol equipoFutbol) {
        return equipoFutbolRepository.save(equipoFutbol);
    }

    public void deleteById(Long id) {
        equipoFutbolRepository.deleteById(id);
    }

    // métodos
}
