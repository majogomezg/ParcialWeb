package com.example.demo.controller;

import com.example.demo.dto.EquipoFutbolDTO;
import com.example.demo.service.EquipoFutbolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/equipos")
public class EquipoFutbolController {

    private final EquipoFutbolService equipoFutbolService;

    @Autowired
    public EquipoFutbolController(EquipoFutbolService equipoFutbolService) {
        this.equipoFutbolService = equipoFutbolService;
    }

    @GetMapping
    public ResponseEntity<List<EquipoFutbolDTO>> getAllEquipos() {
        // Implementar la lógica para convertir entidades a DTOs
        // List<EquipoFutbolDTO> equipos = ...
        return ResponseEntity.ok().body(equipos);
    }

    @GetMapping("/{id}")
    public ResponseEntity<EquipoFutbolDTO> getEquipoById(@PathVariable Long id) {
        // Implementar la lógica para obtener el equipo y convertirlo a DTO
        // EquipoFutbolDTO equipo = ...
        return ResponseEntity.ok().body(equipo);
    }

    @PostMapping
    public ResponseEntity<EquipoFutbolDTO> createEquipo(@RequestBody EquipoFutbolDTO equipoFutbolDTO) {
        // Implementar la lógica para crear un equipo y convertirlo a DTO
        // EquipoFutbolDTO nuevoEquipo = ...
        return ResponseEntity.ok().body(nuevoEquipo);
    }

    @PutMapping("/{id}")
    public ResponseEntity<EquipoFutbolDTO> updateEquipo(@PathVariable Long id, @RequestBody EquipoFutbolDTO equipoFutbolDTO) {
    } 
}