package fr.wildcodeschool.apprentie.monsterlegendswikiapp;

import android.app.Activity;
import android.content.Context;
import android.widget.ArrayAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Shooty31 on 13/09/2016.
 */
public class CustomAdapter extends ArrayAdapter<String> {
    private final Activity context;
    private final ArrayList<String> monsterList;
    private final Integer[] listPictures;

    public CustomAdapter(Activity context, ArrayList<String> monsterList, Integer[] listePictures) {
        super(context, R.layout.custom_list, monsterList);
        this.context = context;
        this.monsterList = monsterList;
        this.listPictures = listePictures;
    }

    public View getView(int position, View view, ViewGroup parent){
        LayoutInflater infater = context.getLayoutInflater();
        View rowView = infater.inflate(R.layout.custom_list,null,true);

        TextView txtTitle = (TextView) rowView.findViewById(R.id.item);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.icon);

        txtTitle.setText(monsterList.get(position));
        imageView.setImageResource(listPictures[position]);


        return rowView;
    };


}

