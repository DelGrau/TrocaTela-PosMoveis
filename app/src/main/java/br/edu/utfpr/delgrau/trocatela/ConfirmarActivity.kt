package br.edu.utfpr.delgrau.trocatela

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ConfirmarActivity : AppCompatActivity() {

    private lateinit var etCod: TextView
    private lateinit var etQtd: TextView
    private lateinit var etValor: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_confirmar)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        etCod = findViewById(R.id.etCodConfirmar)
        etQtd = findViewById(R.id.etQtdConfirmar)
        etValor = findViewById(R.id.etValorConfirmar)

        etCod.text = intent.getStringExtra("cod")
        etQtd.text = intent.getStringExtra("qtd")
        etValor.text = intent.getStringExtra("valor")
    }

    fun btSmsOnClick(view: View) {}
}