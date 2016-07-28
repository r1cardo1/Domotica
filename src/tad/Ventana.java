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
    private Color color;



    /**
     * Crea una nueva instancia de la clase ventana
     * @param alto Es el alto de la ventana
     * @param ancho Es el ancho de la ventana
     * @param material Es el material con que esta hecha la ventana
     * @param solIzq Es la referencia al modelo 3D izquierdo de la ventana
     * @param solDer Es la referencia al modelo 3D derecho de la ventana
     */
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
    
    /**
     * Cambia el color de la ventana
     * @param color Color nuevo
     */
    public void setColor(Color color) {
        this.color = color;
        PhongMaterial phongMaterial = new PhongMaterial(this.color);
        solIzq.setMaterial(phongMaterial);
        solDer.setMaterial(phongMaterial);        
    }

    /**
     * Retorna el color de la ventana
     * @return Color
     */
    public Color getColor() {
        return color;
    }      

    /**
     * Retorna el alto de la ventana
     * @return Double
     */
    public double getAlto() {
        return alto;
    }

    /**
     * Retorna el ancho de la ventana
     * @return Double
     */
    public double getAncho() {
        return ancho;
    }

    /**
     * Retorna el material de la ventana
     * @return String
     */
    public String getMaterial() {
        return material;
    }

    /**
     * Retorna TRUE si la ventana esta abierta y FALSE si esta cerrada
     * @return Boolean
     */
    public Boolean getAbiertaIzq() {
        return abiertaIzq;
    }

    /**
     * Cambia el alto de la ventana
     * @param alto Alto nuevo
     */
    public void setAlto(double alto) {
        this.alto = alto;
    }

    /**
     * Cambia el ancho de la ventana
     * @param ancho Ancho nuevo
     */
    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    /**
     * Cambia el material de la ventana
     * @param material Material nuevo
     */
    public void setMaterial(String material) {
        this.material = material;
    }

    /**
     * Cambia la referencia al modelo 3D de la ventana
     * @param solIzq MeshView
     */
    public void setSolIzq(MeshView solIzq) {
        this.solIzq = solIzq;
    }

    /**
     * Cambia la referencia al modelo 3D de la ventana
     * @param solDer MeshView
     */
    public void setSolDer(MeshView solDer) {
        this.solDer = solDer;
    }

    /**
     * Devuelve TRUE si la ventana esta abierta
     * @return Boolean
     */
    public Boolean getAbiertaDer() {
        return abiertaDer;
    }

    public MeshView getSolIzq() {
        return solIzq;
    }

    public MeshView getSolDer() {
        return solDer;
    }
    
    /**
     * Abre la ventana
     */
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
    
    /**
     * Abre la ventana
     */
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
    
    /**
     * Cierra la ventana
     */
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
    
    /**
     * Cierra la ventana
     */
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
