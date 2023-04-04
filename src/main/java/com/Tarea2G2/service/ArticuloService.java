/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Tarea2G2.service;

import com.Tarea2G2.domain.Articulo;
import java.util.List;


public interface ArticuloService {
    public List<Articulo> getArticulo();
    public Articulo getArticulo(Articulo articulo);
    public void save(Articulo articulo);
    public void delete(Articulo articulo);
    
}
