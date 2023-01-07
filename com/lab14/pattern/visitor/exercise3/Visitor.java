package com.lab14.pattern.visitor.exercise3;

public interface Visitor {
    void visitDot(Dot dot);
    void visitCircle(Circle circle);
    void visitRectangle(Rectangle rectangle);
    void visitCompoundShape(CompoundShape cs);
}
