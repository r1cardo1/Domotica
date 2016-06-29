/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tad;

import java.util.ArrayList;
import javafx.scene.Group;

/**
 *
 * @author Ricardo Marcano
 */
public class Casa {
    
    private ArrayList<Luz> luces;
    private ArrayList<Pared> paredes;
    private ArrayList<Puerta> puertas;
    private ArrayList<Ventana> ventanas;
    private Group casa;

    public void setCasa(Group casa) {
        this.casa = casa;
    }

    public Group getCasa() {
        return casa;
    }
    
    public Casa(){
        luces = new ArrayList<>();
        paredes = new ArrayList<>();
        puertas = new ArrayList<>();
        ventanas = new ArrayList<>();
    }
    
    public void agregaPared(Pared p){
        paredes.add(p);
    }
    
    public void agregaVentana(Ventana v){
        ventanas.add(v);
    }
    
    public void agregaPuerta(Puerta p){
        puertas.add(p);
    }
    
    public void agregaLuces(Luz l){
        luces.add(l);
    }

    public ArrayList<Luz> getLuces() {
        return luces;
    }

    public ArrayList<Pared> getParedes() {
        return paredes;
    }

    public ArrayList<Puerta> getPuertas() {
        return puertas;
    }

    public ArrayList<Ventana> getVentanas() {
        return ventanas;
    }
    
    
}
