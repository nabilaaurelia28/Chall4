package com.example.chall4.model.dao

import androidx.room.Dao
import androidx.room.Insert
import com.example.chall4.model.data.DataPegawai

@Dao

interface DataPegawaiDao {
    @Insert
    fun insertDataPegawai (dataPegawai: DataPegawai): Long
}