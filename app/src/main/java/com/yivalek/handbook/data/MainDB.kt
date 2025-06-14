package com.yivalek.handbook.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import kotlin.jvm.java

@Database(
    entities = [
        NameEntity::class
    ],
    version = 1
)
abstract class MainDB : RoomDatabase() {
    abstract val dao: Dao
    companion object {
        fun createDataBase(context: Context): MainDB {
            return Room.databaseBuilder(
                context,
                MainDB::class.java,
                "main.db"
            ).build()
        }
    }
}