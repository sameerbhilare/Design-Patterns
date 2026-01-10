package com.github.sameerbhilare.visitor.shapes;

// ConcreteVisitor – implements operations
public class JsonExportVisitor implements ShapeVisitor {

    @Override
    public void visit(Circle circle) {
        System.out.println("{ \"type\": \"circle\", \"radius\": " + circle.getRadius() + " }");
    }

    @Override
    public void visit(Rectangle rectangle) {
        System.out.println("{ \"type\": \"rectangle\", \"length\": "
                + rectangle.getLength() + ", \"width\": " + rectangle.getWidth() + " }");
    }
}
