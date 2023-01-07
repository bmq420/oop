package com.lab14.pattern.visitor.exercise3;

public class XMLExportVisitor implements Visitor {
    @Override
    public void visitDot(Dot dot) {
        dot.draw();
    }

    @Override
    public void visitCircle(Circle circle) {
        circle.draw();
    }

    @Override
    public void visitRectangle(Rectangle rectangle) {
        rectangle.draw();
    }

    @Override
    public void visitCompoundShape(CompoundShape cs) {
        cs.draw();
    }
}
