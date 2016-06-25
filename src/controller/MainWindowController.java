/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.RotateTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.util.Duration;

/**
 * FXML Controller class
 *
 * @author Ricardo Marcano
 */
public class MainWindowController implements Initializable {
    @FXML
    Group root;
    Group home;
    int i=0;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            home=FXMLLoader.load(getClass().getResource("/fxml/Drawing1.fxml"));
        } catch (IOException ex) {}
        root.getChildren().add(home);
        home.setTranslateX(100);
        home.setTranslateY(250);
        home.setFocusTraversable(true);
        root.setOnKeyPressed((KeyEvent evt)->{
            if(evt.getCode()==KeyCode.UP){
                i++;
                System.out.println(i);
            }
            if(evt.getCode()==KeyCode.DOWN){
                i--;
                System.out.println(i);
            }
            if(evt.getCode()==KeyCode.LEFT){
                openDoor(home.getChildren().get(i));
            }
            if(evt.getCode()==KeyCode.RIGHT){
                openDoor(home.getChildren().get(i));
            }
            
        });
    }    
    
    public void openDoor(Node n){
        RotateTransition rt = new RotateTransition();
        rt.setNode(n);
        rt.setByAngle(90);
        rt.setDuration(Duration.millis(1000));
        rt.setAutoReverse(true);
        rt.setCycleCount(80);
        rt.play();
    }
    
    public void closeDoor(Node n){
        
    }
    
    
}
