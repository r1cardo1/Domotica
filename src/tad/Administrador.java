/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tad;

import java.io.Serializable;

/**
 * Declaracion de la clase administrador
 * @author Ricardo Marcano
 */
public class Administrador implements Serializable{
    private String nombre;
    private String apellido;
    private String clave;

    /**
     * Crea una nueva instancia de la clase
     * @param nombre Nombre del administrador
     * @param apellido Apellido del administrador
     * @param clave Clave del usuario
     */
    public Administrador(String nombre, String apellido, String clave) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.clave = clave;
    }
    
    /**
     * Retorna el nombre del administrador
     * @return String
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Retorna el apellido del administrador
     * @return String
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Retorna la clave del administrador
     * @return String
     */
    public String getClave() {
        return clave;
    }

    /**
     * Cambia el nombre del administrador
     * @param nombre Nombre de administrador
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * Cambia el apellido del administrador
     * @param apellido Apellido del administrador
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    /**
     * Cambia la clave del administrador
     * @param clave Clave del administrador
     */
    public void setClave(String clave) {
        this.clave = clave;
    }
    
    
    
}
