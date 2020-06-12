package com.demoGuice.request;

import com.demoGuice.services.DrawShape;
import com.google.inject.Inject;

public class ShapeRequest {
     DrawShape d;

    @Inject
    public ShapeRequest(DrawShape d) {
        this.d = d;
    }

    public void makeRequest() {
        d.drawShape();
    }
}
