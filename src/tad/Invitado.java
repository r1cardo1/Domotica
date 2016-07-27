/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tad;

import java.util.ArrayList;

/**
 *
 * @author Ricardo Marcano
 */
public class Invitado {
    private String nombre;
    private String apellido;
    private String clave;
    private ArrayList<String> zonas;

    public Invitado(String nombre, String apellido, String clave) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.clave = clave;
        zonas = new ArrayList<>();
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<String> getZonas() {
        return zonas;
    }

    public String getApellido() {
        return apellido;
    }

    public String getClave() {
        return clave;
    }
    
    public void addZona(String s){
        zonas.add(s);
    }
    
}
