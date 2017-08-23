package com.example.toshiba.weatherapi;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import static com.example.toshiba.weatherapi.R.id.lv01;
import static com.example.toshiba.weatherapi.R.id.parent;

public class MainActivity extends AppCompatActivity {

    ListView listaCiudades;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaCiudades = (ListView)findViewById(R.id.lv01);

        ArrayAdapter<CharSequence> adaptador = ArrayAdapter.createFromResource(this, R.array.listado, android.R.layout.simple_list_item_1);
        listaCiudades.setAdapter(adaptador);

    

    }

}

