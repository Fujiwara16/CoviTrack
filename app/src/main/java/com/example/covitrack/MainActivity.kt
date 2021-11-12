package com.example.covitrack

import android.os.Bundle
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import org.json.JSONObject


class MainActivity : AppCompatActivity() {
      private lateinit var ls:ListView
      private lateinit var states: ArrayList<String>
    private lateinit var cases : ArrayList<String>
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ls = findViewById<ListView>(R.id.ls)

        states = arrayListOf()
        cases = arrayListOf()
        getData()

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
        private fun getData(){
// Instantiate the RequestQueue.

            val queue = Volley.newRequestQueue(this)
            val url = "https://data.covid19india.org/v4/min/data.min.json"
// Request a string response from the provided URL.

            val sr = StringRequest(Request.Method.GET, url, Response.Listener { response ->
                val jsonObj = JSONObject(response)
                    // Display the first 500 characters of the response string.
                   // val data: JSONObject = jsonObj.getJSONObject("AN")
                    val keys: Iterator<*> = jsonObj.keys()


                    while (keys.hasNext()) {
                        // loop to get the dynamic key
                        val currentDynamicKey = keys.next() as String
                        states.add(currentDynamicKey) // states updated


                       val currentDynamicValue = jsonObj.getJSONObject(currentDynamicKey).getJSONObject("total").getString("confirmed") as String
                        cases.add(currentDynamicValue) //cases  updated


                    }
                },
                { "That didn't work!" })

// Add the request to the RequestQueue.
            queue.add(sr)
        }
    }