package br.com.brunoti.cursos.dio.kotlinpractisegradlescaling

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.brunoti.cursos.dio.kotlinpractisegradlescaling.databinding.ActivityMainBinding
import br.com.brunoti.cursos.dio.gradle.modulepf.ModulePFActivity
import br.com.brunoti.cursos.dio.gradle.modulepj.ModulePJActivity
import br.com.brunoti.cursos.dio.gradle.moduleother.ModuleOtherActivity


class MainActivity : AppCompatActivity() {

    private val binding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        setClickLinks()
    }

    private fun setClickLinks() {
        binding.labelPF.setOnClickListener{ startActivity(Intent(this, ModulePFActivity::class.java)) }
        binding.labelPJ.setOnClickListener{ startActivity(Intent(this, ModulePJActivity::class.java)) }
        binding.labelMEI.setOnClickListener{ startActivity(Intent(this, ModuleOtherActivity::class.java)) }
        binding.labelLoans.setOnClickListener{ startActivity(Intent(this, ModuleOtherActivity::class.java)) }
        binding.labelInterInvest.setOnClickListener{ startActivity(Intent(this, ModuleOtherActivity::class.java)) }
        binding.labelInterShop.setOnClickListener{ startActivity(Intent(this, ModuleOtherActivity::class.java)) }
        binding.labelInsurance.setOnClickListener{ startActivity(Intent(this, ModuleOtherActivity::class.java)) }
    }
}