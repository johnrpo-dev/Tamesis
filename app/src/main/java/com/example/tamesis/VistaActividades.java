package com.example.tamesis;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class VistaActividades extends AppCompatActivity {

    Turismo turismo;
    ImageView fotoTurismo;
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vista_actividades);

        fotoTurismo = findViewById(R.id.logotipo);
        turismo = (Turismo) getIntent().getSerializableExtra("datosTurismo");
        text = findViewById(R.id.txtsalida);

        fotoTurismo.setImageResource(turismo.getFotoTurismo());
        text.setText(turismo.getdescripcion());
    }
}