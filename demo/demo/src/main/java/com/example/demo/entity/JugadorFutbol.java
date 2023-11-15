
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
@Table(name = "jugador_futbol")
public class JugadorFutbol implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombres;

    private String apellidos;

    private Integer numero;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "equipo_id", referencedColumnName = "id")
    private EquipoFutbol equipo;

    // Getters y setters para cada atributo
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public EquipoFutbol getEquipo() {
        return equipo;
    }

    public void setEquipo(EquipoFutbol equipo) {
        this.equipo = equipo;
    }

    // Imprimir los detalles del objeto
    @Override
    public String toString() {
        return "JugadorFutbol{" +
                "id=" + id +
                ", nombres='" + nombres + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", numero=" + numero +
                ", equipo=" + (equipo != null ? equipo.getNombre() : "null") +
                '}';
    }
}

