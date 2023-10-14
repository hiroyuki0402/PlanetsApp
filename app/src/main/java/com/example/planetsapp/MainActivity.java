package com.example.planetsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    ArrayList<PlanetData> planetDatas;
    private static CustomAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView1);

        planetDatas = new ArrayList<>();

        planetDatas.add(new PlanetData("Earth", "1 moon", R.drawable.earth));
        planetDatas.add(new PlanetData("Mercury", "0 Moon", R.drawable.mercury));
        planetDatas.add(new PlanetData("Venus", "0 Moon", R.drawable.venus));
        planetDatas.add(new PlanetData("Mars", "2 Moons", R.drawable.mars));
        planetDatas.add(new PlanetData("Jupiter", "79 Moons", R.drawable.jupiter));
        planetDatas.add(new PlanetData("Saturn", "83 Moons", R.drawable.saturn));
        planetDatas.add(new PlanetData("Uranus", "27 Moons", R.drawable.uranus));
        planetDatas.add(new PlanetData("Neptune", "14 Moons", R.drawable.neptune));
        adapter = new CustomAdapter(planetDatas, getApplicationContext());
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Log.d("ViewTag:", "ViewTag: " +view.getTag().toString());
                Log.d("adapterView:","adapterView:" +adapterView.toString());
                Log.d("index(i):", "index(i):" + i);
                Log.d("l:", "l:" + l);
                Toast.makeText(MainActivity.this, adapter.getItem(i).getPlanetName(), Toast.LENGTH_SHORT).show();
            }
        });

    }
}