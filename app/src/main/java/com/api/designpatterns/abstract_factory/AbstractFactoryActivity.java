package com.api.designpatterns.abstract_factory;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.api.designpatterns.R;
import com.api.designpatterns.abstract_factory.color.Color;
import com.api.designpatterns.abstract_factory.factory.AbstractFactory;
import com.api.designpatterns.abstract_factory.factory.FactoryProducer;
import com.api.designpatterns.abstract_factory.shape.Shape;

public class AbstractFactoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abstract_factory);
        //获取形状工厂
        final AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");


        //获取颜色工厂
        final AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");

        findViewById(R.id.Blue).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Color color = colorFactory.getColor("BLUE");
                color.fill();
            }
        });

        findViewById(R.id.Green).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Color color = colorFactory.getColor("GREEN");
                color.fill();
            }
        });

        findViewById(R.id.Red).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Color color = colorFactory.getColor("RED");
                color.fill();
            }
        });

        findViewById(R.id.Circle).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Shape shape = shapeFactory.getShape("CIRCLE");
                shape.draw();
            }
        });

        findViewById(R.id.Rectangle).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Shape shape = shapeFactory.getShape("RECTANGLE");
                shape.draw();
            }
        });

        findViewById(R.id.Square).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Shape shape = shapeFactory.getShape("SQUARE");
                shape.draw();
            }
        });
    }
}
