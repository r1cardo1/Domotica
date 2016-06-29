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
        r.setRotate(r.getRotate()+10);
    }
    
    @FXML
    public void rotateRight(ActionEvent evt){
        Group r;
        r = controller.getRoot();
        r.setRotate(r.getRotate()-10);
    }
  
    public void setCasa(Casa c){
        this.home = c;
    }
}
