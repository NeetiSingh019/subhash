package net.petneeds.data.network

import net.petneeds.data.responses.LoginResponse
import net.petneeds.ui.lostandfound.LostAndFound
import retrofit2.http.*

interface AuthApi {

    @FormUrlEncoded
    @POST("auth/login")
    suspend fun login(
        @Field("email") email: String,
        @Field("password") password: String
    ) : LoginResponse

    @Headers("Content-Type: application/json")
    @POST("savelostandfound")
    suspend fun savelostorfound(
        @Body LostAndFound: LostAndFound
    ) : String
}