
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tad;

import javafx.scene.Group;

/**
 *
 * @author Ricardo Marcano
 */
public class Casa {
    
    private Bano banPrincipal;
    private Bano banSegundario;
    private Habitacion habPrimaria;
    private Habitacion habTraseraPrim;
    private Habitacion habTraseraSec;
    private Cocina cocina;
    private Sala lobby;
    private Pared paredes;

    /**
     * Crea una nueva instancia de la clase CASA
     * @param banPrincipal Es el baño principal
     * @param banSegundario Es el baño segundario
     * @param habPrimaria Es la habitacion primaria
     * @param habTraseraPrim Es la habitacion segundaria
     * @param habTraseraSec Es la habitacion de huespedes
     * @param cocina Es la cocina
     * @param lobby Es la sala
     */
    public Casa(Bano banPrincipal, Bano banSegundario, Habitacion habPrimaria, Habitacion habTraseraPrim, Habitacion habTraseraSec, Cocina cocina, Sala lobby) {
        this.banPrincipal = banPrincipal;
        this.banSegundario = banSegundario;
        this.habPrimaria = habPrimaria;
        this.habTraseraPrim = habTraseraPrim;
        this.habTraseraSec = habTraseraSec;
        this.cocina = cocina;
        this.lobby = lobby;
    }

    /**
     * Crea una nueva instancia de la clase Casa
     */
    public Casa() {
        
    }

    /**
     * Retorna el baño principal de la casa
     * @return Baño
     */
    public Bano getBanPrincipal() {
        return banPrincipal;
    }

    /**
     * Retorna el baño segundario de la casa
     * @return Baño
     */
    public Bano getBanSegundario() {
        return banSegundario;
    }

    /**
     * Retorna la habitacion principal de la casa
     * @return Habitacion
     */
    public Habitacion getHabPrimaria() {
        return habPrimaria;
    }

    /**
     * Retorna la habitacion segundaria de la casa
     * @return Habitacion
     */
    public Habitacion getHabTraseraPrim() {
        return habTraseraPrim;
    }

    /**
     * Retorna la habitacion de huespedes de la casa
     * @return Habitacion
     */
    public Habitacion getHabTraseraSec() {
        return habTraseraSec;
    }

    /**
     * Retorna la cocina de la casa
     * @return Cocina
     */
    public Cocina getCocina() {
        return cocina;
    }

    /**
     * Retorna la sala de la casa
     * @return Sala
     */
    public Sala getLobby() {
        return lobby;
    }

    /**
     * Retorna la pared de la casa
     * @return Pared
     */
        public Pared getParedes() {
        return paredes;
    }

        /**
         * Cambia la pared de la casa
         * @param paredes Pared nueva
         */
    public void setParedes(Pared paredes) {
        this.paredes = paredes;
    }
    
    /**
     * Cambia el baño principal de la casa
     * @param banPrincipal Baño nuevo
     */
    public void setBanPrincipal(Bano banPrincipal) {
        this.banPrincipal = banPrincipal;
    }

    /**
     * Cambia el baño segundario de la casa
     * @param banSegundario Baño nuevo
     */
    public void setBanSegundario(Bano banSegundario) {
        this.banSegundario = banSegundario;
    }

    /**
     * Cambia la habitacion principal
     * @param habPrimaria Habitacion nueva
     */
    public void setHabPrimaria(Habitacion habPrimaria) {
        this.habPrimaria = habPrimaria;
    }

    /**
     * Cambia la habitacion segundaria
     * @param habTraseraPrim Habitacion nueva
     */
    public void setHabTraseraPrim(Habitacion habTraseraPrim) {
        this.habTraseraPrim = habTraseraPrim;
    }

    /**
     * Cambia la habitacion de huespedes
     * @param habTraseraSec Habitacion nueva
     */
    public void setHabTraseraSec(Habitacion habTraseraSec) {
        this.habTraseraSec = habTraseraSec;
    }

    /**
     * Cambia la Cocina de la casa
     * @param cocina Cocina nueva
     */
    public void setCocina(Cocina cocina) {
        this.cocina = cocina;
    }

    /**
     * Cambia de la sala de la casa
     * @param lobby Sala nueva
     */
    public void setLobby(Sala lobby) {
        this.lobby = lobby;
    }    


}
