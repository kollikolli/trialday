package com.simprints.trialday

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import com.simprints.trialday.data.Database
import com.simprints.trialday.data.Fact

class FunFactActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fun_fact)

        val submitButton: Button = findViewById(R.id.submitButton)
        val factText: EditText = findViewById(R.id.factText)
        val userText: EditText = findViewById(R.id.nameText)
        submitButton.setOnClickListener { Database.writeFact(Fact(userText.text.toString(), factText.text.toString())) }
    }



}
