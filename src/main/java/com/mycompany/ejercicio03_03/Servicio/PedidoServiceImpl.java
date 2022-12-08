/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio03_03.Servicio;

import com.mycompany.ejercicio03_03.Modelo.Pedido;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario R
 */
public class PedidoServiceImpl implements PedidoService{

    private static List<Pedido> pedidoList = new ArrayList<>();
        
    @Override
    public void crearPedido(Pedido pedido) {
        this.pedidoList.add(pedido);
        
    }

    @Override
    public List<Pedido> listar() {
       return this.pedidoList;
    }
    
}
