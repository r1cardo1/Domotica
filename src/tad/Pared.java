/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tad;

import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.DrawMode;
import javafx.scene.shape.MeshView;


public class Pared {
    private double alto;
    private Color pintura;
    private MeshView pared;

    public Pared(double alto, Color pintura,MeshView pared) {
        this.alto = alto;
        this.pintura = pintura;
        this.pared = pared;
        PhongMaterial phongMaterial = new PhongMaterial();
        Image diffuseMap = new Image(getClass().getResource("/images/wall.jpg").toExternalForm());
        phongMaterial.setDiffuseMap(diffuseMap);        
        pared.setDrawMode(DrawMode.FILL);
        pared.setMaterial(phongMaterial);
    }

    public double getAlto() {
        return alto;
    }


    public Color getPintura() {
        return pintura;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }



    public void setPintura(Color pintura) {
        this.pintura = pintura;
    }
        
}
