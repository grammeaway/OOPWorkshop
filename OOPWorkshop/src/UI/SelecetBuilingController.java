/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Aqr.IBuilding;
import Aqr.IDomainFacade;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author madsd
 */
public class SelecetBuilingController implements Initializable {

    @FXML
    private ListView<IBuilding> buildingListView;
    @FXML
    private TextField buildingName;
    @FXML
    private TextField buildingLocation;
    
    private IDomainFacade domainFacade;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       domainFacade = UI.getInstance().getDomain();
        updateBuildingList();
    }    

    @FXML
    private void seeBuildningCLicked(MouseEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("BuildingFXML.fxml"));
                HBox box = loader.load();
        BuildingFXMLController b = loader.getController();
        b.setBuilding(buildingListView.getSelectionModel().getSelectedItem());
        Stage stage = (Stage)buildingLocation.getScene().getWindow();
        stage.setScene(new Scene(box));
    }

    @FXML
    private void addNewBuildningClicked(MouseEvent event) {
        domainFacade.addBuilding(buildingName.getText(), buildingLocation.getText());
        updateBuildingList();
    }
   

    @FXML
    private void removeBuildningClicked(MouseEvent event) {
        domainFacade.removeBuilding(buildingListView.getSelectionModel().getSelectedIndex());
        updateBuildingList();   
    }
    
    private void updateBuildingList() { 
        ObservableList<IBuilding> observableBuilding = FXCollections.observableArrayList((ArrayList) domainFacade.getBuildingList());
        buildingListView.setItems(observableBuilding);
    }
    
}
