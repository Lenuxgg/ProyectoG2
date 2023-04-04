/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Tarea2G2.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="articulo")
public class Articulo {
     private static final long serialVersionUID = 1L;
     
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long idArticulo;
    String nombre;
    String descripcion;
    Double precio;
    int existencias;
    boolean activo;

    public Articulo() {
    }

    public Articulo(String nombre, String descripcion, Double precio, int existencias, boolean activo) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.existencias = existencias;
        this.activo = activo;
    }
    
}
