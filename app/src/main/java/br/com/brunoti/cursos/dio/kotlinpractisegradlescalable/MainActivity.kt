package br.com.brunoti.cursos.dio.kotlinpractisegradlescaling

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.brunoti.cursos.dio.kotlinpractisegradlescaling.databinding.ActivityMainBinding
import br.com.brunoti.cursos.dio.gradle.module1.Module1Activity

class MainActivity : AppCompatActivity() {

    private val binding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btnStart.setOnClickListener{
            startActivity(Intent(this, Module1Activity::class.java))
        }
    }
}