package com.github.sameerbhilare.visitor.shapes;

import java.util.List;

public class Client {

    public static void main(String[] args) {

        List<Shape> shapes = List.of(new Circle(5), new Rectangle(4, 6));

        ShapeVisitor areaVisitor = new AreaCalculatorVisitor();
        ShapeVisitor jsonViitor = new JsonExportVisitor();

        for (Shape shape: shapes) {
            shape.accept(areaVisitor);
            shape.accept(jsonViitor);
        }
    }
}
