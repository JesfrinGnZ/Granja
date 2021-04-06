/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.frontend.manejador;

import com.mycompany.granja.Granja;
import com.mycompany.granja.Suelo;
import javax.swing.JPanel;

/**
 *
 * @author jesfrin
 */
public class ManejadorSuelo {
    
    private JPanel sueloPanel;
    private Suelo[][] distribucionDeSuelo;
    


    public ManejadorSuelo(JPanel sueloPanel, Suelo[][] distribucionDeSuelo) {
        this.sueloPanel = sueloPanel;
        this.distribucionDeSuelo = distribucionDeSuelo;
        dibujarSuelo();
    }
    
    public void dibujarSuelo(){
        for (int i = 0; i < Granja.NUMERO_DE_CUADROS_DE_SUELO; i++) {
            for (int j = 0; j < Granja.NUMERO_DE_CUADROS_DE_SUELO; j++) {
                Suelo suelo = this.distribucionDeSuelo[i][j];
                this.sueloPanel.add(suelo.getSuperficieLabel());
            }
        }
    }
    
}
