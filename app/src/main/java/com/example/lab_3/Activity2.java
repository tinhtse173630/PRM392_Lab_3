package com.example.lab_3;

import android.os.Bundle;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class Activity2 extends AppCompatActivity {

    //Khai bao
    ListView lvFruit;
    ArrayList<Fruits> fruitsArrayList = new ArrayList<>();
    AdapterCustom adapterCustom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_2);

        //Anh xa
        AnhXa();
        // Cach su dung listview ngoai
        adapterCustom = new AdapterCustom(this, R.layout.activity_2,fruitsArrayList);
        lvFruit.setAdapter(adapterCustom);
    }

    private void AnhXa() {
        lvFruit = findViewById(R.id.lvfruits);
        fruitsArrayList.add(new Fruits("Chuối Tiêu","Chuối tiêu long an",R.drawable.ic_launcher_background ));
    }
}