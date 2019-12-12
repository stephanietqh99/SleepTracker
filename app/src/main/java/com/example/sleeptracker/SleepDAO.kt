package com.example.sleeptracker

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface SleepDAO {
    @Insert
    suspend fun insetSleep(sleep: Sleep)

    @Query("SELECT * FROM sleep")
    suspend fun getSleep() : LiveData< List<Sleep> >

    //select one single record
    @Query("SELECT * FROM sleep WHERE id = :sleep_id")
    suspend fun getAsleep(sleep_id:Int)

    @Update
    suspend fun updateSleep(sleep: Sleep)

    @Delete
    suspend fun deleteSleep(sleep: Sleep)

    @Query("DELETE FROM sleep WHERE id = :sleep_id")
    suspend fun deleteAsleep(sleep_id: Int)
}