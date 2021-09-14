package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Ellipse2D;
import java.util.ArrayList;

public class DrawingPanel extends JPanel {

    private static final long serialVersionUID = 1L;
    private ArrayList<Point> points;

    public DrawingPanel() {
        points = new ArrayList<>();
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                points.add(new Point(e.getX(), e.getY()));
                repaint();
            }
        });

    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(MaterialColors.GREEN_A700);
        Ellipse2D el = new Ellipse2D.Double(50,50,20,20);
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.fill(el);
        for (Point point : points) {
            g2.fillOval(point.x - 10, point.y - 10, 20, 20);
        }
    }

    public void removeLast() {
        if(points.size()>0){
            points.remove(points.size() - 1);
            repaint();
        }
    }

}
