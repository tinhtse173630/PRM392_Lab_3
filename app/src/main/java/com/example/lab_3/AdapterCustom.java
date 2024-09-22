package com.example.lab_3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

public class AdapterCustom extends BaseAdapter {
private Context context;
private int layout;
private List<Fruits> fruitsList;

    public AdapterCustom(Context context, int layout, List<Fruits> fruitsList) {
        this.context = context;
        this.layout = layout;
        this.fruitsList = fruitsList;
    }


    @Override
    public int getCount() { // tra ve so dong hien thi tren listview
        return fruitsList.size() ;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(layout,null);
        // Anh xa view
        TextView title= view.findViewById(R.id.title);
        TextView description= view.findViewById(R.id.description);
        ImageView img= view.findViewById(R.id.img);

        // Gan gia tri
        Fruits fruits = fruitsList.get(i);

        // tim toi vi tri id
        title.setText(fruits.getFruitTitle());
        description.setText(fruits.getFruitDes());
        img.setImageResource(fruits.getFruitImage());
            // tra ve view
        return view;
    }
}
