package com.kodilla;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

import java.util.ArrayList;
import java.util.List;

public class TTTBoard {
    public static Rectangle getLines(double x, double y, double width, double height) {
        Rectangle rectangle = new Rectangle (x, y, width, height);
        rectangle.setFill(Color.BLACK);
        return rectangle;

    }

}
