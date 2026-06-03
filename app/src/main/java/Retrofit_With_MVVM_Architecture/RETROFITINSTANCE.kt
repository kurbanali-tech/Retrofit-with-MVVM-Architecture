package Retrofit_With_MVVM_Architecture

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RETROFITINSTANCE {

    fun engine(): Retrofit {
        return Retrofit.Builder().
                baseUrl("https://jsonplaceholder.typicode.com/").
                addConverterFactory(GsonConverterFactory.create()).
                build()
    }
    fun body():Retrofitinterfacee{
        return engine().create(Retrofitinterfacee::class.java)
    }


}