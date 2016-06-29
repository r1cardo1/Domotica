/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tad;

import javafx.scene.shape.MeshView;

/**
 *
 * @author Ricardo Marcano
 */
public class Puerta {
    
    private double alto;
    private double ancho;
    private double material;
    private double modeloMaterial;
    private Boolean abierta;
    private MeshView model;

    public Puerta(double alto, double ancho, double material, double modeloMaterial, MeshView model) {
        this.alto = alto;
        this.ancho = ancho;
        this.material = material;
        this.modeloMaterial = modeloMaterial;
        this.model = model;
        abierta = false;
    }

    public double getAlto() {
        return alto;
    }

    public double getAncho() {
        return ancho;
    }

    public double getMaterial() {
        return material;
    }

    public double getModeloMaterial() {
        return modeloMaterial;
    }

    public Boolean getAbierta() {
        return abierta;
    }

    public MeshView getModel() {
        return model;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public void setMaterial(double material) {
        this.material = material;
    }

    public void setModeloMaterial(double modeloMaterial) {
        this.modeloMaterial = modeloMaterial;
    }

    public void setModel(MeshView model) {
        this.model = model;
    }
    
    public void abrePuerta(){
        
    }
    
    public void cierraPuerta(){
        
    }
    
    public void cambiaMaterial(){
        
    }
    
    public void cambiaModelo(){
        
    }
}
