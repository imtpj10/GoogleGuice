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
        if (shape.equals(SHAPE_REQ)) {

            Injector injector = Guice.createInjector(new AppModules());
            ShapeRequest shapeRequest1 = injector.getInstance(ShapeRequest.class);
            shapeRequest1.makeRequest();

            ShapeRequest shapeRequest2 = injector.getInstance(ShapeRequest.class);
            shapeRequest2.makeRequest();



            Boolean isEqual1 = shapeRequest1.getDrawShape() == shapeRequest2.getDrawShape();
            System.out.println("Were both Drawshape same? "+isEqual1);

            Boolean isEqual2 = shapeRequest1 == shapeRequest2;
            System.out.println("Were both Drawshape same? "+isEqual2);
        }
    }


    public static void main(String[] args) {
        sendRequest(SHAPE_REQ);
    }
}
