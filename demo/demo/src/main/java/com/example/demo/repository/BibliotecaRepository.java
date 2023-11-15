package com.example.demo.repository;

import com.example.demo.entity.Biblioteca;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BibliotecaRepository extends JpaRepository<Biblioteca, Long> {
    // Métodos 
}
