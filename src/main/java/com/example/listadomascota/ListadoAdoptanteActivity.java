package com.example.dsm_project2;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ListadoAdoptanteActivity extends AppCompatActivity {
    private ImageButton verMas;
    private Button pasarela;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listado_adoptante);
        //trabaja las interacciones de los bobtones "Ver más (ojito)"
        verMas = findViewById(R.id.imageCheck2);
        verMas.setOnClickListener(view -> startActivity(new Intent(ListadoAdoptanteActivity.this, modal_adoptante_solicitudes.class)));




        TableLayout lista = (TableLayout) findViewById(R.id.TableSolicitudes);
        String [] cadena = {"asdsa","asdasda","asdsadsa"};//cadenas a mostrar en cada fila
        TableRow row = new TableRow(getBaseContext());
        TextView textView;
        ImageButton imageButton;
        for (int i=0;i<3;i++){
            textView = new TextView(getBaseContext());
            textView.setGravity(Gravity.CENTER);
            textView.setLayoutParams(new TableLayout.LayoutParams(95, TableLayout.LayoutParams.WRAP_CONTENT));
            textView.setText(cadena[i]);
            System.out.println(textView.getText());
            row.addView(textView);
            //agergar el imageButton

        }
        lista.addView(row);
    }


}
