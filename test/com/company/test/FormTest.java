package com.company.test;

import org.junit.jupiter.api.Test;

import javax.swing.*;

import static org.junit.jupiter.api.Assertions.*;

class FormTest {
    @Test
    void headlessForm(){
        JFrame headless = new JFrame();
        headless.setVisible(true);
        headless.setUndecorated(true);
    }
}