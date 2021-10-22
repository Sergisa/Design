package com.company;

import com.formdev.flatlaf.FlatIntelliJLaf;

public class Main {

    public static void main(String[] args) {
        FlatIntelliJLaf.setup();
        //IntelliJTheme.setup( Main.class.getResourceAsStream("/DarkPurple.theme.json" ) );
        Form myForm = new Form("Test");
        Circle blueCircle = new Circle(6, 50, 50);
        myForm.addFigure(blueCircle);
    }
}
