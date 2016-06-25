package domotica;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.DepthTest;
import javafx.scene.Group;
import javafx.scene.PerspectiveCamera;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Box;
import javafx.scene.shape.MeshView;
import javafx.scene.shape.Rectangle;
import javafx.scene.transform.Rotate;
import javafx.scene.transform.Translate;
import javafx.stage.Stage;

public class Domotica extends Application {
    int i=0;
    MeshView door;
    @Override
    public void start(Stage stage) throws Exception {
    final PerspectiveCamera cam = new PerspectiveCamera();
    cam.setFieldOfView(20);
    cam.setFarClip(10000);
    cam.setNearClip(0.01);
    cam.getTransforms().addAll(new Rotate(60,Rotate.X_AXIS),new Translate(-200,-200,300));

    final Group root = new Group();
    root.getChildren().add(FXMLLoader.load(getClass().getResource("/fxml/MainWindow.fxml")));
    final Box floor = new Box(500, 500, 1);
    floor.setTranslateX(200);
    floor.setTranslateY(200);
    floor.setTranslateZ(50);
    floor.setMaterial(new PhongMaterial(Color.YELLOW));
    root.getChildren().add(floor);


    Scene scene = new Scene(root, 800, 600, true);
    scene.setCamera(cam);
    root.setRotate(-90);

    stage.setScene(scene);
    stage.setTitle("JavaFX 3D Drag&Drop");
    stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
    
    
}
