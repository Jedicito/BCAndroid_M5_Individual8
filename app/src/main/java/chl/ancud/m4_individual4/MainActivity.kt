package chl.ancud.m4_individual4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView cajaMensaje1 = findViewById(R.id.textNumber1);
        TextView cajaMensaje2 = findViewById(R.id.textNumber2);

        Button botonSumar = findViewById(R.id.botonSumar);
        Button botonRestar = findViewById(R.id.botonRestar);
        Button botonDividir = findViewById(R.id.botonDividir);
        Button botonMultiplicar = findViewById(R.id.botonMultiplicar);
        Button botonSalir = findViewById(R.id.btn_salir);
        botonSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String numero1 = cajaMensaje1.getText().toString();
                String numero2 = cajaMensaje2.getText().toString();


                if(!numero1.trim().isEmpty() && !numero2.trim().isEmpty()) {
                    Integer resultado = Integer.valueOf(numero1) + Integer.valueOf(numero2);
                    Toast.makeText(getBaseContext(), "Sumaste: " + numero1 + "+" + numero2 + " = " + resultado, Toast.LENGTH_LONG).show();
                } else {
                    //Log.d("TAGeo", "onClick Suma else: " + numero1 + "; " + numero2);
                    Toast.makeText(getBaseContext(), "Valores proporcionados no válidos", Toast.LENGTH_SHORT).show();
                }
            }
        });

        botonRestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String numero1 = cajaMensaje1.getText().toString();
                String numero2 = cajaMensaje2.getText().toString();

                if(!numero1.trim().isEmpty() && !numero2.trim().isEmpty()) {
                    Integer resultado = Integer.valueOf(numero1) - Integer.valueOf(numero2);
                    Toast.makeText(getBaseContext(), "Sumaste: " + numero1 + "-" + numero2 + " = " + resultado, Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(getBaseContext(), "Valores proporcionados no válidos", Toast.LENGTH_SHORT).show();
                }
            }
        });

        botonMultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String numero1 = cajaMensaje1.getText().toString();
                String numero2 = cajaMensaje2.getText().toString();

                if(!numero1.trim().isEmpty() && !numero2.trim().isEmpty()) {
                Integer resultado = Integer.valueOf(numero1) * Integer.valueOf(numero2);

                Toast.makeText(getBaseContext(), "Sumaste: " + numero1 + "*" + numero2 + " = " + resultado, Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(getBaseContext(), "Valores proporcionados no válidos", Toast.LENGTH_SHORT).show();
                }
            }
        });

        botonDividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String numero1 = cajaMensaje1.getText().toString();
                String numero2 = cajaMensaje2.getText().toString();

                if(!numero1.trim().isEmpty() && !numero2.trim().isEmpty()) {
                    if(Float.valueOf(numero2) != 0) {
                        Float resultado = Float.valueOf(numero1) / Float.valueOf(numero2);
                        Toast.makeText(getBaseContext(), "Sumaste: " + numero1 + "/" + numero2 + " = " + resultado, Toast.LENGTH_LONG).show();
                    } else {
                        Toast.makeText(getBaseContext(), "Infinito", Toast.LENGTH_LONG).show();
                    }
                } else {
                    Toast.makeText(getBaseContext(), "Valores proporcionados no válidos", Toast.LENGTH_SHORT).show();
                }
            }
        });

        botonSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finishAndRemoveTask();
            }
        });

    }
}