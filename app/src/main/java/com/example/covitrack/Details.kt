package com.example.covitrack

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText

class Details : AppCompatActivity() {
    private lateinit var stateDet : EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)
        stateDet = findViewById(R.id.stateDet)
        val state = intent.getStringExtra("state")
        getData(state)
    }
    private fun getData(state: String?)
    {
        val stateAbv = mutableMapOf(
            "AN" to "Andaman and Nicobar Islands",
            "AP" to "Andhra Pradesh",
            "AR" to "Arunachal Pradesh",
            "AS" to "Assam",
            "BR" to "Bihar",
            "CH" to "Chandigarh",
            "CT" to "Chhattisgarh",
            "DN" to "Dadra and Nagar Haveli",
            "DD" to "Daman and Diu",
            "DL" to "Delhi",
            "GA" to "Goa",
            "GJ" to "Gujarat",
            "HR" to "Haryana",
            "HP" to "Himachal Pradesh",
            "JK" to "Jammu and Kashmir",
            "JH" to "Jharkhand",
            "KA" to "Karnataka",
            "KL" to "Kerala",
            "LD" to "Lakshadweep",
            "MP" to "Madhya Pradesh",
            "MH" to "Maharashtra",
            "MN" to "Manipur",
            "ML" to "Meghalaya",
            "MZ" to "Mizoram",
            "NL" to "Nagaland",
            "OR" to "Odisha",
            "PY" to "Pondicherry",
            "PB" to "Punjab",
            "RJ" to "Rajasthan",
            "SK" to "Sikkim",
            "TN" to "Tamil Nadu",
            "TG" to "Telangana",
            "TR" to "Tripura",
            "UP" to "Uttar Pradesh",
            "UT" to "Uttarakhand",
            "WB" to "West Bengal"
        )
        stateDet.setText(stateAbv[state])

    }
}