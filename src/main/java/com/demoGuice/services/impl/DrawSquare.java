package com.demoGuice.services.impl;

import com.demoGuice.services.DrawShape;

public class DrawSquare implements DrawShape {
    public void drawShape() {
        System.out.println("Hello! This is Square.");
    }
}
