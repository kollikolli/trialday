package com.simprints.trialday.data

import com.google.firebase.database.FirebaseDatabase




object Database {

    private val database = FirebaseDatabase.getInstance()
    private val factref = database.getReference("fact")


    fun writeFact(fact: Fact) {
        factref.child(fact.fact).setValue(fact.user)
    }
}