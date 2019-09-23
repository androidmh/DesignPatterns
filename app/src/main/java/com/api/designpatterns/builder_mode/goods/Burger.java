package com.api.designpatterns.builder_mode.goods;

import com.api.designpatterns.builder_mode.builder.Item;
import com.api.designpatterns.builder_mode.builder.Packing;
import com.api.designpatterns.builder_mode.builder.Wrapper;

/**
 * @author by mengh
 * @email menghedianmo@163.com
 * @date on 2019-09-23$.
 * PS: Not easy to write code, please indicate.
 * <p>
 * Describe:
 */
public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
