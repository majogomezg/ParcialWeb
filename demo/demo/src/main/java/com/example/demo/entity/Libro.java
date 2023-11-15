package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.FetchType;
import java.io.Serializable;

@Entity
@Table(name = "libro")
public class Libro implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    private String autor;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "biblioteca_id", referencedColumnName = "id")
    private Biblioteca biblioteca;

    
    // Getters y setters para cada atributo
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Biblioteca getBiblioteca() {
        return biblioteca;
    }

    public void setBiblioteca(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
    }

    // toString, si necesitas imprimir los detalles del objeto en algún momento
    @Override
    public String toString() {
        return "Libro{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", autor='" + autor + '\'' +
                ", biblioteca=" + (biblioteca != null ? biblioteca.getNombre() : "null") +
                '}';
    }
}