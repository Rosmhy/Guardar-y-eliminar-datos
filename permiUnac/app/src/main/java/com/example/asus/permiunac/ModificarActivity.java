package com.example.asus.permiunac;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class ModificarActivity extends AppCompatActivity {
    Button buttonCrear, buttonModificar,buttonEliminar,buttonEstado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modificar_formulario);
        buttonCrear = (Button) findViewById(R.id.buttonCrear);
        buttonModificar = (Button) findViewById(R.id.buttonModificar);
        buttonEliminar = (Button) findViewById(R.id.buttonEliminar);
        buttonEstado = (Button) findViewById(R.id.buttonEstado);

        buttonCrear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {
                startActivity(new Intent(ModificarActivity.this, FormularioActivity.class));
            }
        });
        buttonModificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {
                startActivity(new Intent(ModificarActivity.this, ModificarActivity2.class));
            }
        });

        buttonEliminar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {
                startActivity(new Intent(ModificarActivity.this, EliminarActivity.class));
            }
        });

        buttonEstado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {
                startActivity(new Intent(ModificarActivity.this, EstadoActivity.class));
            }
        });

}

}
