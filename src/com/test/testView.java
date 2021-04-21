package com.test;/**
 * @ author Fei Gu
 * @ create 2021-04-21-14.19
 * @ grade CS20_EASV_SØNDERBORG
 * @ Description
 * @ Version
 */

import com.model.User;
import com.rant.RentedBooksView;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class testView extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        User user = new User();
        Pane pane = RentedBooksView.getPane(user);
        Scene scene = new Scene(pane,800,800);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
