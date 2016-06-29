/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tad;

import javafx.scene.PointLight;
import javafx.scene.paint.Color;

/**
 *
 * @author Ricardo Marcano
 */
public class Luz {
    private double intensidad;
    private Color color;
    private PointLight luz;
    private double layoutX;
    private double layoutY;
    private double layoutZ;

    public Luz(double intensidad, Color color, double layoutX, double layoutY, double layoutZ) {
        this.intensidad = intensidad;
        this.color = color;
        this.layoutX = layoutX;
        this.layoutY = layoutY;
        this.layoutZ = layoutZ;
    }
    
    
}
