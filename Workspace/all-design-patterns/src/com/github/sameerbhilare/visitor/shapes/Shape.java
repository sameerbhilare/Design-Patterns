package com.github.sameerbhilare.visitor.shapes;

// Element – interface with accept(Visitor)
public interface Shape {
    void accept(ShapeVisitor visitor);
}
