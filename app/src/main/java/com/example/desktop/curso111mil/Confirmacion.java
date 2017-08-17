package com.example.desktop.curso111mil;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Confirmacion extends AppCompatActivity {

    Intent intent = getIntent();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmacion);
        //String mensaje = intent.getStringExtra("EXTRA_NOMBRE");
        TextView textView = (TextView) findViewById(R.id.mensajeV2);
        textView.setText("La incripción a sido exitosa, ");
    }

    public void lanzarWeb(View v){
        Uri webpage = Uri.parse("http://hermosaprogramacion.blogspot.com");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }
}
