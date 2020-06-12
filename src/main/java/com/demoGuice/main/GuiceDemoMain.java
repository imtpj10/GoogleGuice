package com.demoGuice.main;

import com.demoGuice.modules.AppModules;
import com.demoGuice.request.ShapeRequest;
import com.demoGuice.services.DrawShape;
import com.demoGuice.services.impl.DrawCircle;
import com.demoGuice.services.impl.DrawSquare;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class GuiceDemoMain {

    private static final String SHAPE_REQ = "SQUARE";

    private static void sendRequest(String shape) {
        if(shape.equals(SHAPE_REQ)) {
//            DrawShape drawShape = new DrawCircle();
//            ShapeRequest shapeRequest = new ShapeRequest(drawShape);

            Injector injector = Guice.createInjector(new AppModules());

            DrawShape drawShape = injector.getInstance(DrawShape.class);
            ShapeRequest shapeRequest = new ShapeRequest(drawShape);

            //ShapeRequest shapeRequest = injector.getInstance(ShapeRequest.class);
            shapeRequest.makeRequest();
        }
    }
    public static void main(String[] args) {
        sendRequest(SHAPE_REQ);
    }
}
