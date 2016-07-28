/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Group;
import javafx.scene.PerspectiveCamera;
import javafx.scene.Scene;
import javafx.scene.SceneAntialiasing;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Box;
import javafx.scene.shape.MeshView;
import javafx.scene.transform.Rotate;
import javafx.scene.transform.Translate;
import javafx.stage.Stage;
import tad.Administrador;
import tad.Bano;
import tad.Casa;
import tad.Cocina;
import tad.Habitacion;
import tad.Invitado;
import tad.Luz;
import tad.Pared;
import tad.Puerta;
import tad.Sala;
import tad.Usuario;
import tad.Ventana;

/**
 * FXML Controller class
 *
 * @author Ricardo Marcano
 */
public class LoginController implements Initializable {

    private MainWindowController stage1;
    private ControlsController stage2;    
    private Casa home = new Casa();
    Administrador administrador;
    Usuario usuario;
    Invitado guess;
    @FXML TextField nombre;
    @FXML PasswordField clave;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }
    
    @FXML public void logIn(ActionEvent evt) throws IOException{
        if(!nombre.getText().isEmpty() && !clave.getText().isEmpty()){
            if(nombre.getText().equals("Admin") && clave.getText().equals("111111")){
                startHome(1);
                administrador = new Administrador("ROOT","ROOT","111111");
                Button b = (Button) evt.getSource();
                Stage scene = (Stage) b.getScene().getWindow();
                scene.close();                
            }
        }
    }
    
    public void startHome(int opc) throws IOException{
    Stage stage=new Stage();
    final Group root = new Group();
    addFloor(root);    
    // Load home graphic
    
    FXMLLoader loaderHome = new FXMLLoader(getClass().getResource("/fxml/Drawing3.fxml"));

    // Load control panel
    
    FXMLLoader loaderPanel = new FXMLLoader(getClass().getResource("/fxml/Controls.fxml"));
    
    // Load Stats panel
    
    FXMLLoader loaderStats = new FXMLLoader(getClass().getResource("/fxml/Status.fxml"));

    // Add both to scene
    AnchorPane statsPne = loaderStats.load();
    Group homeLoad = loaderHome.load();
    root.getChildren().add(loaderPanel.load());
    root.getChildren().add(homeLoad);
    root.getChildren().add(statsPne);
        
    // Get ready controllers
    
        stage1 = loaderHome.getController();
        stage2 = loaderPanel.getController();
        stage2.setController(stage1);  
        stage2.setStats(loaderStats.getController());
        stage2.setOpc(opc);
            if(opc==1)
                stage2.setAdmin(administrador);
            if(opc==2)
                stage2.setUser(usuario);
            if(opc==3)
                stage2.setGuess(guess);
    
    // init TAD Data
        initD(homeLoad);    
    stage2.setCasa(home);
    Scene scene = new Scene(root,1300,700,true,SceneAntialiasing.BALANCED);
    scene.setCamera(addCamera());    
    stage.setScene(scene);
    stage.setTitle("JavaFX 3D");
    stage.setX(0);
    stage.setY(0);
    stage.show();
    
    
    
    
    }
    
    public PerspectiveCamera addCamera(){
        PerspectiveCamera cam = new PerspectiveCamera();
        cam.setFieldOfView(20);
        cam.setFarClip(10000);
        cam.setNearClip(0.01);
        cam.getTransforms().addAll(new Rotate(60,Rotate.X_AXIS),new Translate(-200,-200,300));
        return cam;
    } 
    
    public void addFloor(Group root){
        final Box floor = new Box(1000, 500, 1);
        floor.setTranslateX(200);
        floor.setTranslateY(200);
        floor.setTranslateZ(250);
         PhongMaterial phongMaterial = new PhongMaterial();
        phongMaterial.setDiffuseMap(new Image(getClass().getResource("/images/piso.jpg").toExternalForm()));
        floor.setMaterial(phongMaterial);
        root.getChildren().add(floor);
    }
    
    public void initD(Group root){
        ///// Datos Habitacion Primaria
        home.setHabPrimaria(new Habitacion(new Puerta(1.9,0.80,"Madera",findMesh(root,"_ncl1_23")),
                new Ventana(1.0,1.5,"Cristal",findMesh(root,"_ncl1_28"),findMesh(root,"_ncl1_8")),
                new Luz(1.0,Color.WHITE,findMesh(root,"_ncl1_38"))));
        
        ///// Datos Habitacion segundaria
        home.setHabTraseraPrim(new Habitacion(new Puerta(1.9,0.80,"Madera",findMesh(root,"_ncl1_24")),
                new Ventana(1.0,1.5,"Cristal",findMesh(root,"_ncl1_13"),findMesh(root,"_ncl1_11")),
                new Ventana(1.0,1.5,"Cristal",findMesh(root,"_ncl1_17"),findMesh(root,"_ncl1_16")),
                new Luz(1.0,Color.WHITE,findMesh(root,"_ncl1_37"))));
        
        ///// Datos tercera habitacion
        home.setHabTraseraSec(new Habitacion(new Puerta(1.9,0.80,"Madera",findMesh(root,"_ncl1_19")),
                new Ventana(1.0,1.5,"Cristal",findMesh(root,"_ncl1_18"),findMesh(root,"_ncl1_15")),
                new Ventana(1.0,1.5,"Cristal",findMesh(root,"_ncl1_14"),findMesh(root,"_ncl1_12")),
                new Luz(1.0,Color.WHITE,findMesh(root,"_ncl1_34"))));
        
        ///// Datos Sala
        home.setLobby(new Sala(new Puerta(1.9,0.80,"Madera",findMesh(root,"_ncl1_27")),
                new Ventana(1.0,1.5,"Cristal",findMesh(root,"_ncl1_2"),findMesh(root,"_ncl1_4")),
                new Ventana(1.0,1.5,"Cristal",findMesh(root,"_ncl1_26"),findMesh(root,"_ncl1_25")),
                new Luz(1.0,Color.WHITE,findMesh(root,"_ncl1_32"))));
        
        ///// Datos Cocina
        home.setCocina(new Cocina(new Luz(1.0,Color.WHITE,findMesh(root,"_ncl1_31")),
                new Luz(1.0,Color.WHITE,findMesh(root,"_ncl1_33")),
                new Ventana(1.0,1.5,"Cristal",findMesh(root,"_ncl1_7"),findMesh(root,"_ncl1_6")),
                new Ventana(1.0,1.5,"Cristal",findMesh(root,"_ncl1_10"),findMesh(root,"_ncl1_9")),
                new Ventana(1.0,1.5,"Cristal",findMesh(root,"_ncl1_5"),findMesh(root,"_ncl1_3")),
                new Puerta(1.9,0.80,"Madera",findMesh(root,"_ncl1_20"))));
        
        ///// Datos baño principal
        home.setBanPrincipal(new Bano(new Luz(1.0,Color.WHITE,findMesh(root,"_ncl1_36")),
                new Puerta(1.9,0.80,"Madera",findMesh(root,"_ncl1_22"))));
        
        ///// Datos baño segundario
        home.setBanSegundario(new Bano(new Luz(1.0,Color.WHITE,findMesh(root,"_ncl1_35")),
                new Puerta(1.9,0.80,"Madera",findMesh(root,"_ncl1_21"))));
        
        ///// Datos de paredes
        home.setParedes(new Pared(1.80,Color.CORAL,findMesh(root,"_ncl1_29")));
    }
    
    public MeshView findMesh(Group root,String mesh){
        for(int i=0;i<root.getChildren().size();i++){
            if(root.getChildren().get(i).getId().equals(mesh))
                return (MeshView) root.getChildren().get(i);
        }
        return null;
    }
    
}
