package com.seasual.visitor.element;

import com.seasual.visitor.visitor.CarElementVisitor;

public interface CarElement {

    void accept(CarElementVisitor visitor);
}
