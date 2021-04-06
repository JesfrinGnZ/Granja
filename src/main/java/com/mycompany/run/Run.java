/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.run;

import com.mycompany.frontend.Principal.GranjaFrame;
import com.mycompany.persona.Jugador;
import com.mycompany.persona.JugadorBuilder;

/**
 *
 * @author jesfrin
 */
public class Run {

    public static void main(String[] args) {
//        Jugador jugador1 = new JugadorBuilder()
//                .setNickDelJugador("Nick")
//                .setNombreDeJugador("Nombre")
//                .build();
        
        GranjaFrame granja = new GranjaFrame();
        granja.setVisible(true);
    }
}
