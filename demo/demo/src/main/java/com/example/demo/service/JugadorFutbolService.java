package com.example.demo.service;

import com.example.demo.entity.JugadorFutbol;
import com.example.demo.repository.JugadorFutbolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JugadorFutbolService {

    private final JugadorFutbolRepository jugadorFutbolRepository;

    @Autowired
    public JugadorFutbolService(JugadorFutbolRepository jugadorFutbolRepository) {
        this.jugadorFutbolRepository = jugadorFutbolRepository;
    }

    public List<JugadorFutbol> findAll() {
        return jugadorFutbolRepository.findAll();
    }

    public Optional<JugadorFutbol> findById(Long id) {
        return jugadorFutbolRepository.findById(id);
    }

    public JugadorFutbol save(JugadorFutbol jugadorFutbol) {
        return jugadorFutbolRepository.save(jugadorFutbol);
    }

    public void deleteById(Long id) {
        jugadorFutbolRepository.deleteById(id);
    }

    // métodos
}
