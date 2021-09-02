package br.com.brunoti.cursos.dio.kotlinpractisegradlescalable

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.brunoti.cursos.dio.gradle.modulo1.Modulo1Activity
import br.com.brunoti.cursos.dio.kotlinpractisegradlescalable.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btnStart.setOnClickListener{
            startActivity(Intent(this, Modulo1Activity::class.java))
        }
    }
}