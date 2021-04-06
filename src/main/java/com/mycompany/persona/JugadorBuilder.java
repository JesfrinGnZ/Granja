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
public class JugadorBuilder {

    private String nombreDeJugador;
    private String nickDeJugador;

    public JugadorBuilder() {
    }
    
    public JugadorBuilder(String nombreDeJugador, String nickDeJugador) {
        this.nombreDeJugador = nombreDeJugador;
        this.nickDeJugador = nickDeJugador;
    }

  
    public JugadorBuilder setNombreDeJugador(String nombreDeJugador){
        this.nombreDeJugador=nombreDeJugador;
        return this;
    }
    
    public JugadorBuilder setNickDelJugador(String nickDelJugador){
        this.nickDeJugador = nickDelJugador;
        return this;
    }
    
    public Jugador build(){
        return new Jugador(nombreDeJugador, nickDeJugador);
    }

  
    
    
}
