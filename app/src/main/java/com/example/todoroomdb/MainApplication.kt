package com.example.todoroomdb

import android.app.Application
import androidx.room.Room
import com.example.todoroomdb.db.TodoDatabase

class MainApplication : Application(){
     companion object{
         lateinit var todoDatabase : TodoDatabase
     }

    override fun onCreate() {
        super.onCreate()
        todoDatabase = Room.databaseBuilder(
            applicationContext,
            TodoDatabase::class.java,
            TodoDatabase.NAME
        ).build()
    }
}