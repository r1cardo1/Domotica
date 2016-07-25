
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
    
    private Bano banPrincipal;
    private Bano banSegundario;
    private Habitacion habPrimaria;
    private Habitacion habTraseraPrim;
    private Habitacion habTraseraSec;
    private Cocina cocina;
    private Sala lobby;
    private Group casa;

    public void setCasa(Group casa) {
        this.casa = casa;
    }

    public Group getCasa() {
        return casa;
    }

    public Casa(Bano banPrincipal, Bano banSegundario, Habitacion habPrimaria, Habitacion habTraseraPrim, Habitacion habTraseraSec, Cocina cocina, Sala lobby, Group casa) {
        this.banPrincipal = banPrincipal;
        this.banSegundario = banSegundario;
        this.habPrimaria = habPrimaria;
        this.habTraseraPrim = habTraseraPrim;
        this.habTraseraSec = habTraseraSec;
        this.cocina = cocina;
        this.lobby = lobby;
        this.casa = casa;
    }

    public Casa() {
        
    }

    public Bano getBanPrincipal() {
        return banPrincipal;
    }

    public Bano getBanSegundario() {
        return banSegundario;
    }

    public Habitacion getHabPrimaria() {
        return habPrimaria;
    }

    public Habitacion getHabTraseraPrim() {
        return habTraseraPrim;
    }

    public Habitacion getHabTraseraSec() {
        return habTraseraSec;
    }

    public Cocina getCocina() {
        return cocina;
    }

    public Sala getLobby() {
        return lobby;
    }

    public void setBanPrincipal(Bano banPrincipal) {
        this.banPrincipal = banPrincipal;
    }

    public void setBanSegundario(Bano banSegundario) {
        this.banSegundario = banSegundario;
    }

    public void setHabPrimaria(Habitacion habPrimaria) {
        this.habPrimaria = habPrimaria;
    }

    public void setHabTraseraPrim(Habitacion habTraseraPrim) {
        this.habTraseraPrim = habTraseraPrim;
    }

    public void setHabTraseraSec(Habitacion habTraseraSec) {
        this.habTraseraSec = habTraseraSec;
    }

    public void setCocina(Cocina cocina) {
        this.cocina = cocina;
    }

    public void setLobby(Sala lobby) {
        this.lobby = lobby;
    }    

    public void agregaVentana(Ventana ventana) {
        
    }

    public void agregaPuerta(Puerta puerta) {
        
    }

    public void agregaPared(Pared pared) {
        
    }
}
