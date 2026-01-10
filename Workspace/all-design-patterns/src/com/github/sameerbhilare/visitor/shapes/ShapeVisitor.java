package com.github.sameerbhilare.visitor.shapes;

// Visitor – interface declaring visit() for each concrete element
public interface ShapeVisitor {

    void visit(Circle circle);
    void visit(Rectangle rectangle);
}
