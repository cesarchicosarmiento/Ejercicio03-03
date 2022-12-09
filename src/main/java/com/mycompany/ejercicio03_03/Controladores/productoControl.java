/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio03_03.Controladores;

import com.mycompany.ejercicio03_03.Servicio.ProductoServiceImpl;

/**
 *
 * @author Usuario R
 */
public class productoControl {

    private ProductoServiceImpl productoServiceImpl = new ProductoServiceImpl();

    public void crearProducto(String[] dataProducto) {

        var retorno = ("No se pudo crear el Producto");

        var valida = true;

        var codigo = Integer.valueOf(dataProducto[0]);

        var nombre = dataProducto[1];

        var cantidad = Integer.valueOf(dataProducto[2]);

        var precio = Double.valueOf(dataProducto[3]);

        if (validaCodigo(codigo) == false) {

            retorno += "\n Codigo Incorrecto";
            valida = false;

        }

        if (validaNombre(nombre) == false) {

            retorno += "\n Nombre mal escrito";
            valida = false;

        }

        if (validaCantidad(cantidad) == false) {

            retorno += "\n Cantidad Incorrecto";
            valida = false;

        }

        if (validaPrecio(precio) == false) {

            retorno += "\n Precio incorrecto";
            valida = false;

        }

        /*if (valida==true) {
                
            var pedido = new Pedido (codigo, nombreComprador, totalSinIva, tipoDeMercaderia, observaciones, nombreProducto);
            this.productoServiceImpl.crearProducto (producto);
            
        }
         */
    }

    public boolean validaCodigo(int codigo) {

        var retorno = false;

        String numCadena = String.valueOf(codigo);
        String cadena = numCadena;

        char[] cadena_div = cadena.toCharArray();
        String n = "";
        for (int i = 0; i < cadena_div.length; i++) {
            if (Character.isDigit(cadena_div[i])) {
                n += cadena_div[i];
            } else {
                return retorno;
            }
        }

        var cod = Integer.valueOf(codigo).intValue();

        if (cod > 0) {
            retorno = true;
        }

        return retorno;

    }

    public boolean validaNombre(String nombre) {
        var retorno = false;

        String cadena = nombre;
        char[] cadena_div = cadena.toCharArray();
        String n = "";
        for (int i = 0; i < cadena_div.length; i++) {
            if (Character.isDigit(cadena_div[i])) {
                n += cadena_div[i];
                retorno = true;
                return retorno;
            }
        }

        return retorno;
    }

    public boolean validaPrecio(double precio) {

        var retorno = false;

        String numCadena = String.valueOf(precio);
        String cadena = numCadena;

        char[] cadena_div = cadena.toCharArray();
        String n = "";
        for (int i = 0; i < cadena_div.length; i++) {
            if (Character.isDigit(cadena_div[i])) {
                n += cadena_div[i];
            } else {
                return retorno;
            }
        }

        var costoF = Double.valueOf(precio).intValue();

        if (costoF > 0 && costoF < 10000) {
            retorno = true;
        }

        return retorno;

    }

    public boolean validaCantidad(int cantidad) {

        var retorno = false;

        String numCadena = String.valueOf(cantidad);
        String cadena = numCadena;

        char[] cadena_div = cadena.toCharArray();
        String n = "";
        for (int i = 0; i < cadena_div.length; i++) {
            if (Character.isDigit(cadena_div[i])) {
                n += cadena_div[i];
            } else {
                return retorno;
            }
        }

        var cod = Integer.valueOf(cantidad).intValue();

        if (cod > 0) {
            retorno = true;
        }

        return retorno;
    }
}
