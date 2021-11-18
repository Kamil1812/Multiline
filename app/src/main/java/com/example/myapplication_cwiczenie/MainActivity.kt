package com.example.myapplication_cwiczenie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var bString = findViewById<Button>(R.id.btn1);
        var bRuntime = findViewById<Button>(R.id.btn2);

        var tString = findViewById<TextView>(R.id.Tekst);
        var tRunTime = findViewById<TextView>(R.id.Runtime);

        var Runtime = "Kamil \n Niewiadomski";

        bRuntime.setOnClickListener()
        {
            tRunTime.text = Runtime;
        }

        bString.setOnClickListener()
        {
            tString.text = getResources().getString(R.string.my_name);
        }

    }
}