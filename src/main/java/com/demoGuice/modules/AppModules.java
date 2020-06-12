package com.demoGuice.modules;

import com.demoGuice.request.ShapeRequest;
import com.demoGuice.request.ShapeRequestSubClass;
import com.demoGuice.services.DrawShape;
import com.demoGuice.services.impl.DrawSquare;
import com.google.inject.AbstractModule;


public class AppModules extends AbstractModule {

    @Override
    protected void configure() {
        bind(DrawShape.class).to(DrawSquare.class);
        bind(ShapeRequest.class).to(ShapeRequestSubClass.class);
        bind(String.class).toInstance("Red");
        bind(Integer.class).toInstance(10);
    }
}
