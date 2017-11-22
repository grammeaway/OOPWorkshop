/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

/**
 * FXML Controller class
 *
 * @author madsd
 */
public class BuildingFXMLController implements Initializable {

    @FXML
    private ListView<?> sensorList;
    @FXML
    private TextField sensorTypeField;
    @FXML
    private Text dataLabel;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void seeDataClicked(MouseEvent event) {
    }

    @FXML
    private void addSensorClicked(MouseEvent event) {
    }

    @FXML
    private void removeSensorClicked(MouseEvent event) {
    }

    @FXML
    private void selectBuildningClicked(MouseEvent event) {
    }
    
}
