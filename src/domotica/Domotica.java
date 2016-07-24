package domotica;

import controller.ControlsController;
import controller.MainWindowController;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.PerspectiveCamera;
import javafx.scene.Scene;
import javafx.scene.SceneAntialiasing;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCode;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Box;
import javafx.scene.shape.MeshView;
import javafx.scene.transform.Rotate;
import javafx.scene.transform.Translate;
import javafx.stage.Stage;
import tad.Casa;
import tad.Pared;
import tad.Puerta;
import tad.Ventana;

public class Domotica extends Application {
    
    private MainWindowController stage1;
    private ControlsController stage2;    
    private Casa home = new Casa();
    
    @Override
    public void start(Stage stage) throws Exception {
    final Group root = new Group();
    addFloor(root);    
    // Load home graphic
    
    FXMLLoader loaderHome = new FXMLLoader(getClass().getResource("/fxml/Drawing2.fxml"));

    // Load control panel
    
    FXMLLoader loaderPanel = new FXMLLoader(getClass().getResource("/fxml/Controls.fxml"));

    // Add both to scene
    Group homeLoad = loaderHome.load();
    root.getChildren().add(loaderPanel.load());
    root.getChildren().add(homeLoad);
    
    // Get ready controllers
    
        stage1 = loaderHome.getController();
        stage2 = loaderPanel.getController();
        stage2.setController(stage1);
    
    // init TAD Data
    System.out.println(homeLoad.toString());
        initData(homeLoad);
        
        
    
    stage2.setCasa(home);
    Scene scene = new Scene(root,900,700,true,SceneAntialiasing.BALANCED);
    scene.setCamera(addCamera());
    
    scene.setOnKeyPressed(evt ->{
        if(evt.getCode() == KeyCode.D)
            homeLoad.setTranslateY(homeLoad.getTranslateY()+10);
        if(evt.getCode() == KeyCode.C)
            homeLoad.setTranslateY(homeLoad.getTranslateY()-10);
        if(evt.getCode() == KeyCode.X)
            homeLoad.setTranslateX(homeLoad.getTranslateX()+10);
        if(evt.getCode() == KeyCode.S)
            homeLoad.setTranslateX(homeLoad.getTranslateX()-10);
        if(evt.getCode() == KeyCode.A)
            homeLoad.setTranslateZ(homeLoad.getTranslateZ()+10);
        if(evt.getCode() == KeyCode.Z)
            homeLoad.setTranslateZ(homeLoad.getTranslateZ()-10);
    });
    
    stage.setScene(scene);
    stage.setTitle("JavaFX 3D");
    stage.show();
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
    
    public PerspectiveCamera addCamera(){
        PerspectiveCamera cam = new PerspectiveCamera();
        cam.setFieldOfView(20);
        cam.setFarClip(10000);
        cam.setNearClip(0.01);
        cam.getTransforms().addAll(new Rotate(60,Rotate.X_AXIS),new Translate(-200,-200,300));
        return cam;
    }
    
    public void initData(Group rot) throws IOException{
        ArrayList<String> ventanas = loadVentanas();
        ArrayList<String> puertas = loadPuertas();
        ArrayList<String> paredes = loadParedes();
        MeshView si=null;
        MeshView sd=null;
        
        
        
        // Agrega ventanas al TAD
        for(int i=0;i<ventanas.size()-2;i+=2){
            for(int j=0;j<rot.getChildren().size()-7;j++){
                if(rot.getChildren().get(j).getId().equals(ventanas.get(i)))
                    si = (MeshView) rot.getChildren().get(j);
                if(rot.getChildren().get(j).getId().equals(ventanas.get(i+1)))
                    sd = (MeshView) rot.getChildren().get(j);
            }
            home.agregaVentana(new Ventana(1,1.5,"cristal","ahumado1",si,sd));
        }
        
        // Agrega puertas al TAD
        for(int i=0;i<rot.getChildren().size();i++){
            if(puertas.contains(rot.getChildren().get(i).getId()))            
                home.agregaPuerta(new Puerta(1.9,0.8,"madera","caoba",(MeshView)rot.getChildren().get(i)));
        }
        
        for(int i=0;i<rot.getChildren().size();i++){
            if(paredes.contains(rot.getChildren().get(i).getId()))            
                home.agregaPared(new Pared(1.9,"concreto","azul",(MeshView)rot.getChildren().get(i)));
        }        
        home.setCasa(rot);
    }
    
    public ArrayList<String> loadVentanas() throws FileNotFoundException, IOException{
        ArrayList<String> list = new ArrayList<>();
        String cadena;
        FileReader f = new FileReader("src/data/ventanas.txt");
        BufferedReader b = new BufferedReader(f);
        while((cadena = b.readLine())!=null) {
            list.add(cadena);
        }
        b.close();
        return list;
    }
    
    public ArrayList<String> loadPuertas() throws FileNotFoundException, IOException{
        ArrayList<String> list = new ArrayList<>();
        String cadena;
        FileReader f = new FileReader("src/data/puertas.txt");
        BufferedReader b = new BufferedReader(f);
        while((cadena = b.readLine())!=null) {
            list.add(cadena);
        }
        b.close();
        return list;
    }
        
    public ArrayList<String> loadParedes() throws FileNotFoundException, IOException{
        ArrayList<String> list = new ArrayList<>();
        String cadena;
        FileReader f = new FileReader("src/data/paredes.txt");
        BufferedReader b = new BufferedReader(f);
        while((cadena = b.readLine())!=null) {
            list.add(cadena);
        }
        b.close();
        return list;
    }

    public static void main(String[] args) throws IOException {
        launch(args);
        
      

    }
}
