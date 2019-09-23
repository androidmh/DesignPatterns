package com.api.designpatterns.abstract_factory.factory;

import com.api.designpatterns.abstract_factory.color.Color;
import com.api.designpatterns.abstract_factory.shape.Circle;
import com.api.designpatterns.abstract_factory.shape.Rectangle;
import com.api.designpatterns.abstract_factory.shape.Shape;
import com.api.designpatterns.abstract_factory.shape.Square;

/**
 * @author by mengh
 * @email menghedianmo@163.com
 * @date on 2019-09-17$.
 * PS: Not easy to write code, please indicate.
 * <p>
 * Describe:
 */
public class ShapeFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }

    @Override
    public Color getColor(String color) {
        return null;
    }
}
