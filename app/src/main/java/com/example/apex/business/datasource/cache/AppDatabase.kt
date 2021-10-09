package com.example.apex.business.datasource.cache

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.apex.business.api.persistence.AuthTokenDao
import com.example.apex.business.datasource.cache.account.AccountDao
import com.example.apex.business.datasource.cache.account.AccountEntity
import com.example.apex.business.datasource.cache.auth.AuthTokenEntity

@Database(entities = [AuthTokenEntity::class, AccountEntity::class], version = 1)
abstract class AppDatabase: RoomDatabase() {
    abstract fun getAuthTokenDao(): AuthTokenDao

    abstract fun getAccountDao(): AccountDao

    companion object {
        const val DATABASE_NAME = "app_db"
    }
}