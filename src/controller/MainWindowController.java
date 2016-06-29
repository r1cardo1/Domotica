/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;


import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.PickResult;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.MeshView;

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
    
    public void mouse(MouseEvent evt){
        PickResult res = evt.getPickResult();            
            MeshView m = (MeshView) res.getIntersectedNode();
            m.setMaterial(new PhongMaterial(Color.RED));
            System.out.println(m.getId());
    }    
    
    public Group getRoot(){
        return root;
    }
    
}
