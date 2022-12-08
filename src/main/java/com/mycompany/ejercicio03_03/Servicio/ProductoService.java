/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.ejercicio03_03.Servicio;

import com.mycompany.ejercicio03_03.Modelo.Producto;
import java.util.List;

/**
 *
 * @author Usuario R
 */
public interface ProductoService {
    
    public void crearProducto(Producto producto);

    public List<Producto> listar();
    
    
    
}
