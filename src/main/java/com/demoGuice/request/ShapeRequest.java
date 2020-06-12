package com.demoGuice.request;

import com.demoGuice.services.DrawShape;

public class ShapeRequest {
    DrawShape d;

    public ShapeRequest(DrawShape d) {
        this.d = d;
    }

    public void makeRequest() {
        d.drawShape();
    }
}
