/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tad;

import javafx.animation.RotateTransition;
import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.DrawMode;
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

    public Puerta(double alto, double ancho, String material, MeshView model) {
        this.alto = alto;
        this.ancho = ancho;
        this.material = material;
        this.model = model;
        abierta = false;
        model.setDrawMode(DrawMode.FILL);
        PhongMaterial phongMaterial = new PhongMaterial();
        phongMaterial.setDiffuseMap(new Image(getClass().getResource("/images/puerta.jpg").toExternalForm()));
        model.setMaterial(phongMaterial);
        movePivot(model,12,12);
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
    
    public void setModel(MeshView model) {
        this.model = model;
    }
    
    public void abrePuerta(){
        RotateTransition rt = new RotateTransition();
        rt.setNode(this.model);
        rt.setByAngle(90);
        rt.setAxis(Rotate.Y_AXIS);
        
        rt.setDuration(Duration.millis(500));
        rt.play();
    }
    
    private void movePivot(Node node, double x, double y){
        node.getTransforms().add(new Translate(-x,-y));
        node.setTranslateX(x); 
        node.setTranslateY(y);
    }
    
    public void cierraPuerta(){
        
    }
    
    public void cambiaMaterial(){
        
    }
    
    public void cambiaModelo(){
        
    }
}
