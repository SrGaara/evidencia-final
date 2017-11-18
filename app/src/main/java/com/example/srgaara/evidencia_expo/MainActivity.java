package com.example.srgaara.evidencia_expo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    //creas el boton
    Button siguiente;
    Button siguiente2;
    Button siguiente3;
    Spinner menu;
   // String[] datos = {"menu", "ubicacion", "invitados", "cosplay"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //especificas a donde apuntaras el boton siguiente
        siguiente = findViewById(R.id.cdmx);
        siguiente.setOnClickListener(new View.OnClickListener(){
        //esta es la funcion que hace el cambio de pantalla
            @Override
            public void onClick(View view) {
                Intent siguiente = new Intent(MainActivity.this,CDMX.class);
startActivity(siguiente);
            }
        });
        siguiente2 = findViewById(R.id.guadalajara);
        siguiente2.setOnClickListener(new View.OnClickListener(){


            @Override
            public void onClick(View view) {
                Intent siguiente2 = new Intent(MainActivity.this,Guadalajara.class);
                startActivity(siguiente2);
            }
        });
        siguiente3 = findViewById(R.id.monterrey);
        siguiente3.setOnClickListener(new View.OnClickListener(){


            @Override
            public void onClick(View view) {
                Intent siguiente3 = new Intent(MainActivity.this,Monterrey.class);
                startActivity(siguiente3);
            }

        });
/*menu = (Spinner)findViewById(R.id.menu);
        ArrayAdapter<String>adaptador = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,datos);
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

            }
        });*/
}
}
