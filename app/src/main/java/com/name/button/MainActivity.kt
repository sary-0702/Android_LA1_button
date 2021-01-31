package com.name.button

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
/*
        button.setOnClickListener {
            button.text = "やっほほー"
        }

 */
    }

    fun click(view: View) {
        button.text = "やっほー"
    }
}