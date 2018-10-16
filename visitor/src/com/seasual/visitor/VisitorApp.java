package com.seasual.visitor;

import com.seasual.visitor.element.Car;
import com.seasual.visitor.visitor.CarElementDoVisitor;
import com.seasual.visitor.visitor.CarElementPrintVisitor;

public class VisitorApp {

    public static void main(String[] args) {
        final Car car = new Car();
        car.accept(new CarElementDoVisitor());
        car.accept(new CarElementPrintVisitor());
    }
}
