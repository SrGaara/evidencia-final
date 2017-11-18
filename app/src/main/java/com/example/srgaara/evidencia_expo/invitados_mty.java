package com.example.srgaara.evidencia_expo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

/**
 * Created by SR. Gaara on 18/11/2017.
 */

public class invitados_mty extends AppCompatActivity {
    Spinner menu;
    String[] datos = {"menu", "ubicacion", "invitados MTY", "cosplay MTY"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.invitados_mty);


        menu = (Spinner)findViewById(R.id.menu);
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,datos);
        menu.setAdapter(adaptador);
        menu.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){

                    case 1:
                        Intent intent = new Intent(invitados_mty.this, ubicacion_mty.class);
                        startActivity(intent);
                        break;

                    case 2:
                        Intent intent1 = new Intent(invitados_mty.this, invitados_mty.class);
                        startActivity(intent1);

                        break;

                    case 3:

                        //Intent intent3 = new Intent(invitados_mty.this, cosplay_mty.class);
                      //  startActivity(intent3);
                        break;

                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            };
        });
    };
}
