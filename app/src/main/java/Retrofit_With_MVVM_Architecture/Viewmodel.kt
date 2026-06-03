package Retrofit_With_MVVM_Architecture

import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import Retrofit_With_MVVM_Architecture.datapackage.dataItem
import androidx.compose.material3.Text
import kotlinx.coroutines.launch

class Apistructure:ViewModel() {


    private val service= RETROFITINSTANCE.body()

    var post by mutableStateOf<List<dataItem>>(emptyList())

    init {

        viewModelScope.launch {

            try {
                //@GET(https://jsonplaceholder.typicode.com/posts)
                post=service.givedata()

                //@POST(https://jsonplaceholder.typicode.com/posts)
                val getpost=service.postdata(

                    dataItem(
                        body = "ccih",
                        title = "kknvinv",
                        id=9,
                        userId = 34
                    )

                )
                Log.d("POST","$getpost")

                //@PUT(https://jsonplaceholder.typicode.com/posts)

                val updateddata= dataItem(
                    body = "KURBAN",
                    title = "SHEIKH",
                    id=11,
                    userId = 32
                )
                val editwholedata=service.editpostt(id=1,location=updateddata)
                Log.d("PUT","$editwholedata")


            }catch (e: Exception){

                Log.e("Error",e.message.toString())

            }

        }

    }

}
