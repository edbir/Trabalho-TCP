package com.example.demo5;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import org.jfugue.player.Player;
import parser.StringParse;

public class HelloController {
    @FXML
    private TextArea welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        //welcomeText.setText("Welcome to JavaFX Application!");
        Player player = new Player();
        StringParse stringParse = new StringParse();
        player.play(stringParse.doStringParse(welcomeText.getText()));
    }
}