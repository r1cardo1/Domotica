/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tad;

import javafx.animation.RotateTransition;
import javafx.scene.Node;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.MeshView;
import javafx.scene.transform.Rotate;
import javafx.scene.transform.Translate;
import javafx.util.Duration;

/**
 *
 * @author Ricardo Marcano
 */
public class Puerta {
    
    private double alto;
    private double ancho;
    private String material;
    private Boolean abierta;
    private MeshView model;
    private Color color;

    /**
     * Crea una nueva instancia de la clase Puerta
     * @param alto Es el alto de la puerta
     * @param ancho Es el ancho de la puerta
     * @param material Es el color de la puerta
     * @param model Es la referencia al modelo 3D de la puerta
     */
    public Puerta(double alto, double ancho, String material, MeshView model) {
        this.alto = alto;
        this.ancho = ancho;
        this.material = material;
        this.model = model;
        abierta = false;        
        PhongMaterial phongMaterial = new PhongMaterial(Color.BURLYWOOD);
        model.setMaterial(phongMaterial);
        if(model.getLayoutBounds().getDepth()<10)
            movePivot(model,12,12);
        else
            movePivot(model,12,12,true);
    }

    /**
     * Retorna el alto de la puerta
     * @return Double
     */
    public double getAlto() {
        return alto;
    }

    /**
     * Retorna el ancho de la puerta
     * @return Double
     */
    public double getAncho() {
        return ancho;
    }

    /**
     * Retorna el materia de la puerta
     * @return String
     */
    public String getMaterial() {
        return material;
    }

    /**
     * Retorna TRUE si la puerta esta abierta y FALSE si esta cerrada
     * @return Boolean
     */
    public Boolean getAbierta() {
        return abierta;
    }

    /**
     * Devuelve la referencia al modelo 3D de la puerta
     * @return MeshView
     */
    public MeshView getModel() {
        return model;
    }

    /**
     * Cambia el alto de la puerta
     * @param alto Nuevo alto
     */
    public void setAlto(double alto) {
        this.alto = alto;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    /**
     * Cambia el material de la puerta
     * @param material Nuevo material
     */
    public void setMaterial(String material) {
        this.material = material;
    }
    
    /**
     * Cambia la referencia al modelo 3D de la puerta
     * @param model MeshView
     */
    public void setModel(MeshView model) {
        this.model = model;
    }
    
    /**
     * Abre la puerta
     */
    public void abrePuerta(){
        if(!abierta){
            RotateTransition rt = new RotateTransition();
            rt.setNode(this.model);
            rt.setByAngle(90);
            rt.setAxis(Rotate.Y_AXIS);        
            rt.setDuration(Duration.millis(500));
            rt.play();
            abierta = true;
        }
    }
    
    /**
     * Mueve el punto de rotacion de la puerta
     * @param node Puerta a modificar
     * @param x punto de rotacion x
     * @param y punto de rotacion y
     */
    private void movePivot(Node node, double x, double y){
        node.getTransforms().add(new Translate(-x,-y));
        node.setTranslateX(x); 
        node.setTranslateY(y);
    }
    
    /**
     * Mueve el punto de rotacion de la puerta
     * @param node Puerta a modificar
     * @param x Punto de rotacion en Y
     * @param y punto de rotacion en Z
     * @param flag 
     */
    private void movePivot(Node node, double x, double y,Boolean flag){
        node.getTransforms().add(new Translate(0,x,y));
        node.setTranslateY(-x); 
        node.setTranslateZ(-y);
    }
    /**
     * Cierra la puerta
     */
    public void cierraPuerta(){
        if(abierta){
            RotateTransition rt = new RotateTransition();
            rt.setNode(this.model);
            rt.setByAngle(-90);
            rt.setAxis(Rotate.Y_AXIS);        
            rt.setDuration(Duration.millis(500));
            rt.play();
            abierta = false;
        }
    }

    /**
     * Cambia el color de la puerta
     * @param value Color nuevo
     */
    public void setColor(Color value) {
        this.color = color;
        PhongMaterial phongMaterial = new PhongMaterial(this.color);
        model.setMaterial(phongMaterial);
    }
}
