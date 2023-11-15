package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "equipo_futbol") // Asegúrate de que el nombre de la tabla coincida con tu base de datos
public class EquipoFutbol implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    private String ciudad;

    private Integer cantidadCopasInternacionales;

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

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public Integer getCantidadCopasInternacionales() {
        return cantidadCopasInternacionales;
    }

    public void setCantidadCopasInternacionales(Integer cantidadCopasInternacionales) {
        this.cantidadCopasInternacionales = cantidadCopasInternacionales;
    }

    // toString, si necesitas imprimir los detalles del objeto en algún momento
    @Override
    public String toString() {
        return "EquipoFutbol{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", cantidadCopasInternacionales=" + cantidadCopasInternacionales +
                '}';
    }
}
