/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tad;

import javafx.scene.paint.Color;
import javafx.scene.shape.MeshView;

/**
 *
 * @author Ricardo Marcano
 */
public class Luz {
    private double intensidad;
    private Color color;
    private MeshView luz;


    public Luz(double intensidad, Color color,MeshView luz) {
        this.intensidad = intensidad;
        this.color = color;
        this.luz = luz;
    }

    public void cambiaColor(){
        
    }
    
    
}
