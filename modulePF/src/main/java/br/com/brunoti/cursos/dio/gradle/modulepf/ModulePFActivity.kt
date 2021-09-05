package br.com.brunoti.cursos.dio.gradle.modulepf

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.brunoti.cursos.dio.gradle.modulepf.databinding.ActivityModulePfBinding

class ModulePFActivity : AppCompatActivity() {

    private val binding: ActivityModulePfBinding by lazy {
        ActivityModulePfBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}