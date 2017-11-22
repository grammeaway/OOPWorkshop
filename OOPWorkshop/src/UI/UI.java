/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Aqr.IDomainFacade;
import Aqr.IUI;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author madsd
 */
public class UI extends Application implements IUI {
    
    static UI instance;
    
    static UI getInstance() {
        return instance;
    }

    private IDomainFacade domain;
    
    IDomainFacade getDomain() {
        return domain;
    }

    @Override
    public void startApplication(String[] args) {
        instance = this;
        launch(args);
    }

    @Override
    public void injectDomain(IDomainFacade domain) {
        this.domain = domain;
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("SelecetBuiling.fxml"));

        Scene scene = new Scene(root);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
