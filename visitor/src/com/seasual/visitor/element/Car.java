package com.seasual.visitor.element;

import com.seasual.visitor.visitor.CarElementVisitor;

public class Car implements CarElement {
    CarElement[] elements;

    public Car() {
        this.elements = new CarElement[] {
                new Wheel("front left"),
                new Wheel("front right"),
                new Wheel("back left"),
                new Wheel("back right"),
                new Body(),
                new Engine()
        };
    }

    @Override
    public void accept(CarElementVisitor visitor) {
        visitor.visit(this);

        for (CarElement element : elements) {
            element.accept(visitor);
        }
    }
}
