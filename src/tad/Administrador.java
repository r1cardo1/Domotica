/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tad;

/**
 *
 * @author Ricardo Marcano
 */
public class Administrador {
    private String nombre;
    private String apellido;
    private String clave;

    public Administrador(String nombre, String apellido, String clave) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getClave() {
        return clave;
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
    
    
    
}
