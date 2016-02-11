/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.modelo;
import Examen.entity;

/**
 *
 * @author Patrick
 */
public class controlador {
    static modelo mod = new modelo();
    public static void Registro(entity p){
        mod.Registro(p);
    }
    
    public static entity Consulta(){
        return mod.Consultar();
    }
    
    public static void ActualStock(int c, int o){
        mod.ActualizarStock(c, o);
    }
    
    public static void ActulPrecio(double c, int o){
        mod.ActualizarPrecio(c, o);
    }
}
