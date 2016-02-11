/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Examen.entity;

/**
 *
 * @author Patrick
 */
public class modelo {
    private entity producto = new entity();
    private static int cont = 0;
    public modelo() {
    }
    public void Registro(entity p){
        cont++;
        p.setCodigo("DEF00"+cont);
        producto = p ;
    }
    public entity Consultar(){
    return producto;
}
    public void ActualizarStock(int cant, int opcion){
        switch(opcion){
            case 1:
                producto.setCantidad(producto.getCantidad()+cant);
                break;
            case 2:
                producto.setCantidad(producto.getCantidad()-cant);
        }    
    }
    
    public void ActualizarPrecio(double tasa, int opcion){
        switch(opcion){
            case 1:
                producto.setPrecio(producto.getPrecio() + (producto.getPrecio()*tasa/100));
                break;
            case 2:
                producto.setPrecio(producto.getPrecio()- (producto.getPrecio()*tasa/100));
        }
    }
}
