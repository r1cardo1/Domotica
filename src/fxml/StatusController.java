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

/**
 * FXML Controller class
 *
 * @author Ricardo Marcano
 */
public class StatusController implements Initializable {

    @FXML Label vcocina;
    @FXML Label vsala;
    @FXML Label vhab1;
    @FXML Label vhab2;
    @FXML Label vhab3;
    @FXML Label pcocina;
    @FXML Label phab1;
    @FXML Label phab2;
    @FXML Label phab3;

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
    @FXML Label pbanprin;
    @FXML Label pbanseg;
    @FXML Label psala;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }    
    
}
