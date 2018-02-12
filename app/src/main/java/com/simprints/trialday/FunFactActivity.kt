package com.simprints.trialday

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import com.google.firebase.database.FirebaseDatabase
import com.simprints.trialday.data.Database

class FunFactActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fun_fact)



        val submitButton: Button = findViewById(R.id.submitButton)
        val factText: EditText = findViewById(R.id.factText)
        submitButton.setOnClickListener { submitToFireBase(factText.text.toString()) }
    }

    fun submitToFireBase(text: String) {
        //Database.write(text)
    }


}
