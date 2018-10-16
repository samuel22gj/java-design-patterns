package com.seasual.visitor.element;

import com.seasual.visitor.visitor.CarElementVisitor;

public class Wheel implements CarElement {
    private String name;

    public Wheel(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void accept(CarElementVisitor visitor) {
        visitor.visit(this);
    }
}
