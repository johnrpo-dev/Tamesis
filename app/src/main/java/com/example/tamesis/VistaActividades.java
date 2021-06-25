package com.example.tamesis;

import  androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;


public class VistaActividades extends AppCompatActivity {



    Turismo turismo;
    ImageView fotoTurismo;
    TextView texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vista_actividades);

        fotoTurismo = findViewById(R.id.logotipo);
        turismo = (Turismo) getIntent().getSerializableExtra("datosTurismo");
        texto = findViewById(R.id.txtsalida);

        Picasso.with( VistaActividades.this)
                .load(turismo.getFotoTurismo())
                .into(fotoTurismo);

        texto.setText(turismo.getDescripcion());

    }
}