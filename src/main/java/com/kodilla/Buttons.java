package com.kodilla;

import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.control.Button;

public class Buttons {
    public static Button getTitleButtonCross() {
        Button titleButtonCross = new Button();
        titleButtonCross.setText("Cross player - Select field");
        titleButtonCross.setAlignment(Pos.TOP_LEFT);
        return titleButtonCross;
    }

    public static Button getTitleButtonCircle() {
        Button titleButtonCircle = new Button();
        titleButtonCircle.setText("Circle player - Select field");
        titleButtonCircle.setTranslateX(1050);
        titleButtonCircle.setTranslateY(0);
        return titleButtonCircle;
    }

}
