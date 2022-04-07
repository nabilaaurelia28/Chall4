package com.example.chall4.model

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.chall4.model.dao.DataPegawaiDao
import com.example.chall4.model.data.DataPegawai

@Database (entities = [DataPegawai::class], version = 1)
abstract class RoomDatabaseStore:RoomDatabase() {
    abstract fun dataPegawaiDao ():DataPegawaiDao

    companion object{
        private var dataPegawai:RoomDatabaseStore?=null
        fun getDataPegawai(context: Context):RoomDatabaseStore?{
            if (dataPegawai==null){
                synchronized(RoomDatabaseStore::class.java){
                    dataPegawai=Room.databaseBuilder(context.applicationContext,RoomDatabaseStore::class.java,"DataPegawai.db").build()

                }
            }
            return dataPegawai
        }


    }
}