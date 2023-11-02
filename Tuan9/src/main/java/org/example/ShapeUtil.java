package org.example;

import java.util.ArrayList;
import java.util.List;

public class ShapeUtil {
    private List<GeometricObject> shapes;

    public ShapeUtil() {
        shapes = new ArrayList<>();
    }

    public void addGeometricObject(GeometricObject geometricObject) {
        shapes.add(geometricObject);
    }

    public String printInfo(List<GeometricObject> shapes) {
        String s = "Circle:" + "\n";
        for(GeometricObject shape : shapes) {
            if (shape instanceof Circle) {
               s = s + shape.getInfo() + "\n";
            }
        }
        s += "Triangle:" + "\n";
        for(GeometricObject shape : shapes) {
            if (shape instanceof Triangle) {
                s = s + shape.getInfo() + "\n";
            }
        }
        return s;
    }
}
