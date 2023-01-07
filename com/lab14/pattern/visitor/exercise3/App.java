package com.lab14.pattern.visitor.exercise3;

public class App {
    Shape shapes[];

    public void export() {
        Visitor exportVisitor = new XMLExportVisitor();

        for (Shape shape : shapes) {
            shape.accept(exportVisitor);
        }
    }

    public static void main(String[] args) {
        App app = new App();
        app.shapes = new Shape[] {new Dot(0, 0), new Circle(1, 1), new Rectangle(1, 1), new CompoundShape(1, 1)};
        app.export();
    }
}
