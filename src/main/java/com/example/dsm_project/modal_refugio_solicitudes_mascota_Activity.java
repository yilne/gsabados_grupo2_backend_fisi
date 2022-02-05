package com.example.dsm_project2;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.Toast;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class modal_refugio_solicitudes_mascota_Activity extends AppCompatActivity {
    Spinner spinnerEstado;
    Button buttonAtras;
    ImageButton buttonCerrarModal;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_refugio_modal_solicitudes_mascota);

        //Modificar el tamaño de la ventana
        DisplayMetrics medidasVentana = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(medidasVentana);
        int ancho = medidasVentana.widthPixels;
        int alto = medidasVentana.heightPixels;
        getWindow().setLayout((int) (ancho*0.85),(int) (alto*0.70));

        //Interacción botón atrás
        buttonAtras = findViewById(R.id.buttonAtras);
        buttonAtras.setOnClickListener(view -> startActivity(new Intent(modal_refugio_solicitudes_mascota_Activity.this, modal_refugio_solicitudes_solicitante_Activity.class)));

        spinnerEstado = (Spinner) findViewById(R.id.spinnerEstado);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.combo_estado_solicitud,
                android.R.layout.simple_spinner_item);
        spinnerEstado.setAdapter(adapter);

        //Muestra el cuadro de diálogo al pulsa el botón Actualizar
        findViewById(R.id.buttonActualizar).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mostrarDialogoBasico();
            }
        });

        buttonCerrarModal = findViewById(R.id.cerrarModal1);
        buttonCerrarModal.setOnClickListener(view -> startActivity(new Intent(modal_refugio_solicitudes_mascota_Activity.this, ListadoRefugioActivity.class)));
    }

    private void mostrarDialogoBasico(){
        AlertDialog.Builder builder = new AlertDialog.Builder(modal_refugio_solicitudes_mascota_Activity.this, R.style.DialogBasicCustomStyle);
        builder.setTitle("Mensaje");
        builder.setMessage("Se actualizó el estado")
                .setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getApplicationContext(),"Estado actualizado...",Toast.LENGTH_SHORT).show();
                    }
                })
                .show();
    }
}
