package com.demoGuice.services.impl;

import com.demoGuice.services.DrawShape;
import com.google.inject.Inject;

public class DrawCircle implements DrawShape {
    private String color;
    private Integer edge;

    @Inject
    public DrawCircle(String color, Integer edge) {
        this.color = color;
        this.edge = edge;
    }

    public void drawShape() {
        System.out.println("Hello! I'm Circle with color: " + color + " and edge: " + edge);
    }
}
