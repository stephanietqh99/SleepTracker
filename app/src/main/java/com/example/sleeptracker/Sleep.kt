package com.example.sleeptracker

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.security.cert.PolicyQualifierInfo
import java.util.*

@Entity(tableName = "sleep")
class Sleep (
    @PrimaryKey(autoGenerate = true) val id:Int,
    val startDate: String,
    val endDate: Date,
    val quality: Int
)