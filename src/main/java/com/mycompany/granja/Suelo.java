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
public class Suelo {
    
    private TipoDeSuelo tipoDeSuelo;
    private SuperficieJLabel superficieLabel;
    private boolean estaComprado;
    //Color

    public Suelo(TipoDeSuelo tipoDeSuelo, SuperficieJLabel superficieLabel) {
        this.tipoDeSuelo = tipoDeSuelo;
        this.superficieLabel = superficieLabel;
    }

    public TipoDeSuelo getTipoDeSuelo() {
        return tipoDeSuelo;
    }

    public void setTipoDeSuelo(TipoDeSuelo tipoDeSuelo) {
        this.tipoDeSuelo = tipoDeSuelo;
    }

    public SuperficieJLabel getSuperficieLabel() {
        return superficieLabel;
    }

    public void setSuperficieLabel(SuperficieJLabel superficieLabel) {
        this.superficieLabel = superficieLabel;
    }

 
    
}
