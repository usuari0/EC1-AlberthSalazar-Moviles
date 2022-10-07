package com.example.ec1_alberthsalazar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.ec1_alberthsalazar.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnprint.setOnClickListener(this)

    }

    override fun onClick(p0: View?) {
        imprimirSumas()
    }

    private fun imprimirSumas() {
        var resultado = ""
        for (i in 23..99){
            // Código de lógica por cada interación
            var a =  i / 10
            var b = i-a*10
            var suma = a+b
            resultado += suma.toString()

            // Inicio de código que solo sirve para dar mejor orden en la pantalla
            if(suma.toString().length == 1){
                resultado += "  "
            }
            if(i != 23 && (i+2) % 3 == 0){
                resultado += "\n"
            }else if (i != 99){
                resultado += " - "
            }
            // Fin de código que solo sirve para dar mejor orden en la pantalla
        }

        binding.tvprint.text = resultado
    }
}