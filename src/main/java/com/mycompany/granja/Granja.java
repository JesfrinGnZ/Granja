/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.granja;

/**
 *
 * @author jesfrin
 */
public class Granja {
    
    public static final int  NUMERO_DE_CUADROS_DE_SUELO=10;
    
    private int oroGenerado;//Solo el que va sumando al cosechar 
    private Suelo[][] suelo;

    public Granja() {
        this.oroGenerado = 0;
        this.suelo = CreadorDeSuelo.crearSueloInicial();
    }

    public int getOroGenerado() {
        return oroGenerado;
    }

    public void setOroGenerado(int oroGenerado) {
        this.oroGenerado = oroGenerado;
    }

    public Suelo[][] getSuelo() {
        return suelo;
    }

    public void setSuelo(Suelo[][] suelo) {
        this.suelo = suelo;
    }
 
    
}
