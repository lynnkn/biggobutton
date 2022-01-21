package edu.washington.biggobutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {
    // variables
    lateinit var bigBtn : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // initialize count state
        var count = 0
        // get button and set event listener
        bigBtn = findViewById<Button>(R.id.bigBtn)
        bigBtn.setOnClickListener{
            count++
            val includeS = if (count === 1) "time" else "times"
            bigBtn.setText(getString(R.string.btn_push_text, count, includeS))
        }
    }
}