package com.example.myapplication;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    ArrayList<CountryModeClass> dataModels;
    private  static  customApdater apdater;
    String teamname[]={"India","Asutalia","shrilanka","Pakistan","England"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        listView=findViewById(R.id.listView);

        dataModels=new ArrayList<>();;
        dataModels.add(new CountryModeClass("India","2",R.drawable.india));
        dataModels.add(new CountryModeClass("Austelia","5",R.drawable.asu));
        dataModels.add(new CountryModeClass("South Africa","0",R.drawable.sa));
        dataModels.add(new CountryModeClass("Pakistan","1",R.drawable.pak));
        apdater=new customApdater(dataModels,getApplicationContext());
        listView.setAdapter(apdater);

    }
}