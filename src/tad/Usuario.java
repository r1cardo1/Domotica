/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tad;

import java.io.Serializable;

/**
 *
 * @author Ricardo Marcano
 */
public class Usuario implements Serializable{
    private String nombre;
    private String apellido;
    private String clave;

    /**
     * Crea una nueva instancia de la clase usuario
     * @param nombre Es el nombre del usuario 
     * @param apellido
     * @param clave 
     */
    public Usuario(String nombre, String apellido, String clave) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.clave = clave;
    }

    /**
     * Retorna el nombre del usuario
     * @return String
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Retorna el apellido del usuario
     * @return Sting
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Retorna la clave del usuario
     * @return String
     */
    public String getClave() {
        return clave;
    }

    /**
     * Cambia el nombre del usuario
     * @param nombre Nombre nuevo
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Cambia el apellido del usuario
     * @param apellido Apellido nuevo
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * Cambia la clave del usuario
     * @param clave clave nueva
     */
    public void setClave(String clave) {
        this.clave = clave;
    }   
    
}
