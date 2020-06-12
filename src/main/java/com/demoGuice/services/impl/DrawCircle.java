package com.demoGuice.services.impl;

import com.demoGuice.services.DrawShape;

public class DrawCircle implements DrawShape {
    public void drawShape() {
        System.out.println("Hello! I'm Circle");
    }
}
