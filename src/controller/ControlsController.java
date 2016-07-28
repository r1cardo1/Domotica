/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import fxml.StatusController;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.animation.ScaleTransition;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.Tab;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.util.Duration;
import tad.Administrador;
import tad.Casa;
import tad.Invitado;
import tad.Usuario;

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
    private Administrador admin;
    private Usuario user;
    private Invitado guess;
    private int opc; 
    @FXML TextField nombre;
    @FXML TextField apellido;
    @FXML PasswordField clave;
    @FXML PasswordField confClave;
    @FXML ComboBox tipo;
    @FXML CheckBox hab1;
    @FXML CheckBox hab2;
    @FXML CheckBox hab3;
    @FXML CheckBox cocina;
    @FXML CheckBox sala;
    @FXML CheckBox banprin;
    @FXML CheckBox banseg;
    @FXML ColorPicker cvhab1;
    @FXML ColorPicker cvhab2;
    @FXML ColorPicker cvhab3;
    @FXML ColorPicker cvsala;
    @FXML ColorPicker cvcocina;
    @FXML ColorPicker cvbanprin;
    @FXML ColorPicker cvbanseg;
    @FXML ColorPicker cphab1;
    @FXML ColorPicker cphab2;
    @FXML ColorPicker cphab3;
    @FXML ColorPicker cpsala;
    @FXML ColorPicker cpcocina;
    @FXML ColorPicker cpbanprin;
    @FXML ColorPicker cpbanseg;
    @FXML Tab phab1;
    @FXML Tab phab2;
    @FXML Tab phab3;
    @FXML Tab pcocina;
    @FXML Tab psala;
    @FXML Tab pbanprin;
    @FXML Tab pbanseg;
    @FXML Tab vsala;
    @FXML Tab vcocina;
    @FXML Tab vhab1;
    @FXML Tab vhab2;
    @FXML Tab vhab3;
    @FXML Tab tadmin;
    @FXML Tab lhab1;
    @FXML Tab lhab2;
    @FXML Tab lhab3;
    @FXML Tab lcocina;
    @FXML Tab lsala;
    @FXML Tab lbanprin;
    @FXML Tab lbanseg;
       
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        loadTipo();
        loadColor();
        
    }
    

    public void loadTipo(){
        tipo.getItems().addAll("Administrador",
                                "Usuario",
                                "Invitado");
        tipo.getSelectionModel().select(0);
        tipo.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
        @Override
        public void changed(ObservableValue observableValue, String old, String neww) {
            if(neww.equals("Invitado")){
                hab1.setDisable(false);
                hab2.setDisable(false);
                hab3.setDisable(false);
                sala.setDisable(false);
                cocina.setDisable(false);
                banprin.setDisable(false);
                banseg.setDisable(false);
            }
            else{
                hab1.setDisable(true);
                hab2.setDisable(true);
                hab3.setDisable(true);
                sala.setDisable(true);
                cocina.setDisable(true);
                banprin.setDisable(true);
                banseg.setDisable(true);
            }
        }
    });
    }
    
    public void loadColor(){
        cvhab1.setOnAction(new EventHandler(){
            public void handle(Event evt){
                home.getHabPrimaria().getVentana1().setColor(cvhab1.getValue());
            }
        });
        
        cvhab2.setOnAction(new EventHandler(){
            public void handle(Event evt){
                home.getHabTraseraPrim().getVentana1().setColor(cvhab2.getValue());
                home.getHabTraseraPrim().getVentana2().setColor(cvhab2.getValue());
            }
        });
        
        cvhab3.setOnAction(new EventHandler(){
            public void handle(Event evt){
                home.getHabTraseraSec().getVentana1().setColor(cvhab3.getValue());
                home.getHabTraseraSec().getVentana2().setColor(cvhab3.getValue());
            }
        });
        
        cvsala.setOnAction(new EventHandler(){
            public void handle(Event evt){
                home.getLobby().getVentana1().setColor(cvsala.getValue());
                home.getLobby().getVentana2().setColor(cvsala.getValue());
            }
        });
        
        cvcocina.setOnAction(new EventHandler(){
            public void handle(Event evt){
                home.getCocina().getVentana1().setColor(cvcocina.getValue());
                home.getCocina().getVentana2().setColor(cvcocina.getValue());
                home.getCocina().getVentana3().setColor(cvcocina.getValue());
            }
        });
        
        cphab1.setOnAction(new EventHandler(){
            public void handle(Event evt){
                home.getHabPrimaria().getPuerta().setColor(cphab1.getValue());
            }
        });
        
        cphab2.setOnAction(new EventHandler(){
            public void handle(Event evt){
                home.getHabTraseraPrim().getPuerta().setColor(cphab2.getValue());

            }
        });
        
        cphab3.setOnAction(new EventHandler(){
            public void handle(Event evt){
                home.getHabTraseraSec().getPuerta().setColor(cphab3.getValue());

            }
        });
        
        cpsala.setOnAction(new EventHandler(){
            public void handle(Event evt){
                home.getLobby().getPuerta().setColor(cpsala.getValue());
            }
        });
        
        cpcocina.setOnAction(new EventHandler(){
            public void handle(Event evt){
                home.getCocina().getPuerta().setColor(cpcocina.getValue());
            }
        });
        
        cpbanprin.setOnAction(new EventHandler(){
            public void handle(Event evt){
                home.getBanPrincipal().getPuerta().setColor(cpbanprin.getValue());
            }
        });
        
        cpbanseg.setOnAction(new EventHandler(){
            public void handle(Event evt){
                home.getBanSegundario().getPuerta().setColor(cpbanseg.getValue());
            }
        });
    }
    
    public void initControls(){
        System.out.println(opc);
        if(opc==1){
            stats.setUser(admin.getNombre()+" "+admin.getApellido());
        }
        if(opc==2){
            stats.setUser(user.getNombre()+" "+user.getApellido());
        }
        if(opc==3){
            stats.setUser(guess.getNombre()+" "+guess.getApellido());
            setGuessPrivilegies();
            System.out.println("Estableciendo Privilegios");
        }
    }
    
    public void setGuessPrivilegies(){
        ArrayList<String> l = guess.getZonas();
        if(l.contains("hab1")){
            phab1.setDisable(true);
            vhab1.setDisable(true);
            lhab1.setDisable(true);
        }
        if(l.contains("hab2")){
            phab2.setDisable(true);
            vhab2.setDisable(true);
            lhab2.setDisable(true);
        }
        if(l.contains("hab3")){
            phab3.setDisable(true);
            vhab3.setDisable(true);
            lhab3.setDisable(true);
        }
        if(l.contains("sala")){
            psala.setDisable(true);
            vsala.setDisable(true);
            lsala.setDisable(true);
        }
        if(l.contains("cocina")){
            pcocina.setDisable(true);
            vcocina.setDisable(true);
            lcocina.setDisable(true);
        }
        if(l.contains("banprin")){
            pbanprin.setDisable(true);
            lbanprin.setDisable(true);
        }
        if(l.contains("banseg")){
            pbanseg.setDisable(true);
            lbanseg.setDisable(true);
        }
        
        tadmin.setDisable(true);
    }
    
    public void setStats(StatusController s){
        this.stats = s;
    }
    
    public void setController(MainWindowController c){
        this.controller = c;
    }
    
    @FXML public void openDoorCocina(ActionEvent evt){
        home.getCocina().getPuerta().abrePuerta();
        setError(stats.getPcocina(),"Abierta");
    }
    
    @FXML public void openDoorSala(ActionEvent evt){
        home.getLobby().getPuerta().abrePuerta();
        setError(stats.getPsala(),"Abierta");
    }
    
    @FXML public void openDoorHabPrim(ActionEvent evt){
        home.getHabPrimaria().getPuerta().abrePuerta();
        setError(stats.getPhab1(),"Abierta");
    }
    
    @FXML public void openDoorHabPrimTra(ActionEvent evt){
        home.getHabTraseraPrim().getPuerta().abrePuerta();
        setError(stats.getPhab2(),"Abierta");
    }
    
    @FXML public void openDoorHabSec(ActionEvent evt){
        home.getHabTraseraSec().getPuerta().abrePuerta();
        setError(stats.getPhab3(),"Abierta");
    }
    
    @FXML public void openDoorBanPrin(ActionEvent evt){
        home.getBanPrincipal().getPuerta().abrePuerta();
        setError(stats.getPbanprin(),"Abierta");
    }
    
    @FXML public void openDoorBanSec(ActionEvent evt){
        home.getBanSegundario().getPuerta().abrePuerta();
        setError(stats.getPbanseg(),"Abierta");
    }
    
    @FXML public void closeDoorCocina(ActionEvent evt){
        home.getCocina().getPuerta().cierraPuerta();
        setCheck(stats.getPcocina(),"Cerrada");
    }
    
    @FXML public void closeDoorSala(ActionEvent evt){
        home.getLobby().getPuerta().cierraPuerta();
        setCheck(stats.getPsala(),"Cerrada");
    }
    
    @FXML public void closeDoorHabPrim(ActionEvent evt){
        home.getHabPrimaria().getPuerta().cierraPuerta();
        setCheck(stats.getPhab1(),"Cerrada");
    }

    @FXML public void closeDoorHabPrimTra(ActionEvent evt){
        home.getHabTraseraPrim().getPuerta().cierraPuerta();
        setCheck(stats.getPhab2(),"Cerrada");
    }
    
    @FXML public void closeDoorHabSec(ActionEvent evt){
        home.getHabTraseraSec().getPuerta().cierraPuerta();
        setCheck(stats.getPhab3(),"Cerrada");
    }
    
    @FXML public void closeDoorBanPrin(ActionEvent evt){
        home.getBanPrincipal().getPuerta().cierraPuerta();
        setCheck(stats.getPbanprin(),"Cerrada");
    }
    
    @FXML public void closeDoorBanSec(ActionEvent evt){
        home.getBanSegundario().getPuerta().cierraPuerta();
        setCheck(stats.getPbanseg(),"Cerrada");
    }
    
    @FXML public void openWindowIzqHabPrim(ActionEvent evt){
        home.getHabPrimaria().getVentana1().abreVentanaIzq();
    }
    
    @FXML public void openWindowDerHabPrim(ActionEvent evt){
        home.getHabPrimaria().getVentana1().abreVentanaDer();
    }
    
    @FXML public void closeWindowHabPrim(ActionEvent evt){
        home.getHabPrimaria().getVentana1().cierraVentanaIzq();
        home.getHabPrimaria().getVentana1().cierraVentanaDer();
    }
    
    @FXML public void openWindowIzqHabPrimTra1(ActionEvent evt){
        home.getHabTraseraPrim().getVentana1().abreVentanaIzq();
    }
    
    @FXML public void openWindowDerHabPrimTra1(ActionEvent evt){
        home.getHabTraseraPrim().getVentana1().abreVentanaDer();
    }
    
    @FXML public void openWindowIzqHabPrimTra2(ActionEvent evt){
        home.getHabTraseraPrim().getVentana2().abreVentanaIzq();
    }
    
    @FXML public void openWindowDerHabPrimTra2(ActionEvent evt){
        home.getHabTraseraPrim().getVentana2().abreVentanaDer();
    }
    
    @FXML public void closeWindowHabPrimTra1(ActionEvent evt){
        home.getHabTraseraPrim().getVentana1().cierraVentanaIzq();
        home.getHabTraseraPrim().getVentana1().cierraVentanaDer();
    }
    
    @FXML public void closeWindowHabPrimTra2(ActionEvent evt){
        home.getHabTraseraPrim().getVentana2().cierraVentanaIzq();
        home.getHabTraseraPrim().getVentana2().cierraVentanaDer();
    }
    
    @FXML public void openWindowDerHabSec1(ActionEvent evt){
        home.getHabTraseraSec().getVentana1().abreVentanaDer();
    }
    
    @FXML public void openWindowIzqHabSec1(ActionEvent evt){
        home.getHabTraseraSec().getVentana1().abreVentanaIzq();
    }
    
    @FXML public void openWindowDerHabSec2(ActionEvent evt){
        home.getHabTraseraSec().getVentana2().abreVentanaDer();
    }
    
    @FXML public void openWindowIzqHabSec2(ActionEvent evt){
        home.getHabTraseraSec().getVentana2().abreVentanaIzq();
    }    
    
    @FXML public void closeWindowHabSec1(ActionEvent evt){
        home.getHabTraseraSec().getVentana1().cierraVentanaDer();
        home.getHabTraseraSec().getVentana1().cierraVentanaIzq();
    }
    
    @FXML public void closeWindowHabSec2(ActionEvent evt){
        home.getHabTraseraSec().getVentana2().cierraVentanaDer();
        home.getHabTraseraSec().getVentana2().cierraVentanaIzq();
    } 
    
    @FXML public void openWindowIzqCocina1(ActionEvent evt){
        home.getCocina().getVentana1().abreVentanaIzq();
    }
    
    @FXML public void openWindowDerCocina1(ActionEvent evt){
        home.getCocina().getVentana1().abreVentanaDer();
    }
    
    @FXML public void closeWindowCocina1(ActionEvent evt){
        home.getCocina().getVentana1().cierraVentanaDer();
        home.getCocina().getVentana1().cierraVentanaIzq();
    }
    
    @FXML public void openWindowIzqCocina2(ActionEvent evt){
        home.getCocina().getVentana2().abreVentanaIzq();
    }
    
    @FXML public void openWindowDerCocina2(ActionEvent evt){
        home.getCocina().getVentana2().abreVentanaDer();
    }
    
    @FXML public void closeWindowCocina2(ActionEvent evt){
        home.getCocina().getVentana2().cierraVentanaDer();
        home.getCocina().getVentana2().cierraVentanaIzq();
    }
    
    @FXML public void openWindowIzqCocina3(ActionEvent evt){
        home.getCocina().getVentana3().abreVentanaIzq();        
    }
    
    @FXML public void openWindowDerCocina3(ActionEvent evt){
        home.getCocina().getVentana3().abreVentanaDer();
    }
    
    @FXML public void closeWindowCocina3(ActionEvent evt){
        home.getCocina().getVentana3().cierraVentanaDer();
        home.getCocina().getVentana3().cierraVentanaIzq();
    }
    
    @FXML public void openWindowDerSala1(ActionEvent evt){
        home.getLobby().getVentana1().abreVentanaDer();
    }
    
    @FXML public void openWindowIzqSala1(ActionEvent evt){
        home.getLobby().getVentana1().abreVentanaIzq();
    }
    
    @FXML public void openWindowDerSala2(ActionEvent evt){
        home.getLobby().getVentana2().abreVentanaDer();
    }
    
    @FXML public void openWindowIzqSala2(ActionEvent evt){
        home.getLobby().getVentana2().abreVentanaIzq();
    }
    
    @FXML public void closeWindowSala1(ActionEvent evt){
        home.getLobby().getVentana1().cierraVentanaDer();
        home.getLobby().getVentana1().cierraVentanaIzq();
    }
    
    @FXML public void closeWindowSala2(ActionEvent evt){
        home.getLobby().getVentana2().cierraVentanaDer();
        home.getLobby().getVentana2().cierraVentanaIzq();
    }    
    
    @FXML public void enciendeLuzHabPrim(ActionEvent evt){
        home.getHabPrimaria().getIluminacion().enciendeLuz();
    }
    
    @FXML public void apagaLuzHabPrim(ActionEvent evt){
        home.getHabPrimaria().getIluminacion().apagaLuz();
    }
    
    @FXML public void enciendeLuzHabPrimTra(ActionEvent evt){
        home.getHabTraseraPrim().getIluminacion().enciendeLuz();
    }
    
    @FXML public void apagaLuzHabPrimTra(ActionEvent evt){
        home.getHabTraseraPrim().getIluminacion().apagaLuz();
    }
    
    @FXML public void enciendeLuzHabSeg(ActionEvent evt){
        home.getHabTraseraSec().getIluminacion().enciendeLuz();
    }
    
    @FXML public void apagaLuzHabSeg(ActionEvent evt){
        home.getHabTraseraSec().getIluminacion().apagaLuz();
    }
    
    @FXML public void enciendeLuzCocina(ActionEvent evt){
        home.getCocina().getIluminacion().enciendeLuz();
        home.getCocina().getIluminacion1().enciendeLuz();
    }
    
    @FXML public void apagaLuzCocina(ActionEvent evt){
        home.getCocina().getIluminacion().apagaLuz();
        home.getCocina().getIluminacion1().apagaLuz();
    }
    
    @FXML public void enciendeLuzSala(ActionEvent evt){
        home.getLobby().getLuz().enciendeLuz();
    }
    
    @FXML public void apagaLuzSala(ActionEvent evt){
        home.getLobby().getLuz().apagaLuz();
    }
    
    @FXML public void enciendeLuzBanPrim(ActionEvent evt){
        home.getBanPrincipal().getIluminacion().enciendeLuz();
    }
    
    @FXML public void apagaLuzBanPrim(ActionEvent evt){
        home.getBanPrincipal().getIluminacion().apagaLuz();
    }
    
    @FXML public void enciendeLuzBanSeg(ActionEvent evt){
        home.getBanSegundario().getIluminacion().enciendeLuz();
    }
    
    @FXML public void apagaLuzBanSeg(ActionEvent evt){
        home.getBanSegundario().getIluminacion().apagaLuz();
    }
    
    @FXML public void focusIn(MouseEvent evt){

        ScaleTransition st = new ScaleTransition();
        st.setNode((Node) evt.getSource());
        st.setFromX(1);
        st.setFromY(1);
        st.setToX(1.2);
        st.setToY(1.2);
        st.setDuration(Duration.millis(50));
        st.play();        
    }
    
    @FXML public void focusOut(MouseEvent evt){
        ScaleTransition st = new ScaleTransition();
        st.setNode((Node) evt.getSource());
        st.setFromX(1.2);
        st.setFromY(1.2);
        st.setToX(1);
        st.setToY(1);
        st.setDuration(Duration.millis(50));
        st.play(); 
    }
    
    @FXML public void newUser(ActionEvent evt) throws FileNotFoundException, IOException, ClassNotFoundException{
        if(!nombre.getText().isEmpty() && !apellido.getText().isEmpty() && !clave.getText().isEmpty() && !confClave.getText().isEmpty()){
            if(tipo.getSelectionModel().getSelectedItem().equals("Administrador")){
                if(!new File("C:/Data").isDirectory())
                    new File("C:/Data").mkdirs();
                ArrayList<Administrador> lista = cargaAdmin();
                File f = new File("C:/Data/AdminData");
                FileOutputStream fos = new FileOutputStream(f);                
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                Administrador admin;
                admin = new Administrador(nombre.getText(),apellido.getText(),clave.getText());
                lista.add(admin);
                oos.writeObject(lista);
                oos.close();           
            }
            if(tipo.getSelectionModel().getSelectedItem().equals("Usuario")){
                if(!new File("C:/Data").isDirectory())
                    new File("C:/Data").mkdirs();
                ArrayList<Usuario> lista = cargaUser();
                File f = new File("C:/Data/UserData");
                FileOutputStream fos = new FileOutputStream(f);                
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                Usuario user;
                user = new Usuario(nombre.getText(),apellido.getText(),clave.getText());
                lista.add(user);
                oos.writeObject(lista);
                oos.close();
            }
            if(tipo.getSelectionModel().getSelectedItem().equals("Invitado")){
                if(!new File("C:/Data").isDirectory())
                    new File("C:/Data").mkdirs();
                ArrayList<Invitado> lista = cargaGuess();
                File f = new File("C:/Data/GuessData");
                FileOutputStream fos = new FileOutputStream(f);                
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                Invitado guess;
                guess = new Invitado(nombre.getText(),apellido.getText(),clave.getText());
                lista.add(loadPrivilegios(guess));
                oos.writeObject(lista);
                oos.close();
                System.out.println("Archivo guardado");
            }
        }
    }
    
    @FXML public void openAllWindow(ActionEvent evt){
        home.getHabPrimaria().getVentana1().abreVentanaDer();
        home.getHabTraseraPrim().getVentana1().abreVentanaDer();
        home.getHabTraseraPrim().getVentana2().abreVentanaDer();
        home.getHabTraseraSec().getVentana1().abreVentanaDer();
        home.getHabTraseraSec().getVentana2().abreVentanaDer();
        home.getCocina().getVentana1().abreVentanaDer();
        home.getCocina().getVentana2().abreVentanaDer();
        home.getCocina().getVentana3().abreVentanaDer();
        home.getLobby().getVentana1().abreVentanaDer();
        home.getLobby().getVentana2().abreVentanaDer();  
        stats.setAllWindowOpen();
    }
    
    @FXML public void closeAllWindow(ActionEvent evt){
        home.getHabPrimaria().getVentana1().cierraVentanaDer();
        home.getHabTraseraPrim().getVentana1().cierraVentanaDer();
        home.getHabTraseraPrim().getVentana2().cierraVentanaDer();
        home.getHabTraseraSec().getVentana1().cierraVentanaDer();
        home.getHabTraseraSec().getVentana2().cierraVentanaDer();
        home.getCocina().getVentana1().cierraVentanaDer();
        home.getCocina().getVentana2().cierraVentanaDer();
        home.getCocina().getVentana3().cierraVentanaDer();
        home.getLobby().getVentana1().cierraVentanaDer();
        home.getLobby().getVentana2().cierraVentanaDer();    
        stats.setAllWindowClosed();
    }
    
    @FXML public void openAllDoor(ActionEvent evt){
        home.getHabPrimaria().getPuerta().abrePuerta();
        home.getHabTraseraPrim().getPuerta().abrePuerta();
        home.getHabTraseraSec().getPuerta().abrePuerta();
        home.getCocina().getPuerta().abrePuerta();
        home.getLobby().getPuerta().abrePuerta();
        home.getBanPrincipal().getPuerta().abrePuerta();
        home.getBanSegundario().getPuerta().abrePuerta();
        stats.setAllDoorOpen();
    }
    
    @FXML public void closeAllDoor(ActionEvent evt){
        home.getHabPrimaria().getPuerta().cierraPuerta();
        home.getHabTraseraPrim().getPuerta().cierraPuerta();
        home.getHabTraseraSec().getPuerta().cierraPuerta();
        home.getCocina().getPuerta().cierraPuerta();
        home.getLobby().getPuerta().cierraPuerta();
        home.getBanPrincipal().getPuerta().cierraPuerta();
        home.getBanSegundario().getPuerta().cierraPuerta();
        stats.setAllDoorClosed();
    }
    
    @FXML public void singOut(ActionEvent evt) throws IOException{
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/Login.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        Button b = (Button) evt.getSource();
        Stage st = (Stage) b.getScene().getWindow();
        st.close();
    }
    
    public Invitado loadPrivilegios(Invitado guess){
        if(hab1.isSelected())
            guess.addZona("hab1");
        if(hab2.isSelected())
            guess.addZona("hab2");
        if(hab3.isSelected())
            guess.addZona("hab3");
        if(sala.isSelected())
            guess.addZona("sala");
        if(cocina.isSelected())
            guess.addZona("cocina");
        if(banprin.isSelected())
            guess.addZona("banprin");
        if(banseg.isSelected())
            guess.addZona("banseg");
        return guess;
    }
    
    public ArrayList<Administrador> cargaAdmin() throws FileNotFoundException, IOException, ClassNotFoundException{
        ArrayList<Administrador> lista;
        if(!new File("C:/Data").isDirectory())
            new File("C:/Data").mkdirs();
        if(new File("C:/Data/AdminData").isFile()){
        File f = new File("C:/Data/AdminData");
        FileInputStream fis = new FileInputStream(f);
        ObjectInputStream ois = new ObjectInputStream(fis);
        lista = (ArrayList<Administrador>) ois.readObject();
        if(lista!=null)
            return lista;
        else
            lista = new ArrayList<>();
        }
        else
            lista = new ArrayList<>();
        return lista;
    }
    
    public ArrayList<Usuario> cargaUser() throws FileNotFoundException, IOException, ClassNotFoundException{
        ArrayList<Usuario> lista;
        if(!new File("C:/Data").isDirectory())
            new File("C:/Data").mkdirs();
        if(new File("C:/Data/UserData").isFile()){
        File f = new File("C:/Data/UserData");
        FileInputStream fis = new FileInputStream(f);
        ObjectInputStream ois = new ObjectInputStream(fis);
        lista = (ArrayList<Usuario>) ois.readObject();
        if(lista!=null)
            return lista;
        else
            lista = new ArrayList<>();
        }
        else
            lista = new ArrayList<>();
        return lista;
    }
    
    public ArrayList<Invitado> cargaGuess() throws FileNotFoundException, IOException, ClassNotFoundException{
        ArrayList<Invitado> lista;
        if(!new File("C:/Data").isDirectory())
            new File("C:/Data").mkdirs();
        if(new File("C:/Data/GuessData").isFile()){
        File f = new File("C:/Data/GuessData");
        FileInputStream fis = new FileInputStream(f);
        ObjectInputStream ois = new ObjectInputStream(fis);
        lista = (ArrayList<Invitado>) ois.readObject();
        if(lista!=null)
            return lista;
        else
            lista = new ArrayList<>();
        }
        else
            lista = new ArrayList<>();
        return lista;
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
    
    public void setAdmin(Administrador admin) {
        this.admin = admin;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }

    public void setGuess(Invitado guess) {
        this.guess = guess;
    }

    public void setOpc(int opc) {
        this.opc = opc;
    }
    
}
