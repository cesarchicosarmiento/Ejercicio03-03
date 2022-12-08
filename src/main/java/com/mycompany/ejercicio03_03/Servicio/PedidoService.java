/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.ejercicio03_03.Servicio;

import com.mycompany.ejercicio03_03.Modelo.Pedido;
import java.util.List;

/**
 *
 * @author Usuario R
 */
public interface PedidoService {

    public void crearPedido(Pedido pedido);

    public List<Pedido> listar();

}
