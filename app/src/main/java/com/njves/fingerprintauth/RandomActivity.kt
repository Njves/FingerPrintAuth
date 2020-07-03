package com.njves.fingerprintauth

import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class RandomActivity : AppCompatActivity(){
    private lateinit  var tvRandom: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_random)
        tvRandom = findViewById(R.id.tvRandom)
    }
    fun generate(view: View){
        var rand = Math.random()*100
        tvRandom.text = rand.toInt().toString()
    }
}