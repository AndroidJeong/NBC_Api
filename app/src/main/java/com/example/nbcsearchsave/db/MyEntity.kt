package com.example.nbcsearchsave.db

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class MyEntity (
    @PrimaryKey(autoGenerate = true) var id : Int? = null,
    @ColumnInfo(name = "source") var source : String,
    @ColumnInfo(name = "date") var date : Int,
    @ColumnInfo(name = "image") var image : Int
)
