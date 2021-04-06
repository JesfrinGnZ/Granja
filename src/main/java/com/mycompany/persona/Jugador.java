/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.persona;

/**
 *
 * @author jesfrin
 */
public class Jugador {
    
    private String nombreDeJugador;
    private String nickDeJugador;
    private int monedasDeOro;
    private int puntosDeVida;//Aumenta con el consumo de alimento
    //Bodega

    protected Jugador(String nombreDeJugador, String nickDeJugador) {
        this.nombreDeJugador = nombreDeJugador;
        this.nickDeJugador = nickDeJugador;
    }

    public String getNombreDeJugador() {
        return nombreDeJugador;
    }

    public void setNombreDeJugador(String nombreDeJugador) {
        this.nombreDeJugador = nombreDeJugador;
    }

    public String getNickDeJugador() {
        return nickDeJugador;
    }

    public void setNickDeJugador(String nickDeJugador) {
        this.nickDeJugador = nickDeJugador;
    }
    
    ///https://www.vogella.com/tutorials/DesignPatternBuilder/article.html
    
    
}
