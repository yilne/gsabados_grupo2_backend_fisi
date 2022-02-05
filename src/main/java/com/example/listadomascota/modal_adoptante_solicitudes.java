package com.example.dsm_project2;

import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class modal_adoptante_solicitudes extends AppCompatActivity {
    ImageButton buttonCerrarModal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adoptante_modal_solicitudes_mascota);


        //Modificar el tamaño de la ventana
        DisplayMetrics medidasVentana = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(medidasVentana);
        int ancho = medidasVentana.widthPixels;
        int alto = medidasVentana.heightPixels;
        getWindow().setLayout((int) (ancho*0.85),(int) (alto*0.70));


        buttonCerrarModal = findViewById(R.id.cerrarModal2);
        buttonCerrarModal.setOnClickListener(view -> startActivity(new Intent(modal_adoptante_solicitudes.this, ListadoAdoptanteActivity.class)));
    }
}
