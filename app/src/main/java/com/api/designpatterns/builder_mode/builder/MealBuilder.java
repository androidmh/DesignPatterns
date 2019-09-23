package com.api.designpatterns.builder_mode.builder;

import com.api.designpatterns.builder_mode.goods.ChickenBurger;
import com.api.designpatterns.builder_mode.goods.Coke;
import com.api.designpatterns.builder_mode.goods.Sprite;
import com.api.designpatterns.builder_mode.goods.VegBurger;
import com.api.designpatterns.builder_mode.product.Meal;

/**
 * @author by mengh
 * @email menghedianmo@163.com
 * @date on 2019-09-23$.
 * PS: Not easy to write code, please indicate.
 * <p>
 * Describe:
 */
public class MealBuilder {

    public Meal prepareVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Sprite());
        return meal;
    }

    public Meal allMeal (){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        meal.addItem(new ChickenBurger());
        meal.addItem(new Sprite());
        return meal;
    }
}
