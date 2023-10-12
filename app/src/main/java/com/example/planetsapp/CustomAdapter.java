package com.example.planetsapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter<PlanetData> {

    private ArrayList<PlanetData> planetDatas;
    private Context context;

    public CustomAdapter(ArrayList<PlanetData> planetDatas, Context context) {
        super(context, R.layout.cell, planetDatas);
        this.planetDatas = planetDatas;
        this.context = context;
    }

    private static class Cell {
        TextView planetName;
        TextView moonCount;
        ImageView planetImg;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        PlanetData data = getItem(position);

        Cell cell;
        final View result;
        if (convertView == null) {
            cell = new Cell();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(
                    R.layout.cell,
                    parent,
                    false
            );
            cell.planetName = (TextView) convertView.findViewById(R.id.textView);
            cell.moonCount = (TextView) convertView.findViewById(R.id.textView2);
            cell.planetImg = (ImageView) convertView.findViewById(R.id.imageView);

            result = convertView;
            convertView.setTag(cell);
        } else {
            cell = (Cell) convertView.getTag();
            result = convertView;
        }


        cell.planetName.setText(data.getPlanetName());
        cell.moonCount.setText(data.getMoonCount());
        cell.planetImg.setImageResource(data.getPlanetImage());
        return result;
    }

}
