package com.zythum.core.domain.preferences

import com.zythum.core.domain.model.UserInfo

interface Preferences {
    fun saveName(name: String)
    fun saveLastName(lastName: String)
    fun saveAge(age: Int)
    fun saveWeight(weight: Float)
    fun saveHeight(height: Int)
    fun saveCity(city: String)
    fun saveState(state: String)
    fun saveZipCode(zipCode: Long)

    fun loadUserInfo(): UserInfo

    companion object {
        const val KEY_NAME = "name"
        const val KEY_LAST_NAME = "lastName"
        const val KEY_AGE = "age"
        const val KEY_WEIGHT = "weight"
        const val KEY_HEIGHT = "height"
        const val KEY_CITY = "city"
        const val KEY_STATE = "state"
        const val KEY_ZIPCODE = "zipcode"
    }
}
