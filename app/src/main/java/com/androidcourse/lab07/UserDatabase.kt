package com.androidcourse.lab07

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [User::class], version = 1)
abstract class UserDatabase: RoomDatabase() {
    abstract fun userDao(): UserDao
}