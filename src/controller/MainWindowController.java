/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;


import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.RotateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.PickResult;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.MeshView;
import javafx.scene.transform.Rotate;
import javafx.util.Duration;

/**
 * FXML Controller class
 *
 * @author Ricardo Marcano
 */
public class MainWindowController implements Initializable {
    
    @FXML
    Group root;
    int i=0;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }
    
    public void openDoor(Node n){
        RotateTransition rt = new RotateTransition();
        rt.setNode(n);
        rt.setByAngle(90);
        rt.setDuration(Duration.millis(1000));
        rt.setAutoReverse(true);
        rt.setCycleCount(2);
        rt.play();
    }
    
    public void closeDoor(Node n){
        
    }
    
    @FXML
    public void rotateLeft(ActionEvent evt){
        root.setRotate(root.getRotate()+1);
    }
    
    @FXML
    public void rotateRight(ActionEvent evt){
        root.setRotate(root.getRotate()-1);
    }
    
    public void keyPres(KeyEvent evt){
        root.setRotationAxis(Rotate.Z_AXIS);
            if(evt.getCode()==KeyCode.UP){
                i++;
                System.out.println(i);
            }
            if(evt.getCode()==KeyCode.DOWN){
                i--;
                System.out.println(i);
            }
            if(evt.getCode()==KeyCode.LEFT){
                root.setRotate(root.getRotate()-1);
            }
            if(evt.getCode()==KeyCode.RIGHT){

            }            
        }    
    
    public void mouse(MouseEvent evt){
        PickResult res = evt.getPickResult();
            
            MeshView m = (MeshView) res.getIntersectedNode();
            m.setMaterial(new PhongMaterial(Color.RED));
    }    
    
    public Group getRoot(){
        return root;
    }
    
}
