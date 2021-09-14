package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Form extends JFrame {
    private JPanel root;
    private JButton button1;
    private JPanel drawingPanel;

    public Form(String title) {
        super(title);
        button1.setFocusable(false);
        setContentPane(root);
        setSize(500, 500);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        drawingPanel.setBorder(BorderFactory.createLineBorder(Color.CYAN));
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                if (e.getKeyCode() == KeyEvent.VK_Z && e.isControlDown()) {
                    ((DrawingPanel)drawingPanel).removeLast();
                }
            }

        });
    }

    private void createUIComponents() {
        drawingPanel = new DrawingPanel();// TODO: place custom component creation code here
    }
}
