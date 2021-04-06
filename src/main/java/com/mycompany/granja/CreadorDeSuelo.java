/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.granja;

import com.mycompany.enums.TipoDeSuelo;
import javax.swing.JLabel;

/**
 *
 * @author jesfrin
 */
public class CreadorDeSuelo {

    private int fila;
    private int columna;
    
    /**
     * Crea la matriz inicial del suelo
     *
     * @return
     */
    public static Suelo[][] crearSueloInicial() {
        Suelo cuadroDeSuelo;
        Suelo[][] suelo = new Suelo[Granja.NUMERO_DE_CUADROS_DE_SUELO][Granja.NUMERO_DE_CUADROS_DE_SUELO];
        for (int i = 0; i < suelo.length; i++) {
            for (int j = 0; j < suelo.length; j++) {
                SuperficieJLabel jlabel = new SuperficieJLabel(i,j,"Fila:" + (i + 1) + " Columna:" + (j + 1));
                
                     
                jlabel.addMouseListener(new java.awt.event.MouseAdapter() {
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        //jLabel1MouseClicked(evt);
                        //evt.getComponent().setVisible(false);
                        SuperficieJLabel label=(SuperficieJLabel)evt.getComponent();
                        System.out.println("Fila:"+label.getNumeroDeFila()+" Columna:"+label.getNumeroDeColumna());
                    }
                });
                cuadroDeSuelo = new Suelo(TipoDeSuelo.DESIERTO, jlabel);
                suelo[i][j] = cuadroDeSuelo;
            }
        }
        return suelo;
    }

}
