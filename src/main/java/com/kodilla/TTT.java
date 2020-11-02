package com.kodilla;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;


import static com.kodilla.TTTBoard.getLines;

public class TTT extends Application {
    private Image image = new Image("file:resources/ron.jpg");

    @Override
    public void start(Stage primaryStage) throws Exception {

        Group root = new Group();


        List<Rectangle> lines = new ArrayList<>();

        lines.add(getLines(200, 0, 10, 600));
        lines.add(getLines(400, 0, 10, 600));
        lines.add(getLines(0, 200, 600, 10));
        lines.add(getLines(0, 400, 600, 10));

        root.getChildren().add(Cross.getCross1("file:resources/x.jpg"));
        root.getChildren().addAll(lines);
        root.getChildren().addAll(Circ.getCircle6(90), Circ.getCircle7(90), Circ.getCircle8(90),
                Circ.getCircle9(90));



        Scene scene = new Scene(root, 600, 600,Color.WHITE);

        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
