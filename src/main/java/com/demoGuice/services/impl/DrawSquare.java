package com.demoGuice.services.impl;

import com.demoGuice.services.DrawShape;
import com.google.inject.Inject;

public class DrawSquare implements DrawShape {
    private String color;
    private Integer edge;

    @Inject
    public DrawSquare(String color, Integer edge) {
        this.color = color;
        this.edge = edge;
    }

    public void drawShape() {
        System.out.println("Hello! This is Square with color: " + color + " and edge: " + edge);
    }
}
