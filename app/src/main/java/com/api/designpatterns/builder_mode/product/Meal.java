package com.api.designpatterns.builder_mode.product;

import android.util.Log;

import com.api.designpatterns.builder_mode.builder.Item;

import java.util.ArrayList;
import java.util.List;

/**
 * @author by mengh
 * @email menghedianmo@163.com
 * @date on 2019-09-23$.
 * PS: Not easy to write code, please indicate.
 * <p>
 * Describe:
 */
public class Meal {
    private List<Item> items = new ArrayList<Item>();

    public void addItem(Item item){
        items.add(item);
    }

    public float getCost(){
        float cost = 0.0f;
        for (Item item : items) {
            cost += item.price();
        }
        return cost;
    }

    public void showItems(){
        for (Item item : items) {
            Log.e("DMDM","Item : "+item.name());
            Log.e("DMDM",", Packing : "+item.packing().pack());
            Log.e("DMDM",", Price : "+item.price());
        }
    }
}