package com.example.mobile3_week2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.activity.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.Observer

class MainActivity : AppCompatActivity(){

    val model: ViewModelClass by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val observer = LifecycleObserver(model)
        this.lifecycle.addObserver(observer)

        model.liveText.observe(this, Observer{
            findViewById<TextView>(R.id.tv1).text = "$it."
        })

    }
}




