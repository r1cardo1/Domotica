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

    /**
     * Crea una nueva instancia de la clase Cocina
     * @param iluminacion Es la iluminacion de la cocina
     * @param iluminacion1 Es la iluminacion de la cocina
     * @param ventana1 Es la ventana 1 de la cocina
     * @param ventana2 Es la ventana 2 de la cocina
     * @param ventana3 Es la ventana 3 de la cocina
     * @param puerta Es la puerta de la cocina
     */
    public Cocina(Luz iluminacion, Luz iluminacion1, Ventana ventana1, Ventana ventana2, Ventana ventana3, Puerta puerta) {
        this.iluminacion = iluminacion;
        this.iluminacion1 = iluminacion1;
        this.ventana1 = ventana1;
        this.ventana2 = ventana2;
        this.ventana3 = ventana3;
        this.puerta = puerta;
    }

    /**
     * Cambia la iluminacion de la cocina
     * @param iluminacion Iluminacion nueva
     */
    public void setIluminacion(Luz iluminacion) {
        this.iluminacion = iluminacion;
    }

    /**
     * Cambia la iluminacion de la cocina
     * @param iluminacion1 Iluminacion nueva
     */
    public void setIluminacion1(Luz iluminacion1) {
        this.iluminacion1 = iluminacion1;
    }

    /**
     * Cambia el clima de la cocina
     * @param clima Clima nuevo
     */
    public void setClima(Double clima) {
        this.clima = clima;
    }

    /**
     * Cambia la ventana 1 de la cocina
     * @param ventana1 Ventana nueva
     */
    public void setVentana1(Ventana ventana1) {
        this.ventana1 = ventana1;
    }

    /**
     * Cambia la ventana 2 de la cocina 
     * @param ventana2 Ventana nueva
     */
    public void setVentana2(Ventana ventana2) {
        this.ventana2 = ventana2;
    }

    /**
     * Cambia la ventana 3 de la cocina
     * @param ventana3 Ventana nueva
     */
    public void setVentana3(Ventana ventana3) {
        this.ventana3 = ventana3;
    }

    /**
     * Cambia la puerta de la cocina
     * @param puerta Puerta nueva
     */
    public void setPuerta(Puerta puerta) {
        this.puerta = puerta;
    }
    
    /**
     * Retorna la iluminacion de la cocina
     * @return Luz
     */
    public Luz getIluminacion() {
        return iluminacion;
    }

    /**
     * Retorna la iluminacion de la cocina
     * @return Luz
     */
    public Luz getIluminacion1() {
        return iluminacion1;
    }

    /**
     * Retorna el clima de la cocina
     * @return Double
     */
    public Double getClima() {
        return clima;
    }

    /**
     * Retorna la ventana 1 de la cocina
     * @return Ventana
     */
    public Ventana getVentana1() {
        return ventana1;
    }

    /**
     * Retorna la ventana 2 de la cocina
     * @return Ventana
     */
    public Ventana getVentana2() {
        return ventana2;
    }

    /**
     * Retorna la ventana 3 de la cocina
     * @return Ventana
     */
    public Ventana getVentana3() {
        return ventana3;
    }

    /**
     * Retorna la puerta de la cocina
     * @return Puerta
     */
    public Puerta getPuerta() {
        return puerta;
    }
    
    
}
