package chl.ancud.m4_individual4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
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
        botonSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String numero1 = cajaMensaje1.getText().toString();
                String numero2 = cajaMensaje2.getText().toString();

                String resultado = numero1;

                Toast.makeText(getBaseContext(), "Sumaste: " + numero1 + "+" + numero2, Toast.LENGTH_LONG).show();

            }
        });
    }
}