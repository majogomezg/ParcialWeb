package com.example.demo.service;

import com.example.demo.entity.Biblioteca;
import com.example.demo.repository.BibliotecaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BibliotecaService {

    private final BibliotecaRepository bibliotecaRepository;

    @Autowired
    public BibliotecaService(BibliotecaRepository bibliotecaRepository) {
        this.bibliotecaRepository = bibliotecaRepository;
    }

    public List<Biblioteca> findAll() {
        return bibliotecaRepository.findAll();
    }

    public Optional<Biblioteca> findById(Long id) {
        return bibliotecaRepository.findById(id);
    }

    public Biblioteca save(Biblioteca biblioteca) {
        return bibliotecaRepository.save(biblioteca);
    }

    public void deleteById(Long id) {
        bibliotecaRepository.deleteById(id);
    }

    //método 
}
