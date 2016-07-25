/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tad;

import javafx.scene.PointLight;

/**
 *
 * @author Ricardo Marcano
 */
public class Cocina {
    private Luz iluminacion;
    private Luz iluminacion1;
    private Double clima;
    private Ventana ventana1;
    private Ventana ventana2;
    private Ventana ventana3;
    private Puerta puerta;

    public Cocina(Luz iluminacion, Luz iluminacion1, Ventana ventana1, Ventana ventana2, Ventana ventana3, Puerta puerta) {
        this.iluminacion = iluminacion;
        this.iluminacion1 = iluminacion1;
        this.ventana1 = ventana1;
        this.ventana2 = ventana2;
        this.ventana3 = ventana3;
        this.puerta = puerta;
    }

    public void setIluminacion(Luz iluminacion) {
        this.iluminacion = iluminacion;
    }

    public void setIluminacion1(Luz iluminacion1) {
        this.iluminacion1 = iluminacion1;
    }

    public void setClima(Double clima) {
        this.clima = clima;
    }

    public void setVentana1(Ventana ventana1) {
        this.ventana1 = ventana1;
    }

    public void setVentana2(Ventana ventana2) {
        this.ventana2 = ventana2;
    }

    public void setVentana3(Ventana ventana3) {
        this.ventana3 = ventana3;
    }

    public void setPuerta(Puerta puerta) {
        this.puerta = puerta;
    }
    
    public Luz getIluminacion() {
        return iluminacion;
    }

    public Luz getIluminacion1() {
        return iluminacion1;
    }

    public Double getClima() {
        return clima;
    }

    public Ventana getVentana1() {
        return ventana1;
    }

    public Ventana getVentana2() {
        return ventana2;
    }

    public Ventana getVentana3() {
        return ventana3;
    }

    public Puerta getPuerta() {
        return puerta;
    }
    
    
}
