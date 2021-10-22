package com.company;

import javax.swing.*;
import java.awt.geom.Ellipse2D;

public class Form extends JFrame {
    private JPanel root;
    private JPanel drawingPanel;

    public Form(String title) {
        super(title);
        setSize(550, 550);
        setVisible(true);
        setContentPane(root);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        drawingPanel.setBorder(BorderFactory.createLineBorder(MaterialColors.PURPLE_700, 2, true));

    }

    private void createUIComponents() {
        drawingPanel = new DrawingPanel();
    }

    public void addFigure(Circle c) {
        ((DrawingPanel) drawingPanel).draw(new Ellipse2D.Double(c.x, c.y, c.r * 2, c.r * 2));
        c.rotate(30);
        ((DrawingPanel) drawingPanel).draw(new Ellipse2D.Double(c.x, c.y, c.r * 2, c.r * 2));

    }
}
