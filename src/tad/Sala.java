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

    /**
     * Crea una nueva instancia de la clase Sala
     * @param puerta Es la puerta de la sala
     * @param ventana1 Es la ventana 1 de la sala
     * @param ventana2 Es la ventana 2 de la sala
     * @param luz Es la iluminacion de la sala
     */
    public Sala(Puerta puerta, Ventana ventana1, Ventana ventana2,Luz luz) {
        this.puerta = puerta;
        this.luz = luz;
        this.ventana1 = ventana1;
        this.ventana2 = ventana2;
    }

    /**
     * Devuelve la puerta de la sala
     * @return Puerta
     */
    public Puerta getPuerta() {
        return puerta;
    }

    /**
     * Devuelve la iluminacion de la sala
     * @return Luz
     */
    public Luz getLuz() {
        return luz;
    }

    /**
     * Devuelve la ventana 1 de la sala
     * @return Ventana
     */
    public Ventana getVentana1() {
        return ventana1;
    }

    /**
     * Devuelve la ventana 2 de la sala
     * @return Ventana
     */
    public Ventana getVentana2() {
        return ventana2;
    }

    /**
     * Devuelve el clima de la sala
     * @return Double
     */
    public Double getClima() {
        return clima;
    }

    /**
     * Cambia la puerta de la sala
     * @param puerta Puerta nueva
     */
    public void setPuerta(Puerta puerta) {
        this.puerta = puerta;
    }

    /**
     * Cambia la luz de la sala
     * @param luz Luz nueva
     */
    public void setLuz(Luz luz) {
        this.luz = luz;
    }

    /**
     * Cambia la ventana 1 de la sala
     * @param ventana1 Ventana nueva
     */
    public void setVentana1(Ventana ventana1) {
        this.ventana1 = ventana1;
    }

    /**
     * Cambia la ventana 2 de la sala
     * @param ventana2 ventana nueva
     */
    public void setVentana2(Ventana ventana2) {
        this.ventana2 = ventana2;
    }

    /**
     * Cambia el clima de la sala
     * @param clima clima nuevo
     */
    public void setClima(Double clima) {
        this.clima = clima;
    }
    
    
}
