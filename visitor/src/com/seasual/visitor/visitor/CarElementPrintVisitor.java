package com.seasual.visitor.visitor;

import com.seasual.visitor.element.Body;
import com.seasual.visitor.element.Car;
import com.seasual.visitor.element.Engine;
import com.seasual.visitor.element.Wheel;

public class CarElementPrintVisitor implements CarElementVisitor {

    @Override
    public void visit(Car car) {
        System.out.println("Printing my car");
    }

    @Override
    public void visit(Body body) {
        System.out.println("Printing my body");
    }

    @Override
    public void visit(Engine engine) {
        System.out.println("Printing my engine");
    }

    @Override
    public void visit(Wheel wheel) {
        System.out.println("Printing my" + wheel.getName() + " wheel");
    }
}
