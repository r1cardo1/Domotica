/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tad;

import javafx.scene.image.Image;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.DrawMode;
import javafx.scene.shape.MeshView;


public class Pared {
    private double alto;
    private String material;
    private String pintura;
    private MeshView pared;

    public Pared(double alto, String material, String pintura,MeshView pared) {
        this.alto = alto;
        this.material = material;
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
