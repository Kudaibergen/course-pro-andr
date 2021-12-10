package com.kay.progayim

import android.content.Context

interface Preferences {

    fun saveString(key: String, value: String)

    fun saveLogin(login: String)

    fun getString(key: String): String
}

class PreferencesImpl(context: Context) : Preferences {

    private val preferences = context.getSharedPreferences("MyPref", Context.MODE_PRIVATE)

    override fun saveString(key: String, value: String) {
        preferences.edit().apply {
            putString(key, value)
        }.apply()
    }

    override fun saveLogin(login: String) {
        preferences.edit().apply {
            putString(LOGIN_KEY, login)
        }.apply()
    }

    override fun getString(key: String): String {
        return preferences.getString(key, "") ?: ""
    }

    companion object {
        private const val LOGIN_KEY = "LOGIN_KEY"
    }
}