/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tad;

import java.util.Random;
import javafx.animation.RotateTransition;
import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.image.PixelWriter;
import javafx.scene.image.WritableImage;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.DrawMode;
import javafx.scene.shape.MeshView;
import javafx.scene.shape.TriangleMesh;
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
        TriangleMesh mesh = (TriangleMesh) model.getMesh();
        System.out.println(mesh.getTexCoordElementSize()+" "+model.getId());
        PhongMaterial phongMaterial = new PhongMaterial(Color.BURLYWOOD);
        model.setMaterial(phongMaterial);
        if(model.getLayoutBounds().getDepth()<10)
            movePivot(model,12,12);
        else
            movePivot(model,12,12,true);
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
    
    private void movePivot(Node node, double x, double y){
        node.getTransforms().add(new Translate(-x,-y));
        node.setTranslateX(x); 
        node.setTranslateY(y);
    }
    
    private void movePivot(Node node, double x, double y,Boolean flag){
        node.getTransforms().add(new Translate(0,x,y));
        node.setTranslateY(-x); 
        node.setTranslateZ(-y);
    }
    
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
    
    public void cambiaMaterial(){
        
    }
    
     public Image createImage( double size) {

        Random rnd = new Random();

        int width = (int) size;
        int height = (int) size;

        WritableImage wr = new WritableImage(width, height);
        PixelWriter pw = wr.getPixelWriter();
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {

                Color color = Color.rgb(rnd.nextInt( 256), rnd.nextInt( 256), rnd.nextInt( 256));
                pw.setColor(x, y, color);

            }
        }

        return wr;

    }
    
    public void cambiaModelo(){
        
    }
}
