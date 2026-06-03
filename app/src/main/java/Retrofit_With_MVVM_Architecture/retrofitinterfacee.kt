package Retrofit_With_MVVM_Architecture

import Retrofit_With_MVVM_Architecture.datapackage.dataItem
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path

interface Retrofitinterfacee {
    @GET("posts")
    suspend fun givedata(): List<dataItem>

    @POST("posts")
    suspend fun postdata(@Body newuser: dataItem):dataItem

    @PUT("posts/{id}")
    suspend fun editpostt(@Path("id")id: Int,
                         @Body location: dataItem
    ):dataItem




}