package com.example.chall4.model.data

import android.os.Parcelable
import android.provider.ContactsContract
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize

@Parcelize
@Entity
data class DataPegawai(
    @PrimaryKey (autoGenerate = true)
    val id: Int?,
    val email: String,
    val username: String,
    val password: String,

    ): Parcelable