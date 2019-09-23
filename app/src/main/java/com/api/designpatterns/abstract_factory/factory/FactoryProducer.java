package com.api.designpatterns.abstract_factory.factory;

/**
 * @author by mengh
 * @email menghedianmo@163.com
 * @date on 2019-09-17$.
 * PS: Not easy to write code, please indicate.
 * <p>
 * Describe:
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String choice){
        if(choice.equalsIgnoreCase("SHAPE")){
            return new ShapeFactory();
        } else if(choice.equalsIgnoreCase("COLOR")){
            return new ColorFactory();
        }
        return null;
    }
}
