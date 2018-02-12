package com.simprints.trialday.data

import org.junit.Test

import org.junit.Assert.*


class DatabaseTest {
    @Test
    fun write() {
        Database.database.goOffline()
        Database.write("mymessage")

    }

}