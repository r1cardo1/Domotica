/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tad;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Ricardo Marcano
 */
public class Invitado implements Serializable{
    private String nombre;
    private String apellido;
    private String clave;
    private ArrayList<String> zonas;

    /**
     * Crea una nueva instancia de la clase Invitado
     * @param nombre Es el nombre del invitado
     * @param apellido Es el apellido del invitado
     * @param clave Es la clave del invitado
     */
    public Invitado(String nombre, String apellido, String clave) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.clave = clave;
        zonas = new ArrayList<>();
    }

    /**
     * Cambia el nombre del invitado
     * @param nombre Nombre nuevo
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Cambia el apellido del invitado
     * @param apellido Apellido nuevo
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * Cambia la clave del invitado
     * @param clave Clave nueva
     */
    public void setClave(String clave) {
        this.clave = clave;
    }

    /**
     * Retorna el nombre del invitado
     * @return String
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Retorna una lista de las zonas prohibidas para el invitado
     * @return ArrayList
     */
    public ArrayList<String> getZonas() {
        return zonas;
    }

    /**
     * Retorna el apellido del invitado
     * @return String
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Retorna la clave del invitado
     * @return String
     */
    public String getClave() {
        return clave;
    }
    
    /**
     * Añade una nueva zona prohibida a la lista
     * @param s Zona prohibida
     */
    public void addZona(String s){
        zonas.add(s);
    }
    
}
