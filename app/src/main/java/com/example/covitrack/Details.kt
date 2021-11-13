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
            "DL" to "Delhi",
            "DN" to "Dadra and Nagar Haveli",
            "GA" to "Goa",
            "GJ" to "Gujarat",
            "HP" to "Himachal Pradesh",
            "HR" to "Haryana",
            "JH" to "Jharkhand",
            "JK" to "Jammu and Kashmir",
            "KA" to "Karnataka",
            "KL" to "Kerala",
            "LA" to "Ladakh",
            "LD" to "Lakshadweep",
            "MH" to "Maharashtra",
            "ML" to "Meghalaya",
            "MN" to "Manipur",
            "MP" to "Madhya Pradesh",
            "MZ" to "Mizoram",
            "NL" to "Nagaland",
            "OR" to "Odisha",
            "PB" to "Punjab",
            "PY" to "Pondicherry",
            "RJ" to "Rajasthan",
            "SK" to "Sikkim",
            "TG" to "Telangana",
            "TN" to "Tamil Nadu",
            "TR" to "Tripura",
            "UP" to "Uttar Pradesh",
            "UT" to "Uttarakhand",
            "WB" to "West Bengal"
        )
        stateDet.setText(stateAbv[state])

    }
}