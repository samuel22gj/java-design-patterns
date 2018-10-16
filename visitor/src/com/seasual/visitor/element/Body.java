package com.seasual.visitor.element;

import com.seasual.visitor.visitor.CarElementVisitor;

public class Body implements CarElement {

    @Override
    public void accept(CarElementVisitor visitor) {
        visitor.visit(this);
    }
}
