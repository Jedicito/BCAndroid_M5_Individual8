package chl.ancud.m4_individual4

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val cajaMensaje1 = findViewById<TextView>(R.id.textNumber1)
        val cajaMensaje2 = findViewById<TextView>(R.id.textNumber2)
        val botonSumar = findViewById<Button>(R.id.botonSumar)
        val botonRestar = findViewById<Button>(R.id.botonRestar)
        val botonDividir = findViewById<Button>(R.id.botonDividir)
        val botonMultiplicar = findViewById<Button>(R.id.botonMultiplicar)
        val botonSalir = findViewById<Button>(R.id.btn_salir)
        botonSumar.setOnClickListener {
            val numero1 = cajaMensaje1.text.toString()
            val numero2 = cajaMensaje2.text.toString()
            if (!numero1.trim { it <= ' ' }.isEmpty() && !numero2.trim { it <= ' ' }.isEmpty()) {
                val resultado = Integer.valueOf(numero1) + Integer.valueOf(numero2)
                Toast.makeText(
                    baseContext,
                    "Sumaste: $numero1+$numero2 = $resultado",
                    Toast.LENGTH_LONG
                ).show()
            } else {
                //Log.d("TAGeo", "onClick Suma else: " + numero1 + "; " + numero2);
                Toast.makeText(baseContext, "Valores proporcionados no válidos", Toast.LENGTH_SHORT)
                    .show()
            }
        }
        botonRestar.setOnClickListener {
            val numero1 = cajaMensaje1.text.toString()
            val numero2 = cajaMensaje2.text.toString()
            if (!numero1.trim { it <= ' ' }.isEmpty() && !numero2.trim { it <= ' ' }.isEmpty()) {
                val resultado = Integer.valueOf(numero1) - Integer.valueOf(numero2)
                Toast.makeText(
                    baseContext,
                    "Sumaste: $numero1-$numero2 = $resultado",
                    Toast.LENGTH_LONG
                ).show()
            } else {
                Toast.makeText(baseContext, "Valores proporcionados no válidos", Toast.LENGTH_SHORT)
                    .show()
            }
        }
        botonMultiplicar.setOnClickListener {
            val numero1 = cajaMensaje1.text.toString()
            val numero2 = cajaMensaje2.text.toString()
            if (!numero1.trim { it <= ' ' }.isEmpty() && !numero2.trim { it <= ' ' }.isEmpty()) {
                val resultado = Integer.valueOf(numero1) * Integer.valueOf(numero2)
                Toast.makeText(
                    baseContext,
                    "Sumaste: $numero1*$numero2 = $resultado",
                    Toast.LENGTH_LONG
                ).show()
            } else {
                Toast.makeText(baseContext, "Valores proporcionados no válidos", Toast.LENGTH_SHORT)
                    .show()
            }
        }
        botonDividir.setOnClickListener {
            val numero1 = cajaMensaje1.text.toString()
            val numero2 = cajaMensaje2.text.toString()
            if (!numero1.trim { it <= ' ' }.isEmpty() && !numero2.trim { it <= ' ' }.isEmpty()) {
                if (java.lang.Float.valueOf(numero2) != 0f) {
                    val resultado =
                        java.lang.Float.valueOf(numero1) / java.lang.Float.valueOf(numero2)
                    Toast.makeText(
                        baseContext,
                        "Sumaste: $numero1/$numero2 = $resultado",
                        Toast.LENGTH_LONG
                    ).show()
                } else {
                    Toast.makeText(baseContext, "Infinito", Toast.LENGTH_LONG).show()
                }
            } else {
                Toast.makeText(baseContext, "Valores proporcionados no válidos", Toast.LENGTH_SHORT)
                    .show()
            }
        }
        botonSalir.setOnClickListener { finishAndRemoveTask() }
    }
}