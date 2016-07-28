/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fxml;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;

/**
 * FXML Controller class
 *
 * @author Ricardo Marcano
 */
public class StatusController implements Initializable {
    @FXML Label txtuser;
    @FXML Label vcocina;
    @FXML Label vsala;
    @FXML Label vhab1;
    @FXML Label vhab2;
    @FXML Label vhab3;
    @FXML Label pcocina;
    @FXML Label phab1;
    @FXML Label phab2;
    @FXML Label phab3;
    @FXML Label pbanprin;
    @FXML Label pbanseg;
    @FXML Label psala;
    
    public void setAllDoorOpen(){
        pcocina.setText("Abierta");
        pcocina.setTextFill(Color.RED);
        
        psala.setText("Abierta");
        psala.setTextFill(Color.RED);
        
        pbanprin.setText("Abierta");
        pbanprin.setTextFill(Color.RED);
        
        pbanseg.setText("Abierta");
        pbanseg.setTextFill(Color.RED);
        
        phab1.setText("Abierta");
        phab1.setTextFill(Color.RED);
        
        phab2.setText("Abierta");
        phab2.setTextFill(Color.RED);
        
        phab3.setText("Abierta");
        phab3.setTextFill(Color.RED);
    }
    
    public void setAllWindowOpen(){
        vcocina.setText("Abierta");
        vcocina.setTextFill(Color.RED);
        
        vsala.setText("Abierta");
        vsala.setTextFill(Color.RED);
        
        vhab1.setText("Abierta");
        vhab1.setTextFill(Color.RED);
        
        vhab2.setText("Abierta");
        vhab2.setTextFill(Color.RED);
        
        vhab3.setText("Abierta");
        vhab3.setTextFill(Color.RED);
    }
    
    public void setAllDoorClosed(){
        pcocina.setText("Cerrada");
        pcocina.setTextFill(Color.GREEN);
        
        psala.setText("Cerrada");
        psala.setTextFill(Color.GREEN);
        
        pbanprin.setText("Cerrada");
        pbanprin.setTextFill(Color.GREEN);
        
        pbanseg.setText("Cerrada");
        pbanseg.setTextFill(Color.GREEN);
        
        phab1.setText("Cerrada");
        phab1.setTextFill(Color.GREEN);
        
        phab2.setText("Cerrada");
        phab2.setTextFill(Color.GREEN);
        
        phab3.setText("Cerrada");
        phab3.setTextFill(Color.GREEN);
    }
    
    public void setAllWindowClosed(){
        vcocina.setText("Cerrada");
        vcocina.setTextFill(Color.GREEN);
        
        vsala.setText("Cerrada");
        vsala.setTextFill(Color.GREEN);
        
        vhab1.setText("Cerrada");
        vhab1.setTextFill(Color.GREEN);
        
        vhab2.setText("Cerrada");
        vhab2.setTextFill(Color.GREEN);
        
        vhab3.setText("Cerrada");
        vhab3.setTextFill(Color.GREEN);
    }

    public Label getVcocina() {
        return vcocina;
    }

    public Label getVsala() {
        return vsala;
    }

    public Label getVhab1() {
        return vhab1;
    }

    public Label getVhab2() {
        return vhab2;
    }

    public Label getVhab3() {
        return vhab3;
    }

    public Label getPcocina() {
        return pcocina;
    }

    public Label getPhab1() {
        return phab1;
    }

    public Label getPhab2() {
        return phab2;
    }

    public Label getPhab3() {
        return phab3;
    }

    public Label getPbanprin() {
        return pbanprin;
    }

    public Label getPbanseg() {
        return pbanseg;
    }

    public Label getPsala() {
        return psala;
    }
    
    public void setUser(String s){
        txtuser.setText(s);
    }

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }    
    
}
