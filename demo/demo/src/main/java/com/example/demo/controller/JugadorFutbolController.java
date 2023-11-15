package com.example.demo.controller;

import com.example.demo.dto.JugadorFutbolDTO;
import com.example.demo.service.JugadorFutbolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/jugadores")
public class JugadorFutbolController {

    private final JugadorFutbolService jugadorFutbolService;

    @Autowired
    public JugadorFutbolController(JugadorFutbolService jugadorFutbolService) {
        this.jugadorFutbolService = jugadorFutbolService;
    }

     @GetMapping
    public ResponseEntity<List<JugadorFutbolDTO>> getAllJugadores() {
        // Implementar la lógica para convertir entidades a DTOs
        return ResponseEntity.ok().body(equipos);
    }

    @GetMapping("/{id}")
    public ResponseEntity<JugadorFutbolDTO> getJugadorById(@PathVariable Long id) {
        // Implementar la lógica para obtener el equipo y convertirlo a DTO
        return ResponseEntity.ok().body(equipo);
    }

    @PostMapping
    public ResponseEntity<JudarorFutbolDTO> createJugadores(@RequestBody EquipoFutbolDTO jugadorFutbolDTO) {
        // Implementar la lógica para crear un equipo y convertirlo a DTO
        return ResponseEntity.ok().body(nuevoEquipo);
    }

    @PutMapping("/{id}")
    public ResponseEntity<JugadorFutbolDTO> updateJugador(@PathVariable Long id, @RequestBody JugadorFutbolDTO jugadorFutbolDTO) {
    } 
}
