package com.example.srgaara.evidencia_expo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import java.util.ArrayList;


public class Guadalajara extends AppCompatActivity {
    Spinner menu;
    String[] datos = {"menu", "ubicacion", "invitados GDL", "cosplay GDL"};
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
                    Intent intent = new Intent(Guadalajara.this, ubicacion_gdl.class);
                    startActivity(intent);
                    break;

                case 2:
                    Intent intent1 = new Intent(Guadalajara.this, invitados_gdl.class);
                    startActivity(intent1);

                    break;

                case 3:

                  //  Intent intent3 = new Intent(Guadalajara.this, cosplay_gdl.class);
                    //startActivity(intent3);
                    break;

            }
        }

        @Override
        public void onNothingSelected(AdapterView<?> adapterView) {
        };
    });
};
}