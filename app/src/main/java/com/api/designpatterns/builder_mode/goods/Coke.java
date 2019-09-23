package com.api.designpatterns.builder_mode.goods;

/**
 * @author by mengh
 * @email menghedianmo@163.com
 * @date on 2019-09-23$.
 * PS: Not easy to write code, please indicate.
 * <p>
 * Describe:
 */
public class Coke extends ColdDrink {

    @Override
    public float price() {
        return 30.0f;
    }

    @Override
    public String name() {
        return "Coke";
    }
}
