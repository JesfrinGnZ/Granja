/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.granja;

import java.awt.Component;
import javax.accessibility.AccessibleContext;
import javax.swing.JLabel;
import javax.swing.event.EventListenerList;
import javax.swing.plaf.ComponentUI;

/**
 *
 * @author jesfrin
 */
public class SuperficieJLabel extends JLabel{
    
    private int numeroDeFila;
    private int numeroDeColumna;

    public SuperficieJLabel(int numeroDeFila, int numeroDeColumna, String text) {
        super(text);
        this.numeroDeFila = numeroDeFila;
        this.numeroDeColumna = numeroDeColumna;
    }

    public int getNumeroDeFila() {
        return numeroDeFila;
    }

    public void setNumeroDeFila(int numeroDeFila) {
        this.numeroDeFila = numeroDeFila;
    }

    public int getNumeroDeColumna() {
        return numeroDeColumna;
    }

    public void setNumeroDeColumna(int numeroDeColumna) {
        this.numeroDeColumna = numeroDeColumna;
    }

    public Component getLabelFor() {
        return labelFor;
    }

    public void setLabelFor(Component labelFor) {
        this.labelFor = labelFor;
    }

    public ComponentUI getUi() {
        return ui;
    }

    public void setUi(ComponentUI ui) {
        this.ui = ui;
    }

    public EventListenerList getListenerList() {
        return listenerList;
    }

    public void setListenerList(EventListenerList listenerList) {
        this.listenerList = listenerList;
    }

    public AccessibleContext getAccessibleContext() {
        return accessibleContext;
    }

    public void setAccessibleContext(AccessibleContext accessibleContext) {
        this.accessibleContext = accessibleContext;
    }
    
    
}
