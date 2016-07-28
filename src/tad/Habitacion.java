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

    /**
     * Crea una nueva instancia de la clase Habitacion
     * @param puerta Es la puerta de la habitacion
     * @param ventana1 Es la ventana de la habitacion
     * @param iluminacion Es la iluminacion de la habitacion
     */
    public Habitacion(Puerta puerta, Ventana ventana1, Luz iluminacion) {
        this.puerta = puerta;
        this.ventana1 = ventana1;
        this.iluminacion = iluminacion;
    }
    
    /**
     * Crea una nueva instancia de la clase Habitacion
     * @param puerta Es la puerta de la habitacion
     * @param ventana1 Es la ventana 1 de la habitacion
     * @param ventana2 Es la ventana 2 de la habitacion
     * @param iluminacion Es la iluminacion de la habitacion
     */
    public Habitacion(Puerta puerta, Ventana ventana1,Ventana ventana2, Luz iluminacion) {
        this.puerta = puerta;
        this.ventana2 = ventana2;
        this.ventana1 = ventana1;
        this.iluminacion = iluminacion;
    }

    /**
     * Retorna la puerta de la habitacion
     * @return Puerta
     */
    public Puerta getPuerta() {
        return puerta;
    }

    /**
     * Retorna la ventana 1 de la habitacion
     * @return Ventana
     */
    public Ventana getVentana1() {
        return ventana1;
    }

    /**
     * Retorna la ventana 2 de la habitacion
     * @return Ventana
     */
    public Ventana getVentana2() {
        return ventana2;
    }

    /**
     * Retorna la iluminacion de la habitacion
     * @return Luz
     */
    public Luz getIluminacion() {
        return iluminacion;
    }

    /**
     * Retorna el clima de la habitacion
     * @return Double
     */
    public Double getClima() {
        return clima;
    }

    /**
     * Cambia la puerta de la habitacion
     * @param puerta Puerta nueva
     */
    public void setPuerta(Puerta puerta) {
        this.puerta = puerta;
    }

    /**
     * Cambia la ventana 1 de la habitacion
     * @param ventana1 Ventana nueva
     */
    public void setVentana1(Ventana ventana1) {
        this.ventana1 = ventana1;
    }

    /**
     * Cambia la ventana 2 de la habitacion
     * @param ventana2 Ventana nueva
     */
    public void setVentana2(Ventana ventana2) {
        this.ventana2 = ventana2;
    }

    /**
     * Cambia la iluminacion de la habitacion
     * @param iluminacion Iluminacion nueva
     */
    public void setIluminacion(Luz iluminacion) {
        this.iluminacion = iluminacion;
    }

    /**
     * Cambia el clima de la habitacion
     * @param clima Clima nuevo
     */
    public void setClima(Double clima) {
        this.clima = clima;
    }
    
    
    
    
}
