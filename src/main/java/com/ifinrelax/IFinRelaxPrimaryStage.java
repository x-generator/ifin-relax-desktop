package com.ifinrelax;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * @author Timur Berezhnoi
 */
public class IFinRelaxPrimaryStage extends Application {

    private static Stage primeStage;

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primeStage = primaryStage;
        Parent parent = loadFxmlResource("/fxml/login/Login.fxml");
        primaryStage.setScene(new Scene(parent));
        primaryStage.setResizable(false);
        primaryStage.sizeToScene();
        primaryStage.setTitle("IFin-Relax");
        primaryStage.show();
    }

    private <T> T loadFxmlResource(String fxmlFilePath) throws java.io.IOException {
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource(fxmlFilePath));
        return fxmlLoader.load();
    }

    public static void changeScene(Scene scene) {
        primeStage.setScene(scene);
    }

    public void signUp() throws IOException {
        primeStage.setScene(new Scene((Parent) loadFxmlResource("/fxml/register/Register.fxml")));
    }
}