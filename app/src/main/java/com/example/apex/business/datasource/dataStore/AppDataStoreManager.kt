package com.example.apex.business.datasource.dataStore

import android.app.Application
import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import kotlinx.coroutines.flow.first

private const val APP_DATASTORE = "app"

class AppDataStoreManager(
    val context: Application
): AppDataStore {

    private val Context.dataStore: DataStore<androidx.datastore.preferences.core.Preferences> by preferencesDataStore(
        APP_DATASTORE
    )

    override suspend fun setValue(
        key: String,
        value: String
    ) {
        context.dataStore.edit {
            it[stringPreferencesKey(key)] = value
        }
    }

    override suspend fun readValue(
        key: String,
    ): String? {
        return context.dataStore.data.first()[stringPreferencesKey(key)]
    }
}