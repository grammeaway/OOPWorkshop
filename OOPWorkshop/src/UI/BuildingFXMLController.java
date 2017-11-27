/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Aqr.IBuilding;
import Aqr.IDomainFacade;
import Aqr.ISensor;
import java.io.IOException;
import java.net.URL;
import java.util.Map;
import java.util.Observer;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableMap;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author madsd
 */
public class BuildingFXMLController implements Initializable {

    @FXML
    private ListView<ISensor> sensorList;
    @FXML
    private TextField sensorTypeField;
    @FXML
    private Text dataLabel;

    private IBuilding building;

    private IDomainFacade domainFacade;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        domainFacade = UI.getInstance().getDomain();
        
    }

    @FXML
    private void seeDataClicked(MouseEvent event) {
        dataLabel.setText("" + building.getSensor().get(sensorList.getSelectionModel().getSelectedItem().getSensorID()).getReading());
    }

    @FXML
    private void addSensorClicked(MouseEvent event) {
        building.addSensor(Integer.parseInt(sensorTypeField.getText()));
        updateSensorList();

    }

    @FXML
    private void removeSensorClicked(MouseEvent event) {
        building.removeSensor(sensorList.getSelectionModel().getSelectedItem().getSensorID());
        updateSensorList();
    }

    @FXML
    private void selectBuildningClicked(MouseEvent event) throws IOException {
        Stage stage = (Stage) sensorList.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("SelecetBuiling.fxml"))));
    }

    void setBuilding(IBuilding building) {
        this.building = building;
        updateSensorList();
    }

    void updateSensorList() {
        if (!building.getSensor().isEmpty()) {

            sensorList.getItems().setAll(building.getSensor().values());

        }

    }
}
