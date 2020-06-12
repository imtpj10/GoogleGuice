package com.demoGuice.request;

import com.demoGuice.services.DrawShape;
import com.google.inject.Inject;

public class ShapeRequest {
     DrawShape drawShape;

    @Inject
    public void setDrawShape(DrawShape drawShape) {
        this.drawShape = drawShape;
    }
    //public ShapeRequest(DrawShape d) {
    //    this.drawShape = d;
    //}

    public DrawShape getDrawShape() {
        return drawShape;
    }

    public void makeRequest() {
        drawShape.drawShape();
    }
}
