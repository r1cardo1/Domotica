/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tad;


public class Pared {
    private double alto;
    private String material;
    private String pintura;

    public Pared(double alto, String material, String pintura) {
        this.alto = alto;
        this.material = material;
        this.pintura = pintura;
    }

    public double getAlto() {
        return alto;
    }

    public String getMaterial() {
        return material;
    }

    public String getPintura() {
        return pintura;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setPintura(String pintura) {
        this.pintura = pintura;
    }
        
}
