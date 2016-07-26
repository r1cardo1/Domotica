/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tad;

import javafx.animation.TranslateTransition;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.MeshView;

/**
 *
 * @author Ricardo Marcano
 */
public class Ventana {
    private double alto;
    private double ancho;
    private String material;
    private Boolean abiertaIzq;
    private Boolean abiertaDer;
    private MeshView solIzq;
    private MeshView solDer;

    public Ventana(double alto, double ancho, String material, MeshView solIzq, MeshView solDer) {
        this.alto = alto;
        this.ancho = ancho;
        this.material = material;
        this.solIzq = solIzq;
        this.solDer = solDer;
        this.abiertaIzq = false;
        this.abiertaDer = false;
        PhongMaterial phongMaterial = new PhongMaterial(Color.LIGHTSKYBLUE);
        solIzq.setMaterial(phongMaterial);
        solDer.setMaterial(phongMaterial);
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

    public Boolean getAbiertaIzq() {
        return abiertaIzq;
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

    public void setSolIzq(MeshView solIzq) {
        this.solIzq = solIzq;
    }

    public void setSolDer(MeshView solDer) {
        this.solDer = solDer;
    }

    public Boolean getAbiertaDer() {
        return abiertaDer;
    }

    public MeshView getSolIzq() {
        return solIzq;
    }

    public MeshView getSolDer() {
        return solDer;
    }
    
    public void abreVentanaIzq(){
        
        if(!abiertaIzq && !abiertaDer){
            TranslateTransition tt = new TranslateTransition();
            tt.setNode(solIzq);
            if(solIzq.getLayoutBounds().getDepth()<10)
                tt.setByX(-20);
            else
                tt.setByZ(-20);
            tt.play();
            abiertaIzq = true;
        }
    }
    
    public void abreVentanaDer(){
        if(!abiertaIzq && !abiertaDer){
            TranslateTransition tt = new TranslateTransition();
            tt.setNode(solDer);
            if(solDer.getLayoutBounds().getDepth()<10)
                tt.setByX(20);
            else
                tt.setByZ(20);
            tt.play();
            abiertaDer = true;
        }
    }
    
    public void cierraVentanaIzq(){
        if(abiertaIzq){
            TranslateTransition tt = new TranslateTransition();
            tt.setNode(solIzq);
            if(solIzq.getLayoutBounds().getDepth()<10)
                tt.setByX(20);
            else
                tt.setByZ(20);
            tt.play();
            abiertaIzq = false;
        }
    }
    
    public void cierraVentanaDer(){
        if(abiertaDer){
            TranslateTransition tt = new TranslateTransition();
            tt.setNode(solDer);
            if(solDer.getLayoutBounds().getDepth()<10)
                tt.setByX(-20);
            else
                tt.setByZ(-20);
            tt.play();
            abiertaDer = false;
        }
    }
    
}
