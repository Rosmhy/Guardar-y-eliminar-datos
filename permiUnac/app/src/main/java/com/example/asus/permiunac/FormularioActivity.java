package com.example.asus.permiunac;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class FormularioActivity extends AppCompatActivity{
    Button buttonGuardar, buttonVolver,buttonEnviar;
   private  EditText editTexNombre,editTextApellido,editTextSalida,editTextLlegada,editTexFecha,editTexMotivo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        editTexNombre = (EditText) findViewById(R.id.editTexNombre);
        editTextApellido = (EditText) findViewById(R.id.editTextApellido);
        editTextSalida = (EditText) findViewById(R.id.editTextSalida);
        editTextLlegada = (EditText) findViewById(R.id.editTextLlegada);
        editTexFecha = (EditText) findViewById(R.id.editTexFecha);
        editTexMotivo = (EditText) findViewById(R.id.editTexMotivo);
        buttonGuardar = (Button) findViewById(R.id.buttonGuardar);
        buttonVolver = (Button) findViewById(R.id.buttonVolver);
        buttonEnviar = (Button) findViewById(R.id.buttonEnviar);

    }
    public void GuardarDatos(View view) {
        String nombre = editTexNombre.getText().toString();
        String apellido = editTextApellido.getText().toString();
        String horaSalida = editTextSalida.getText().toString();
        String horaLlegada = editTextLlegada.getText().toString();
        String fecha = editTexFecha.getText().toString();
        String motivo = editTexMotivo.getText().toString();
    }
}
