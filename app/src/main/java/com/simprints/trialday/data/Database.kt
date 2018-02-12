package com.simprints.trialday.data

import com.google.android.gms.tasks.Task
import com.google.firebase.database.FirebaseDatabase




object Database {

    private val database = FirebaseDatabase.getInstance()
    private val factref = database.getReference("fact")


    fun writeFact(fact: Fact): Task<Void> {
        return factref.push().setValue(fact)
    }
}