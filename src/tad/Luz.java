/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tad;

import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.MeshView;

/**
 *
 * @author Ricardo Marcano
 */
public class Luz {
    private double intensidad;
    private Color color;
    private MeshView luz;


    /**
     * Crea una nueva instancia de la clase Luz
     * @param intensidad Es la intensidad de la luz
     * @param color Es el color de la Luz
     * @param luz Es la referencia al modelo 3D de la luz
     */
    public Luz(double intensidad, Color color,MeshView luz) {
        this.intensidad = intensidad;
        this.color = color;
        this.luz = luz;
        PhongMaterial mat = new PhongMaterial(Color.LIGHTSLATEGRAY);
        luz.setMaterial(mat);
    }
    
    /**
     * Enciende la luz
     */
    public void enciendeLuz(){
        PhongMaterial mat = new PhongMaterial(this.color);
        this.luz.setMaterial(mat);
    }
    
    /**
     * Apaga la luz
     */
    public void apagaLuz(){
        PhongMaterial mat = new PhongMaterial(Color.LIGHTSLATEGRAY);
        luz.setMaterial(mat);
    }
    
    
}
