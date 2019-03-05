package com.assignment.arpit.unifest_2k19;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
ViewPager viewPager;
adaptor adaptor;
List<model> models;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        models=new ArrayList<>();
        models.add(new model(R.drawable.events,"Events"));
        models.add(new model(R.drawable.location,"Location"));
        models.add(new model(R.drawable.spnsors,"Sponsers"));
        models.add(new model(R.drawable.register,"Register"));
        models.add(new model(R.drawable.developer,"Developer"));
        models.add(new model(R.drawable.about,"About"));
        adaptor=new adaptor(models,this);
        viewPager=findViewById(R.id.viewpager);
        viewPager.setAdapter(adaptor);
        viewPager.setPadding(130,0,130,0);
        viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int i, float v, int i1) {

            }

            @Override
            public void onPageSelected(int i) {

            }

            @Override
            public void onPageScrollStateChanged(int i) {

            }
        });



    }
}
