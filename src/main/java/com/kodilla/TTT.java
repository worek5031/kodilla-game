package com.kodilla;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;


import static com.kodilla.TTTBoard.getLines;

public class TTT extends Application {
    private Image image = new Image("file:resources/ron.jpg");

    @Override
    public void start(Stage primaryStage) throws Exception {

        Group root = new Group();
        Button buttonCircle1 = new Button("Field1");
        buttonCircle1.setTranslateX(1100);
        buttonCircle1.setTranslateY(50);
        buttonCircle1.setOnAction(event -> root.getChildren().add(Circ.getCircle1()));
        buttonCircle1.setOnAction(event -> root.getChildren().remove(buttonCircle1));


        Button buttonCircle2 = new Button("Field2");
        buttonCircle2.setTranslateX(1100);
        buttonCircle2.setTranslateY(80);
        buttonCircle2.setOnAction(event -> root.getChildren().add(Circ.getCircle2()));

        Button buttonCircle3 = new Button("Field3");
        buttonCircle3.setTranslateX(1100);
        buttonCircle3.setTranslateY(110);
        buttonCircle3.setOnAction(event -> root.getChildren().add(Circ.getCircle3()));

        Button buttonCircle4 = new Button("Field4");
        buttonCircle4.setTranslateX(1100);
        buttonCircle4.setTranslateY(140);
        buttonCircle4.setOnAction(event -> root.getChildren().add(Circ.getCircle4()));

        Button buttonCircle5 = new Button("Field5");
        buttonCircle5.setTranslateX(1100);
        buttonCircle5.setTranslateY(170);
        buttonCircle5.setOnAction(event -> root.getChildren().add(Circ.getCircle5()));

        Button buttonCircle6 = new Button("Field6");
        buttonCircle6.setTranslateX(1100);
        buttonCircle6.setTranslateY(200);
        buttonCircle6.setOnAction(event -> root.getChildren().add(Circ.getCircle6()));

        Button buttonCircle7 = new Button("Field7");
        buttonCircle7.setTranslateX(1100);
        buttonCircle7.setTranslateY(230);
        buttonCircle7.setOnAction(event -> root.getChildren().add(Circ.getCircle7()));

        Button buttonCircle8 = new Button("Field8");
        buttonCircle8.setTranslateX(1100);
        buttonCircle8.setTranslateY(260);
        buttonCircle8.setOnAction(event -> root.getChildren().add(Circ.getCircle8()));

        Button buttonCircle9 = new Button("Field9");
        buttonCircle9.setTranslateX(1100);
        buttonCircle9.setTranslateY(290);
        buttonCircle9.setOnAction(event -> root.getChildren().add(Circ.getCircle9()));

        Button buttonCross1 = new Button("Field1");
        buttonCross1.setTranslateX(20);
        buttonCross1.setTranslateY(50);
        buttonCross1.setOnAction(event -> root.getChildren().add(Cross.getCross1()));

        Button buttonCross2 = new Button("Field2");
        buttonCross2.setTranslateX(20);
        buttonCross2.setTranslateY(80);
        buttonCross2.setOnAction(event -> root.getChildren().add(Cross.getCross2()));

        Button buttonCross3 = new Button("Field3");
        buttonCross3.setTranslateX(20);
        buttonCross3.setTranslateY(110);
        buttonCross3.setOnAction(event -> root.getChildren().add(Cross.getCross3()));

        Button buttonCross4 = new Button("Field4");
        buttonCross4.setTranslateX(20);
        buttonCross4.setTranslateY(140);
        buttonCross4.setOnAction(event -> root.getChildren().add(Cross.getCross4()));

        Button buttonCross5 = new Button("Field5");
        buttonCross5.setTranslateX(20);
        buttonCross5.setTranslateY(170);
        buttonCross5.setOnAction(event -> root.getChildren().add(Cross.getCross5()));

        Button buttonCross6 = new Button("Field6");
        buttonCross6.setTranslateX(20);
        buttonCross6.setTranslateY(200);
        buttonCross6.setOnAction(event -> root.getChildren().add(Cross.getCross6()));

        Button buttonCross7 = new Button("Field7");
        buttonCross7.setTranslateX(20);
        buttonCross7.setTranslateY(230);
        buttonCross7.setOnAction(event -> root.getChildren().add(Cross.getCross7()));

        Button buttonCross8 = new Button("Field8");
        buttonCross8.setTranslateX(20);
        buttonCross8.setTranslateY(260);
        buttonCross8.setOnAction(event -> root.getChildren().add(Cross.getCross8()));

        Button buttonCross9 = new Button("Field9");
        buttonCross9.setTranslateX(20);
        buttonCross9.setTranslateY(290);
        buttonCross9.setOnAction(event -> root.getChildren().add(Cross.getCross9()));

        List<Rectangle> lines = new ArrayList<>();

        lines.add(getLines(500, 0, 10, 600));
        lines.add(getLines(700, 0, 10, 600));
        lines.add(getLines(300, 200, 600, 10));
        lines.add(getLines(300, 400, 600, 10));



        root.getChildren().addAll(lines);
        root.getChildren().add(Buttons.getTitleButtonCircle());
        root.getChildren().add(Buttons.getTitleButtonCross());
        root.getChildren().addAll(buttonCircle1, buttonCircle2, buttonCircle3, buttonCircle4, buttonCircle5, buttonCircle6, buttonCircle7, buttonCircle8, buttonCircle9);
        root.getChildren().addAll(buttonCross1, buttonCross2, buttonCross3, buttonCross4, buttonCross5, buttonCross6, buttonCross7, buttonCross8, buttonCross9);
        root.getChildren().addAll(Fields.getField1(), Fields.getField2(), Fields.getField3(), Fields.getField4(), Fields.getField5(), Fields.getField6(), Fields.getField7(), Fields.getField8(), Fields.getField9());

        //root.getChildren().addAll(Cross.getCross3(), Cross.getCross6(), Cross.getCross9(), Cross.getCross8(), Cross.getCross7(), Cross.getCross4(), Cross.getCross1(), Cross.getCross2(), Cross.getCross5());
        //root.getChildren().addAll(Circ.getCircle1(), Circ.getCircle2(), Circ.getCircle3(), Circ.getCircle4(), Circ.getCircle5(), Circ.getCircle6(), Circ.getCircle7(), Circ.getCircle8(), Circ.getCircle9());

        Scene scene = new Scene(root, 1200, 600,Color.WHITE);

        primaryStage.setTitle("Tic Tac Toe");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

  }
