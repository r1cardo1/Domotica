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
public class Habitacion {
    private Puerta puerta;
    private Ventana ventana1;
    private Ventana ventana2;
    private Luz iluminacion;
    private Double clima;

    public Habitacion(Puerta puerta, Ventana ventana1, Luz iluminacion) {
        this.puerta = puerta;
        this.ventana1 = ventana1;
        this.iluminacion = iluminacion;
    }
    
    public Habitacion(Puerta puerta, Ventana ventana1,Ventana ventana2, Luz iluminacion) {
        this.puerta = puerta;
        this.ventana2 = ventana2;
        this.ventana1 = ventana1;
        this.iluminacion = iluminacion;
    }

    public Puerta getPuerta() {
        return puerta;
    }

    public Ventana getVentana1() {
        return ventana1;
    }

    public Ventana getVentana2() {
        return ventana2;
    }

    public Luz getIluminacion() {
        return iluminacion;
    }

    public Double getClima() {
        return clima;
    }

    public void setPuerta(Puerta puerta) {
        this.puerta = puerta;
    }

    public void setVentana1(Ventana ventana1) {
        this.ventana1 = ventana1;
    }

    public void setVentana2(Ventana ventana2) {
        this.ventana2 = ventana2;
    }

    public void setIluminacion(Luz iluminacion) {
        this.iluminacion = iluminacion;
    }

    public void setClima(Double clima) {
        this.clima = clima;
    }
    
    
    
    
}
