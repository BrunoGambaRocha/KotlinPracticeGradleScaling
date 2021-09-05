package br.com.brunoti.cursos.dio.gradle.moduleother

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.brunoti.cursos.dio.gradle.moduleother.databinding.ActivityModuleOtherBinding

class ModuleOtherActivity : AppCompatActivity() {

    private val binding: ActivityModuleOtherBinding by lazy {
        ActivityModuleOtherBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}