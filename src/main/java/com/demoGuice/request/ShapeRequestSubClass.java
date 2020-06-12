package com.demoGuice.request;

import com.demoGuice.services.DrawShape;
import com.google.inject.Inject;

public class ShapeRequestSubClass extends ShapeRequest {

    @Inject
    public ShapeRequestSubClass(DrawShape d) {
        super(d);
    }


    @Override
    public void makeRequest() {
        System.out.println("This is subclass");
        drawShape.drawShape();
    }
}
