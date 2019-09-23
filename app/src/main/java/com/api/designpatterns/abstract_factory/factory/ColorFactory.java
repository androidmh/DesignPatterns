package com.api.designpatterns.abstract_factory.factory;

import com.api.designpatterns.abstract_factory.color.Blue;
import com.api.designpatterns.abstract_factory.color.Color;
import com.api.designpatterns.abstract_factory.color.Green;
import com.api.designpatterns.abstract_factory.color.Red;
import com.api.designpatterns.abstract_factory.shape.Shape;

/**
 * @author by mengh
 * @email menghedianmo@163.com
 * @date on 2019-09-17$.
 * PS: Not easy to write code, please indicate.
 * <p>
 * Describe:
 */
public class ColorFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shapeType){
        return null;
    }

    @Override
    public Color getColor(String color) {
        if(color == null){
            return null;
        }
        if(color.equalsIgnoreCase("RED")){
            return new Red();
        } else if(color.equalsIgnoreCase("GREEN")){
            return new Green();
        } else if(color.equalsIgnoreCase("BLUE")){
            return new Blue();
        }
        return null;
    }
}
