package Retrofit_With_MVVM_Architecture

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel


@Composable

fun mainscreen() {

    val viewModel = viewModel<Apistructure>()

    if (viewModel.post.isEmpty()) {

        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        )

        {
            Text(
                text = "Loading Data!",
                fontSize = 40.sp,
                textAlign = TextAlign.Center,
                style = MaterialTheme.typography.bodyLarge
            )
        }


    } else {

        Scaffold() {innerpadding->

            LazyColumn(modifier= Modifier.fillMaxSize().padding(innerpadding)
            ) {


                items(viewModel.post) { item ->

                    Card(modifier = Modifier.padding(10.dp)) {

                        Text(text = item.body)
                        Text(text = item.id.toString())
                        Text(text = item.title)
                        Text(text = item.userId.toString())


                    }
                }
            }
        }
    }
}



