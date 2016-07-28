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
public class Bano {
    private Luz iluminacion;
    private Puerta puerta;
    private Double clima;

    /**
     * Crea una nueva instancia de la clase
     * @param iluminacion Iluminacion del baño
     * @param puerta Puerta del baño
     */
    public Bano(Luz iluminacion, Puerta puerta) {
        this.iluminacion = iluminacion;
        this.puerta = puerta;
    }

    /**
     * Devuelve la luz del baño
     * @return Luz de baño
     */
    public Luz getIluminacion() {
        return iluminacion;
    }

    /**
     * Devuelve la puerta del baño
     * @return Puerta de baño
     */
    public Puerta getPuerta() {
        return puerta;
    }

    /**
     * Devuelve el clima del baño
     * @return Clima del baño
     */
    public Double getClima() {
        return clima;
    }

    /**
     * Cambia la iluminacion del baño
     * @param iluminacion Iluminacion nueva
     */
    public void setIluminacion(Luz iluminacion) {
        this.iluminacion = iluminacion;
    }

    /**
     * Cambia la puerta del baño
     * @param puerta Puerta nueva
     */
    public void setPuerta(Puerta puerta) {
        this.puerta = puerta;
    }

    /**
     * Cambia el clima del baño
     * @param clima Clima nuevo
     */
    public void setClima(Double clima) {
        this.clima = clima;
    }
    
    
}
