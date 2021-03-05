package net.petneeds.data.repository

import android.content.BroadcastReceiver
import android.util.Log
import net.petneeds.data.UserPreferences
import net.petneeds.data.network.AuthApi
import net.petneeds.ui.lostandfound.LostAndFound

class LostAndFoundRepsitory(
    private val api: AuthApi,
    private val preferences: UserPreferences
) : BaseRepository(){

    suspend fun savelostorfound(
        Location: String,
        Breed: String
    ) = safeApiCall {
        val LostAndFound= LostAndFound()
        LostAndFound.location=Location
        LostAndFound.breed=Breed
        Log.i("2","2")
        api.savelostorfound(LostAndFound)
    }


}