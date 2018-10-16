package com.seasual.visitor.visitor;

import com.seasual.visitor.element.Body;
import com.seasual.visitor.element.Car;
import com.seasual.visitor.element.Engine;
import com.seasual.visitor.element.Wheel;

public class CarElementDoVisitor implements CarElementVisitor {

    @Override
    public void visit(Car car) {
        System.out.println("Starting my car");
    }

    @Override
    public void visit(Body body) {
        System.out.println("Moving my body");
    }

    @Override
    public void visit(Engine engine) {
        System.out.println("Starting my engine");
    }

    @Override
    public void visit(Wheel wheel) {
        System.out.println("Kicking my" + wheel.getName() + " wheel");
    }
}
