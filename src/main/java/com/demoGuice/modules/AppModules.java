package com.demoGuice.modules;

import com.demoGuice.annotation.ColorValue;
import com.demoGuice.annotation.EdgeValue;
import com.demoGuice.request.ShapeRequest;
import com.demoGuice.request.ShapeRequestSubClass;
import com.demoGuice.services.DrawShape;
import com.demoGuice.services.impl.DrawSquare;
import com.google.inject.AbstractModule;
import com.google.inject.Scopes;


public class AppModules extends AbstractModule {

    @Override
    protected void configure() {
        bind(DrawShape.class).to(DrawSquare.class).in(Scopes.SINGLETON);
       // bind(ShapeRequest.class).to(ShapeRequestSubClass.class);
        bind(ShapeRequest.class).in(Scopes.SINGLETON);
        bind(String.class).annotatedWith(ColorValue.class).toInstance("Red");
        bind(Integer.class).annotatedWith(EdgeValue.class).toInstance(10);
    }
}
