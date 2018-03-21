package com.meag.a00002816lab02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button buttonGuardar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonGuardar=findViewById(R.id.button_guardar);

    buttonGuardar.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Log.d("Mesaje", "Listener con codigo java");
        }
    });
    }
    public void buttoncancelar(View v){
        Log.d("Mesaje", "Evento de boton anadido");
    }

}
