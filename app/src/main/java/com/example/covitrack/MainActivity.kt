package com.example.covitrack

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    private val confirmed:Int = findViewById<TextView>(R.id.)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var states: Array<String> = arrayOf("Maharashtra","Uttar Pradesh","Delhi")
        var cases: Array<Int> = arrayOf(6173462,171441,13414421)
        var deaths:Array<Int> = arrayOf(4333,3214,3121)
        var recovered:Array<Int> = arrayOf(2323,4242,2352)

    }
}