package com.assignment.arpit.unifest_2k19;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Sponsors extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sponcers);

        RecyclerView recList = (RecyclerView) findViewById(R.id.cardList);
        recList.setHasFixedSize(true);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        recList.setLayoutManager(llm);

        SponsorsAdapter ca = new SponsorsAdapter(createList(30));
        recList.setAdapter(ca);
    }

    private List<SponsorsInfo> createList(int size) {

        List<SponsorsInfo> result = new ArrayList<>();
        for (int i=1; i <= size; i++) {
            SponsorsInfo si = new SponsorsInfo();
            si.imagePath = String.valueOf(R.drawable.eve_icon);
            si.textInfo = "helloooo -> " + i;

            result.add(si);
        }
        return result;
    }
}
