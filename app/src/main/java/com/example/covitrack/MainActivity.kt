package com.example.covitrack

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
      lateinit var ls:ListView
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ls = findViewById<ListView>(R.id.ls)
        val states: Array<String> = arrayOf("Maharashtra", "Uttar Pradesh", "Delhi", "Chennai", "Madhya Pradesh","karnataka")
        val cases: Array<Int> = arrayOf(6173462, 171441, 13414421,23424,237575,357377)
        val deaths: Array<Int> = arrayOf(4333, 3214, 3121,4252,7451,14314)
        val recovered: Array<Int> = arrayOf(2323, 4242, 2352, 2342,2343,742)
        val myListAdapter = MyListAdapter(this,states, cases, deaths, recovered)
        ls.adapter = myListAdapter

        ls.setOnItemClickListener() { adapterView, view, position, id ->
            val itemAtPos = adapterView.getItemAtPosition(position)
            val itemIdAtPos = adapterView.getItemIdAtPosition(position)
            Toast.makeText(
                this,
                "Click on item at $itemAtPos its item id $itemIdAtPos",
                Toast.LENGTH_LONG
            ).show()
        }
    }
    }