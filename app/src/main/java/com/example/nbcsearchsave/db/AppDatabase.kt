package com.example.nbcsearchsave.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = arrayOf(MyEntity::class), version = 1)
abstract class AppDatabase : RoomDatabase() {

    abstract fun getDao() : MyDao

    companion object {
        val databaseName = "db_search"
        var appDatabase : AppDatabase? = null

        fun getInstance(context : Context) : AppDatabase? {
            if(appDatabase == null){
                appDatabase = Room.databaseBuilder(context,
                    AppDatabase::class.java,
                    databaseName).
                fallbackToDestructiveMigration()
                    .build()

            }
            return appDatabase
        }


    }

}
