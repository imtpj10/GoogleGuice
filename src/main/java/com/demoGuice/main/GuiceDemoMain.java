package com.demoGuice.main;

import com.demoGuice.request.ShapeRequest;
import com.demoGuice.services.DrawShape;
import com.demoGuice.services.impl.DrawCircle;
import com.demoGuice.services.impl.DrawSquare;

public class GuiceDemoMain {

    private static final String SHAPE_REQ = "SQUARE";

    private static void sendRequest(String shape) {
        if(shape.equals(SHAPE_REQ)) {
            DrawShape drawShape = new DrawCircle();
            ShapeRequest shapeRequest = new ShapeRequest(drawShape);
            shapeRequest.makeRequest();
        }
    }
    public static void main(String[] args) {
        sendRequest(SHAPE_REQ);
    }
}