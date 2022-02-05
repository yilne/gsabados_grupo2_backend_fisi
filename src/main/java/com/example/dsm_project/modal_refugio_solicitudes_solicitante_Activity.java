package com.example.dsm_project2;

import android.content.Intent;
import android.util.DisplayMetrics;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class modal_refugio_solicitudes_solicitante_Activity extends AppCompatActivity {

    Button buttonSiguiente;
    ImageButton buttonCerrarModal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_refugio_modal_solicitudes_solicitante);

        //Modificar el tamaño de la ventana
        DisplayMetrics medidasVentana = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(medidasVentana);

        int ancho = medidasVentana.widthPixels;
        int alto = medidasVentana.heightPixels;

        getWindow().setLayout((int) (ancho*0.85),(int) (alto*0.70));

        //Interacción del botónSiguiente

        buttonSiguiente = findViewById(R.id.buttonSiguiente);
        buttonSiguiente.setOnClickListener(view -> startActivity(new Intent(modal_refugio_solicitudes_solicitante_Activity.this, modal_refugio_solicitudes_mascota_Activity.class)));

        buttonCerrarModal = findViewById(R.id.cerrarModal);
        buttonCerrarModal.setOnClickListener(view -> startActivity(new Intent(modal_refugio_solicitudes_solicitante_Activity.this, ListadoRefugioActivity.class)));

    }
}
