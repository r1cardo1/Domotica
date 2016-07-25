/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tad;

/**
 *
 * @author Ricardo Marcano
 */
public class Sala {
    private Puerta puerta;
    private Luz luz;
    private Ventana ventana1;
    private Ventana ventana2;
    private Double clima;

    public Sala(Puerta puerta, Ventana ventana1, Ventana ventana2,Luz luz) {
        this.puerta = puerta;
        this.luz = luz;
        this.ventana1 = ventana1;
        this.ventana2 = ventana2;
    }

    public Puerta getPuerta() {
        return puerta;
    }

    public Luz getLuz() {
        return luz;
    }

    public Ventana getVentana1() {
        return ventana1;
    }

    public Ventana getVentana2() {
        return ventana2;
    }

    public Double getClima() {
        return clima;
    }

    public void setPuerta(Puerta puerta) {
        this.puerta = puerta;
    }

    public void setLuz(Luz luz) {
        this.luz = luz;
    }

    public void setVentana1(Ventana ventana1) {
        this.ventana1 = ventana1;
    }

    public void setVentana2(Ventana ventana2) {
        this.ventana2 = ventana2;
    }

    public void setClima(Double clima) {
        this.clima = clima;
    }
    
    
}
