package com.njves.fingerprintauth

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private var count = -1
    private lateinit var tvCount: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvCount = findViewById(R.id.tvCount)
        updateCount()

    }
    fun click(view: View){
        updateCount()
    }

    fun showToast(view: View) {
        Toast.makeText(this, "Current count $count", Toast.LENGTH_SHORT).show()
    }

    fun updateCount(){
        count++;
        tvCount.text = count.toString()
    }

    fun showRandom(view: View){
        val intent = Intent(this, RandomActivity::class.java)
        startActivity(intent)
    }
}
