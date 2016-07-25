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

    public Bano(Luz iluminacion, Puerta puerta) {
        this.iluminacion = iluminacion;
        this.puerta = puerta;
    }

    public Luz getIluminacion() {
        return iluminacion;
    }

    public Puerta getPuerta() {
        return puerta;
    }

    public Double getClima() {
        return clima;
    }

    public void setIluminacion(Luz iluminacion) {
        this.iluminacion = iluminacion;
    }

    public void setPuerta(Puerta puerta) {
        this.puerta = puerta;
    }

    public void setClima(Double clima) {
        this.clima = clima;
    }
    
    
}
