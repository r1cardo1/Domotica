package domotica;

import com.sun.javaws.Main;
import controller.ControlsController;
import controller.MainWindowController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.PerspectiveCamera;
import javafx.scene.Scene;
import javafx.scene.SceneAntialiasing;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Box;
import javafx.scene.transform.Rotate;
import javafx.scene.transform.Translate;
import javafx.stage.Stage;

public class Domotica extends Application {
    
    private MainWindowController stage1;
    private ControlsController stage2;
    
    @Override
    public void start(Stage stage) throws Exception {
    final Group root = new Group();
    addFloor(root);
    // Load home graphic
    
    FXMLLoader loaderHome = new FXMLLoader(getClass().getResource("/fxml/Drawing1.fxml"));

    // Load control panel
    
    FXMLLoader loaderPanel = new FXMLLoader(getClass().getResource("/fxml/Controls.fxml"));

    // Add both to scene
    
    root.getChildren().add(loaderPanel.load());
    root.getChildren().add(loaderHome.load());
    
    // Get ready controllers
    
        stage1 = loaderHome.getController();
        stage2 = loaderPanel.getController();
        stage2.setController(stage1);
    
    Scene scene = new Scene(root,900,700,true,SceneAntialiasing.BALANCED);
    scene.setCamera(addCamera());
    stage.setScene(scene);
    stage.setTitle("JavaFX 3D");
    stage.show();
    }
    
    public void addFloor(Group root){
        final Box floor = new Box(1000, 500, 1);
        floor.setTranslateX(200);
        floor.setTranslateY(200);
        floor.setTranslateZ(250);
        floor.setMaterial(new PhongMaterial(Color.YELLOW));
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

    public static void main(String[] args) {
        launch(args);
    }
}
