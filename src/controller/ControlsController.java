/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.ScaleTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.input.MouseEvent;
import javafx.util.Duration;
import tad.Casa;

/**
 * FXML Controller class
 *
 * @author Ricardo Marcano
 */

    
public class ControlsController implements Initializable {
    private Casa home;
    private Group root;
    private MainWindowController controller;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }
    
    public void setController(MainWindowController c){
        this.controller = c;
    }
    
    @FXML
    public void rotateLeft(ActionEvent evt){
        Group r;
        r = controller.getRoot();
        r.setRotate(r.getRotate()+5);
    }
    
    @FXML
    public void rotateRight(ActionEvent evt){
        Group r;
        r = controller.getRoot();
        r.setRotate(r.getRotate()-5);
    }
    
    @FXML
    public void openDoorCocina(ActionEvent evt){
        home.getCocina().getPuerta().abrePuerta();
    }
    
    @FXML
    public void openDoorSala(ActionEvent evt){
        home.getLobby().getPuerta().abrePuerta();
    }
        
    @FXML
    public void openDoorHabPrim(ActionEvent evt){
        home.getHabPrimaria().getPuerta().abrePuerta();
    }
    
    @FXML
    public void openDoorHabPrimTra(ActionEvent evt){
        home.getHabTraseraPrim().getPuerta().abrePuerta();
    }
    
    @FXML
    public void openDoorHabSec(ActionEvent evt){
        home.getHabTraseraSec().getPuerta().abrePuerta();
    }
    
    @FXML
    public void openDoorBanPrin(ActionEvent evt){
        home.getBanPrincipal().getPuerta().abrePuerta();
    }
    
    @FXML
    public void openDoorBanSec(ActionEvent evt){
        home.getBanSegundario().getPuerta().abrePuerta();
    }
    
    @FXML
    public void closeDoorCocina(ActionEvent evt){
        home.getCocina().getPuerta().cierraPuerta();
    }
    
    @FXML
    public void closeDoorSala(ActionEvent evt){
        home.getLobby().getPuerta().cierraPuerta();
    }
    
    @FXML
    public void closeDoorHabPrim(ActionEvent evt){
        home.getHabPrimaria().getPuerta().cierraPuerta();
    }

    @FXML
    public void closeDoorHabPrimTra(ActionEvent evt){
        home.getHabTraseraPrim().getPuerta().cierraPuerta();
    }
    
    @FXML
    public void closeDoorHabSec(ActionEvent evt){
        home.getHabTraseraSec().getPuerta().cierraPuerta();
    }
    
    @FXML
    public void closeDoorBanPrin(ActionEvent evt){
        home.getBanPrincipal().getPuerta().cierraPuerta();
    }
    
    @FXML
    public void closeDoorBanSec(ActionEvent evt){
        home.getBanSegundario().getPuerta().cierraPuerta();
    }
    
    @FXML
    public void openWindowizQHabPrim(ActionEvent evt){
        home.getHabPrimaria().getVentana1().abreVentanaIzq();
    }
    
    @FXML
    public void openWindowDerHabPrim(ActionEvent evt){
        home.getHabPrimaria().getVentana1().abreVentanaDer();
    }
    
    @FXML
    public void closeWindowIzqHabPrim(ActionEvent evt){
        home.getHabPrimaria().getVentana1().cierraVentanaIzq();
    }
    
    @FXML
    public void closeWindowDerHabPrim(ActionEvent evt){
        home.getHabPrimaria().getVentana1().cierraVentanaDer();
    }
    
    @FXML
    public void openWindowIzqHabPrimTra1(ActionEvent evt){
        home.getHabTraseraPrim().getVentana1().abreVentanaIzq();
    }
    
    @FXML
    public void openWindowDerHabPrimTra1(ActionEvent evt){
        home.getHabTraseraPrim().getVentana1().abreVentanaDer();
    }
    
    @FXML
    public void openWindowIzqHabPrimTra2(ActionEvent evt){
        home.getHabTraseraPrim().getVentana2().abreVentanaIzq();
    }
    
    @FXML
    public void openWindowDerHabPrimTra2(ActionEvent evt){
        home.getHabTraseraPrim().getVentana2().abreVentanaDer();
    }
    
    @FXML
    public void closeWindowIzqHabPrimTra1(ActionEvent evt){
        home.getHabTraseraPrim().getVentana1().cierraVentanaIzq();
    }
    
    @FXML
    public void closeWindowDerHabPrimTra1(ActionEvent evt){
        home.getHabTraseraPrim().getVentana1().cierraVentanaDer();
    }
    
    @FXML
    public void closeWindowIzqHabPrimTra2(ActionEvent evt){
        home.getHabTraseraPrim().getVentana2().cierraVentanaIzq();
    }
    
    @FXML
    public void closeWindowDerHabPrimTra2(ActionEvent evt){
        home.getHabTraseraPrim().getVentana2().cierraVentanaDer();
    }
    
    @FXML
    public void openWindowDerHabSec1(ActionEvent evt){
        home.getHabTraseraSec().getVentana1().abreVentanaDer();
    }
    
    @FXML
    public void openWindowIzqHabSec1(ActionEvent evt){
        home.getHabTraseraSec().getVentana1().abreVentanaIzq();
    }
    
    @FXML
    public void openWindowDerHabSec2(ActionEvent evt){
        home.getHabTraseraSec().getVentana2().abreVentanaDer();
    }
    
    @FXML
    public void openWindowIzqHabSec2(ActionEvent evt){
        home.getHabTraseraSec().getVentana2().abreVentanaIzq();
    }
    
    @FXML
    public void closeWindowDerHabSec1(ActionEvent evt){
        home.getHabTraseraSec().getVentana1().cierraVentanaDer();
    }
    
    @FXML
    public void closeWindowIzqHabSec1(ActionEvent evt){
        home.getHabTraseraSec().getVentana1().cierraVentanaIzq();
    }
    
    @FXML
    public void closeWindowDerHabSec2(ActionEvent evt){
        home.getHabTraseraSec().getVentana2().cierraVentanaDer();
    }
    
    @FXML
    public void closeWindowIzqHabSec2(ActionEvent evt){
        home.getHabTraseraSec().getVentana2().cierraVentanaIzq();
    }   
    
    @FXML
    public void focusIn(MouseEvent evt){
        ScaleTransition st = new ScaleTransition();
        st.setNode((Node) evt.getSource());
        st.setByX(0.2);
        st.setByY(0.2);
        st.setDuration(Duration.millis(50));
        st.play();        
    }
    
    @FXML
    public void focusOut(MouseEvent evt){
        ScaleTransition st = new ScaleTransition();
        st.setNode((Node) evt.getSource());
        st.setByX(-0.2);
        st.setByY(-0.2);
        st.setDuration(Duration.millis(50));
        st.play(); 
    }
    public void setCasa(Casa c){
        this.home = c;
    }
}
