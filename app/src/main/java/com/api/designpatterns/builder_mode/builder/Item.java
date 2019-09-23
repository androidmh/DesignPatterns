package com.api.designpatterns.builder_mode.builder;

/**
 * @author by mengh
 * @email menghedianmo@163.com
 * @date on 2019-09-23$.
 * PS: Not easy to write code, please indicate.
 * <p>
 * Describe:
 */
public interface Item {
    public String name();
    public Packing packing();
    public float price();
}