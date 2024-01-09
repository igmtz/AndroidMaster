package com.gmtz.androidmaster.imccalculator

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.core.content.ContextCompat
import com.gmtz.androidmaster.R
import com.gmtz.androidmaster.imccalculator.ImcCalculatorActivity.Companion.IMC_KEY

class ResultIMCActivity : AppCompatActivity() {

    private lateinit var textViewResult: TextView
    private lateinit var textViewIMCResult: TextView
    private lateinit var textViewDescription: TextView
    private lateinit var btnRecalculate: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result_imcactivity)

        val result: Double = intent.extras?.getDouble(IMC_KEY) ?: -1.0

        initComponents()
        initUI(result)
        initListeners()
    }

    private fun initListeners() {
        btnRecalculate.setOnClickListener { onBackPressed() }
    }

    @SuppressLint("SetTextI18n")
    private fun initUI(result: Double) {
        textViewIMCResult.text = result.toString()
        when (result) {
            in 0.00..18.50 -> {
                textViewResult.text = "Bajo"
                textViewResult.setTextColor(ContextCompat.getColor(this, R.color.peso_bajo))
                textViewDescription.text = "Estás por debajo del IMC normal"
            }
            in 18.51..24.99 -> {
                textViewResult.text = "Normal"
                textViewResult.setTextColor(ContextCompat.getColor(this, R.color.peso_normal))
                textViewDescription.text = "Tienes un IMC Normal"
            }
            in 25.00..29.99 -> {
                textViewResult.text = "Sobrepeso"
                textViewResult.setTextColor(ContextCompat.getColor(this, R.color.peso_sobrepeso))
                textViewDescription.text = "Estás por encima de tu IMC normal"
            }
            in 30.00..99.00 -> {
                textViewResult.text = "Obesidad"
                textViewResult.setTextColor(ContextCompat.getColor(this, R.color.obesidad))
                textViewDescription.text = "Estás muy por en encima de tu IMC normal"
            }
            else -> {
                textViewIMCResult.text = "Error"
                textViewResult.text = "Error"
                textViewResult.setTextColor(ContextCompat.getColor(this, R.color.obesidad))
                textViewDescription.text = "Error"
            }
        }
    }

    private fun initComponents() {
        textViewIMCResult = findViewById(R.id.textViewIMCResult)
        textViewResult = findViewById(R.id.textViewResult)
        textViewDescription = findViewById(R.id.textViewDescription)
        btnRecalculate = findViewById(R.id.btnRecalculate)
    }

}