package com.kodilla.testing.shape;
import java.util.ArrayList;

public class ShapeCollector {
    private ArrayList<Shape> figures = new ArrayList<>();

    public void addFigure(Shape shape) {
        figures.add(shape);
    }
    public boolean removeFigure(Shape shape){
        boolean result = false;
        if (figures.contains(shape)) {
            figures.remove(shape);
            result = true;
        }
        return result;
    }
    public Shape getFigure(int n) {
        return figures.get(n);
    }
    public void showFigures(){
        for(int n = 0; n < figures.size(); n++) {
            figures.get(n);
        }
    }
}