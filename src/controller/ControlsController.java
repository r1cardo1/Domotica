/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import fxml.StatusController;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.ScaleTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
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
    StatusController stats;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }
    
    public void setStats(StatusController s){
        this.stats = s;
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
        setError(stats.getPcocina(),"Abierta");
    }
    
    @FXML
    public void openDoorSala(ActionEvent evt){
        home.getLobby().getPuerta().abrePuerta();
        setError(stats.getPsala(),"Abierta");
    }
        
    @FXML
    public void openDoorHabPrim(ActionEvent evt){
        home.getHabPrimaria().getPuerta().abrePuerta();
        setError(stats.getPhab1(),"Abierta");
    }
    
    @FXML
    public void openDoorHabPrimTra(ActionEvent evt){
        home.getHabTraseraPrim().getPuerta().abrePuerta();
        setError(stats.getPhab2(),"Abierta");
    }
    
    @FXML
    public void openDoorHabSec(ActionEvent evt){
        home.getHabTraseraSec().getPuerta().abrePuerta();
        setError(stats.getPhab3(),"Abierta");
    }
    
    @FXML
    public void openDoorBanPrin(ActionEvent evt){
        home.getBanPrincipal().getPuerta().abrePuerta();
        setError(stats.getPbanprin(),"Abierta");
    }
    
    @FXML
    public void openDoorBanSec(ActionEvent evt){
        home.getBanSegundario().getPuerta().abrePuerta();
        setError(stats.getPbanseg(),"Abierta");
    }
    
    @FXML
    public void closeDoorCocina(ActionEvent evt){
        home.getCocina().getPuerta().cierraPuerta();
        setCheck(stats.getPcocina(),"Cerrada");
    }
    
    @FXML
    public void closeDoorSala(ActionEvent evt){
        home.getLobby().getPuerta().cierraPuerta();
        setCheck(stats.getPsala(),"Cerrada");
    }
    
    @FXML
    public void closeDoorHabPrim(ActionEvent evt){
        home.getHabPrimaria().getPuerta().cierraPuerta();
        setCheck(stats.getPhab1(),"Cerrada");
    }

    @FXML
    public void closeDoorHabPrimTra(ActionEvent evt){
        home.getHabTraseraPrim().getPuerta().cierraPuerta();
        setCheck(stats.getPhab2(),"Cerrada");
    }
    
    @FXML
    public void closeDoorHabSec(ActionEvent evt){
        home.getHabTraseraSec().getPuerta().cierraPuerta();
        setCheck(stats.getPhab3(),"Cerrada");
    }
    
    @FXML
    public void closeDoorBanPrin(ActionEvent evt){
        home.getBanPrincipal().getPuerta().cierraPuerta();
        setCheck(stats.getPbanprin(),"Cerrada");
    }
    
    @FXML
    public void closeDoorBanSec(ActionEvent evt){
        home.getBanSegundario().getPuerta().cierraPuerta();
        setCheck(stats.getPbanseg(),"Cerrada");
    }
    
    @FXML
    public void openWindowIzqHabPrim(ActionEvent evt){
        home.getHabPrimaria().getVentana1().abreVentanaIzq();
    }
    
    @FXML
    public void openWindowDerHabPrim(ActionEvent evt){
        home.getHabPrimaria().getVentana1().abreVentanaDer();
    }
    
    @FXML
    public void closeWindowHabPrim(ActionEvent evt){
        home.getHabPrimaria().getVentana1().cierraVentanaIzq();
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
    public void closeWindowHabPrimTra1(ActionEvent evt){
        home.getHabTraseraPrim().getVentana1().cierraVentanaIzq();
        home.getHabTraseraPrim().getVentana1().cierraVentanaDer();
    }
        
    @FXML
    public void closeWindowHabPrimTra2(ActionEvent evt){
        home.getHabTraseraPrim().getVentana2().cierraVentanaIzq();
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
    public void closeWindowHabSec1(ActionEvent evt){
        home.getHabTraseraSec().getVentana1().cierraVentanaDer();
        home.getHabTraseraSec().getVentana1().cierraVentanaIzq();
    }
    
    @FXML
    public void closeWindowHabSec2(ActionEvent evt){
        home.getHabTraseraSec().getVentana2().cierraVentanaDer();
        home.getHabTraseraSec().getVentana2().cierraVentanaIzq();
    } 
    
    @FXML
    public void openWindowIzqCocina1(ActionEvent evt){
        home.getCocina().getVentana1().abreVentanaIzq();
    }
    
    @FXML
    public void openWindowDerCocina1(ActionEvent evt){
        home.getCocina().getVentana1().abreVentanaDer();
    }
    
    @FXML
    public void closeWindowCocina1(ActionEvent evt){
        home.getCocina().getVentana1().cierraVentanaDer();
        home.getCocina().getVentana1().cierraVentanaIzq();
    }
    
    @FXML
    public void openWindowIzqCocina2(ActionEvent evt){
        home.getCocina().getVentana2().abreVentanaIzq();
    }
    
    @FXML
    public void openWindowDerCocina2(ActionEvent evt){
        home.getCocina().getVentana2().abreVentanaDer();
    }
    
    @FXML
    public void closeWindowCocina2(ActionEvent evt){
        home.getCocina().getVentana2().cierraVentanaDer();
        home.getCocina().getVentana2().cierraVentanaIzq();
    }
    
    @FXML
    public void openWindowIzqCocina3(ActionEvent evt){
        home.getCocina().getVentana3().abreVentanaIzq();        
    }
    
    @FXML
    public void openWindowDerCocina3(ActionEvent evt){
        home.getCocina().getVentana3().abreVentanaDer();
    }
    
    @FXML
    public void closeWindowCocina3(ActionEvent evt){
        home.getCocina().getVentana3().cierraVentanaDer();
        home.getCocina().getVentana3().cierraVentanaIzq();
    }
    
    @FXML
    public void enciendeLuzHabPrim(ActionEvent evt){
        home.getHabPrimaria().getIluminacion().enciendeLuz();
    }
    
    @FXML
    public void apagaLuzHabPrim(ActionEvent evt){
        home.getHabPrimaria().getIluminacion().apagaLuz();
    }
    
    @FXML
    public void enciendeLuzHabPrimTra(ActionEvent evt){
        home.getHabTraseraPrim().getIluminacion().enciendeLuz();
    }
    
    @FXML
    public void apagaLuzHabPrimTra(ActionEvent evt){
        home.getHabTraseraPrim().getIluminacion().apagaLuz();
    }
    
    @FXML
    public void enciendeLuzHabSeg(ActionEvent evt){
        home.getHabTraseraSec().getIluminacion().enciendeLuz();
    }
    
    @FXML
    public void apagaLuzHabSeg(ActionEvent evt){
        home.getHabTraseraSec().getIluminacion().apagaLuz();
    }
    
    @FXML
    public void enciendeLuzCocina(ActionEvent evt){
        home.getCocina().getIluminacion().enciendeLuz();
        home.getCocina().getIluminacion1().enciendeLuz();
    }
    
    @FXML
    public void apagaLuzCocina(ActionEvent evt){
        home.getCocina().getIluminacion().apagaLuz();
        home.getCocina().getIluminacion1().apagaLuz();
    }
    
    @FXML
    public void enciendeLuzSala(ActionEvent evt){
        home.getLobby().getLuz().enciendeLuz();
    }
    
    @FXML
    public void apagaLuzSala(ActionEvent evt){
        home.getLobby().getLuz().apagaLuz();
    }
    
    @FXML
    public void enciendeLuzBanPrim(ActionEvent evt){
        home.getBanPrincipal().getIluminacion().enciendeLuz();
    }
    
    @FXML
    public void apagaLuzBanPrim(ActionEvent evt){
        home.getBanPrincipal().getIluminacion().apagaLuz();
    }
    
    @FXML
    public void enciendeLuzBanSeg(ActionEvent evt){
        home.getBanSegundario().getIluminacion().enciendeLuz();
    }
    
    @FXML
    public void apagaLuzBanSeg(ActionEvent evt){
        home.getBanSegundario().getIluminacion().apagaLuz();
    }
    
    @FXML
    public void focusIn(MouseEvent evt){
        Button b = (Button) evt.getSource();
        System.out.println(b.getWidth()+" "+b.getHeight());
        ScaleTransition st = new ScaleTransition();
        st.setNode((Node) evt.getSource());
        st.setFromX(1);
        st.setFromY(1);
        st.setToX(1.2);
        st.setToY(1.2);
        st.setDuration(Duration.millis(50));
        st.play();        
    }
    
    @FXML
    public void focusOut(MouseEvent evt){
        ScaleTransition st = new ScaleTransition();
        st.setNode((Node) evt.getSource());
        st.setFromX(1.2);
        st.setFromY(1.2);
        st.setToX(1);
        st.setToY(1);
        st.setDuration(Duration.millis(50));
        st.play(); 
    }
    
    public void setCheck(Label txt,String s){
        txt.setGraphic(new ImageView(new Image(getClass().getResource("/images/check.png").toExternalForm())));
        txt.setTextFill(Color.GREEN);
        txt.setText(s);
    }
    
    public void setError(Label txt,String s){
        txt.setGraphic(new ImageView(new Image(getClass().getResource("/images/error.png").toExternalForm())));
        txt.setTextFill(Color.RED);
        txt.setText(s);
    }
    
    public void setCasa(Casa c){
        this.home = c;
    }
}
