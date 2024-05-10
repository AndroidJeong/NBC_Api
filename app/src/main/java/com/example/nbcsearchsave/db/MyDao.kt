package com.example.nbcsearchsave.db

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface MyDao {

    //get all
    @Query("SELECT * FROM MYENTITY")
    fun getAllInfo() : List<MyEntity>

    //insert todo
    @Insert
    fun insertInfo(info: MyEntity)

    //delete todo
    @Delete
    fun deleteInfo(info: MyEntity)

}