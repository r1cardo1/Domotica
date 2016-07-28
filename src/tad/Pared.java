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

    /**
     * Crea una nueva instancia de la clase Pared
     * @param alto Es el alto de la pared
     * @param pintura Es el color de la pared
     * @param pared Es la referencia al modelo 3D de la pared
     */
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

    /**
     * Devuelve el alto de la pared
     * @return Double
     */
    public double getAlto() {
        return alto;
    }

    /**
     * Devuelve la pintura de la pared
     * @return Color
     */
    public Color getPintura() {
        return pintura;
    }

    /**
     * Cambia el alto de la pared
     * @param alto Alto nuevo
     */
    public void setAlto(double alto) {
        this.alto = alto;
    }

    /**
     * Cambia la pintura de la pared
     * @param pintura Pintura nueva
     */
    public void setPintura(Color pintura) {
        this.pintura = pintura;
    }
        
}
