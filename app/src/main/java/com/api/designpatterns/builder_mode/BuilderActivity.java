package com.api.designpatterns.builder_mode;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.api.designpatterns.R;
import com.api.designpatterns.builder_mode.builder.MealBuilder;
import com.api.designpatterns.builder_mode.product.Meal;

public class BuilderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_builder);
        final MealBuilder mealBuilder = new MealBuilder();

        findViewById(R.id.btn_goods1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Meal vegMeal = mealBuilder.prepareVegMeal();
                Log.e("DMDMDM","套餐1");
                vegMeal.showItems();
                Log.e("DMDMDM","Total Cost: " +vegMeal.getCost());
            }
        });

        findViewById(R.id.btn_goods2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Meal vegMeal = mealBuilder.prepareNonVegMeal();
                Log.e("DMDMDM","套餐2");
                vegMeal.showItems();
                Log.e("DMDMDM","Total Cost: " +vegMeal.getCost());
            }
        });

        findViewById(R.id.btn_goods3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Meal vegMeal = mealBuilder.allMeal();
                Log.e("DMDMDM","全家桶");
                vegMeal.showItems();
                Log.e("DMDMDM","Total Cost: " +vegMeal.getCost());
            }
        });
    }
}
