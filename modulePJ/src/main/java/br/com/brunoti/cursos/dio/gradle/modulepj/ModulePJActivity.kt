package br.com.brunoti.cursos.dio.gradle.modulepj

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.brunoti.cursos.dio.gradle.modulepj.databinding.ActivityModulePjBinding

class ModulePJActivity : AppCompatActivity() {

    private val binding: ActivityModulePjBinding by lazy {
        ActivityModulePjBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}