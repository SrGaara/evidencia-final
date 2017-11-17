package com.example.srgaara.evidencia_expo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class CDMX extends AppCompatActivity {
    Spinner menu;
    String[] datos = {"menu", "ubicacion", "invitados", "cosplay"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guadalajara);


        menu = (Spinner)findViewById(R.id.menu);
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,datos);
        menu.setAdapter(adaptador);
        menu.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){

                    case 1:

                        break;

                    case 2:


                        break;

                    case 3:


                        break;

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            };
        });
    };
}