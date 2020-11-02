package com.kodilla;

import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Cross {
    private  Image image = new Image("file:resources/x.jpg");
    ImageView img = new ImageView(image);

    public static ImageView getCross1(String cross){
        ImageView cross1 = new ImageView("file:resources/x.jpg");
        return cross1;
    }
}
