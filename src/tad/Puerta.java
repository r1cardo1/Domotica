/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tad;

import javafx.scene.image.Image;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.MeshView;

/**
 *
 * @author Ricardo Marcano
 */
public class Puerta {
    
    private double alto;
    private double ancho;
    private String material;
    private String modeloMaterial;
    private Boolean abierta;
    private MeshView model;

    public Puerta(double alto, double ancho, String material, String modeloMaterial, MeshView model) {
        this.alto = alto;
        this.ancho = ancho;
        this.material = material;
        this.modeloMaterial = modeloMaterial;
        this.model = model;
        abierta = false;
        PhongMaterial phongMaterial = new PhongMaterial();
        phongMaterial.setDiffuseMap(new Image(getClass().getResource("/images/puerta.jpg").toExternalForm()));
        model.setMaterial(phongMaterial);
    }

    public double getAlto() {
        return alto;
    }

    public double getAncho() {
        return ancho;
    }

    public String getMaterial() {
        return material;
    }

    public String getModeloMaterial() {
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

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setModeloMaterial(String modeloMaterial) {
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
