package com.example.cryptoconverter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.core.widget.doAfterTextChanged
import com.example.cryptoconverter.data.model.Crypto
import com.example.cryptoconverter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        bindAdapters()
        bindListeners()
    }

    private fun bindListeners() {
        binding.TILValue.editText?.doAfterTextChanged {
            binding.btnConvnow.isEnabled = it != null && it.toString().isNotEmpty()
        }
        binding.btnConvnow.setOnClickListener {

        }
    }

    private fun bindAdapters() {
        val list = Crypto.values()
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, list)

        binding.AutoTVFrom.setAdapter(adapter)
        binding.AutoTVTo.setAdapter(adapter)

        binding.AutoTVFrom.setText(Crypto.BTC.name, false)
        binding.AutoTVTo.setText(Crypto.ETH.name, false)
    }
}