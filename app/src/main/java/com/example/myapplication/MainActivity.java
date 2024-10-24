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

public class MainActivity extends AppCompatActivity {
    ListView listView;


    String teamname[]={"India","Asutalia","shrilanka","Pakistan","England"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        listView=findViewById(R.id.listView);
        ArrayAdapter t=new ArrayAdapter(this
                , R.layout.my_list_layout,R.id.tv,teamname
        );
      listView.setAdapter(t);
    }
}