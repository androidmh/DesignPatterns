package com.api.designpatterns.abstract_factory.shape;

/**
 * @author by mengh
 * @email menghedianmo@163.com
 * @date on 2019-09-17$.
 * PS: Not easy to write code, please indicate.
 * <p>
 * Describe:
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}