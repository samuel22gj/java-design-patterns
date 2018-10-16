package com.seasual.visitor.visitor;

import com.seasual.visitor.element.Body;
import com.seasual.visitor.element.Car;
import com.seasual.visitor.element.Engine;
import com.seasual.visitor.element.Wheel;

public interface CarElementVisitor {

    void visit(Car car);
    void visit(Body body);
    void visit(Engine engine);
    void visit(Wheel wheel);
}
