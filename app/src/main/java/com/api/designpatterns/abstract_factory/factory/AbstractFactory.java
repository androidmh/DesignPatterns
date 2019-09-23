package com.api.designpatterns.abstract_factory.factory;

import com.api.designpatterns.abstract_factory.color.Color;
import com.api.designpatterns.abstract_factory.shape.Shape;

/**
 * @author by mengh
 * @email menghedianmo@163.com
 * @date on 2019-09-17$.
 * PS: Not easy to write code, please indicate.
 * <p>
 * Describe:
 */
public abstract class AbstractFactory {
    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape);
}