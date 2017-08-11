package com.example.desktop.curso111mil;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Usuario usuario;
    private Button button ;
    private EditText campoNombre;
    private EditText campoContrasenia;
    private EditText campoRepContrasenia;
    private EditText campoMail;
    private TextView mensaje;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usuario = new Usuario();
        button = (Button) findViewById(R.id.button);
        campoNombre = (EditText) findViewById(R.id.campo_nombre);
        campoContrasenia = (EditText) findViewById(R.id.campo_contrasenia);
        campoRepContrasenia = (EditText) findViewById(R.id.campo_repContrasenia);
        campoMail = (EditText) findViewById(R.id.campo_mail);
        mensaje = (TextView) findViewById(R.id.mensaje);

    }

    public void guardarDatos(View v){

        if(campoContrasenia.getText().toString().equals(campoRepContrasenia.getText().toString()) & !(campoContrasenia.getText().toString().equals("")) ){

            usuario.setNombre(campoNombre.getText().toString());
            usuario.setContrasenia(campoContrasenia.getText().toString());
            usuario.setMail(campoMail.getText().toString());
            if(usuario.getNombre().equals("")){
                mensaje.setText("Falta completar: Nombre y Apellido");
                mensaje.setTextColor(Color.RED);
                mensaje.setVisibility(View.VISIBLE);
                campoNombre.requestFocus();
            } else if(usuario.getMail().equals("")) {
                mensaje.setText("Falta completar: E-mail");
                mensaje.setTextColor(Color.RED);
                mensaje.setVisibility(View.VISIBLE);
                campoMail.requestFocus();
            } else  {
                mensaje.setTextColor(Color.GRAY);
                mensaje.setText("Está todo OK, "+usuario.getNombre());
                mensaje.setVisibility(View.VISIBLE);
            }




        }else{
            mensaje.setText("Las contraseñas no coinsiden");
            mensaje.setVisibility(View.VISIBLE);
        }

    }
}
