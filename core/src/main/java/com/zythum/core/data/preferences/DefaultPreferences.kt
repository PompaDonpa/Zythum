package com.zythum.core.data.preferences

import android.content.SharedPreferences
import com.zythum.core.domain.model.UserInfo
import com.zythum.core.domain.preferences.Preferences

class DefaultPreferences(
    private val sharedPref: SharedPreferences
): Preferences {
    override fun saveName(name: String) {
        sharedPref.edit()
            .putString(Preferences.KEY_NAME, name)
            .apply()
    }

    override fun saveLastName(lastName: String) {
        sharedPref.edit()
            .putString(Preferences.KEY_LAST_NAME, lastName)
            .apply()
    }

    override fun saveAge(age: Int) {
        sharedPref.edit()
            .putInt(Preferences.KEY_AGE, age)
            .apply()
    }

    override fun saveWeight(weight: Float) {
        sharedPref.edit()
            .putFloat(Preferences.KEY_WEIGHT, weight)
            .apply()
    }

    override fun saveHeight(height: Int) {
        sharedPref.edit()
            .putInt(Preferences.KEY_HEIGHT, height)
            .apply()
    }

    override fun saveCity(city: String) {
        sharedPref.edit()
            .putString(Preferences.KEY_CITY, city)
            .apply()
    }

    override fun saveState(state: String) {
        sharedPref.edit()
            .putString(Preferences.KEY_STATE, state)
            .apply()
    }

    override fun saveZipCode(zipCode: Long) {
        sharedPref.edit()
            .putLong(Preferences.KEY_ZIPCODE, zipCode)
            .apply()
    }

    override fun loadUserInfo(): UserInfo {
        val name = sharedPref.getString(Preferences.KEY_NAME, null)
        val lastName = sharedPref.getString(Preferences.KEY_LAST_NAME, null)
        val age = sharedPref.getInt(Preferences.KEY_AGE, -1)
        val height = sharedPref.getInt(Preferences.KEY_HEIGHT, -1)
        val weight = sharedPref.getFloat(Preferences.KEY_WEIGHT, -1f)
        val city = sharedPref.getString(Preferences.KEY_CITY, null)
        val state = sharedPref.getString(Preferences.KEY_STATE, null)
        val zipCode = sharedPref.getLong(Preferences.KEY_ZIPCODE, -1L)

        return UserInfo(
            name = name ?: "",
            lastName = lastName ?: "",
            age = age,
            weight = weight,
            height = height,
            city = city ?: "",
            state = state ?: "",
            zipCode = zipCode
        )
    }
}
