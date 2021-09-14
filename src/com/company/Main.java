package com.company;

import com.formdev.flatlaf.IntelliJTheme;

public class Main {

    public static void main(String[] args) {

        IntelliJTheme.setup( Main.class.getResourceAsStream("/DarkPurple.theme.json" ) );
        Form myForm = new Form("Test");
    }
}
