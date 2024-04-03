package com.adso.mycalculator

import android.nfc.Tag
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.adso.mycalculator.databinding.ActivityBotton2Binding

class ActivityBotton2Binding {

}

class Botton2 : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityBotton2Binding
    val TAG ="ButtonActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityBotton2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btndiv.setOnClickListener(this)
        binding.btnMult.setOnClickListener(this)
        binding.btnmenos.setOnClickListener(this)
        binding.btnsuma.setOnClickListener(this)

        binding.btnsie.setOnClickListener(this)
        binding.btnoch.setOnClickListener(this)
        binding.btnnue.setOnClickListener(this)

        binding.btncua.setOnClickListener(this)
        binding.btncinco.setOnClickListener(this)
        binding.btnseis.setOnClickListener(this)

        binding.btnuno.setOnClickListener(this)
        binding.btndos.setOnClickListener(this)
        binding.btntres.setOnClickListener(this)


        Log.d("ButtonActivity", "calculadora")


    }

    override fun onClick(v: View?){
        when(v){
            binding.btndiv-> Toast.makeText(this,"Division",Toast.LENGTH_LONG).show()
            binding.btnMult->Toast.makeText(this,"Multiplicacion",Toast.LENGTH_LONG).show()
            binding.btnmenos->Toast.makeText(this,"Resta",Toast.LENGTH_LONG).show()
            binding.btnsuma->Toast.makeText(this,"Suma",Toast.LENGTH_LONG).show()
            binding.btnsie-> Toast.makeText(this,"Siete",Toast.LENGTH_LONG).show()
            binding.btnoch->Toast.makeText(this,"Ocho",Toast.LENGTH_LONG).show()
            binding.btnnue->Toast.makeText(this,"Nueve",Toast.LENGTH_LONG).show()
            binding.btncua->Toast.makeText(this,"Cuatro",Toast.LENGTH_LONG).show()
            binding.btncinco-> Toast.makeText(this,"Cinco",Toast.LENGTH_LONG).show()
            binding.btnseis->Toast.makeText(this,"Seis",Toast.LENGTH_LONG).show()
            binding.btnuno->Toast.makeText(this,"Uno",Toast.LENGTH_LONG).show()
            binding.btndos->Toast.makeText(this,"Dos",Toast.LENGTH_LONG).show()
            binding.btntres->Toast.makeText(this,"Tres",Toast.LENGTH_LONG).show()


        }
    }