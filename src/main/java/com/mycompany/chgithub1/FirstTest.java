/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.chgithub1;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;


public class FirstTest extends Application{


    public static void main(String[] args) {
        launch(args);
    }

    @Override
     public void start(Stage stage) {
        Button buttoncommand = new Button("This is a button");
        Label textcomponent = new Label("Text component");
        FlowPane componentgroup = new FlowPane();
        componentgroup.getChildren().add(buttoncommand);
        componentgroup.getChildren().add(textcomponent);
        
        Scene view = new Scene(componentgroup);
        
        stage.setScene(view);
        stage.show();
    }
}

