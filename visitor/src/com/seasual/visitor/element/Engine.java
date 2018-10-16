package com.seasual.visitor.element;

import com.seasual.visitor.visitor.CarElementVisitor;

public class Engine implements CarElement {

    @Override
    public void accept(CarElementVisitor visitor) {
        visitor.visit(this);
    }
}
