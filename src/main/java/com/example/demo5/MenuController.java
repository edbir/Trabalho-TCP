package com.example.demo5;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.MenuBar;
import javafx.stage.Stage;

import java.io.IOException;

public class MenuController {
    @FXML
    MenuBar myMenuBar;
    @FXML
    private void onMenuClick(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("help-view.fxml"));
        Stage stage = (Stage)myMenuBar.getScene().getWindow();
        Scene ReportManagerScene = new Scene(root);
        stage.setScene(ReportManagerScene);
        stage.show();
    }

    @FXML
    private void onHomeClick(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("home-view.fxml"));
        Stage stage = (Stage)myMenuBar.getScene().getWindow();
        Scene ReportManagerScene = new Scene(root, 800, 600);
        stage.setScene(ReportManagerScene);
        stage.show();
    }
}
