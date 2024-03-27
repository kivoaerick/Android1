package com.example.androidapplication

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androidapplication.ui.theme.AndroidApplicationTheme

class ScrollActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AndroidApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) { Column (modifier= Modifier
                    .clip(shape = RoundedCornerShape(20.dp))
                    .border(width = 2.dp, Color.Green)){
                ListScreen()
                    Button(onClick = {val intent = Intent(this@ScrollActivity,MainActivity::class.java)
                        startActivity(intent)

                    },
                        colors = ButtonDefaults.buttonColors(Color.Yellow) ,
                        modifier = Modifier
                            .padding(0.dp)
                            .fillMaxWidth()) {
                        Text(modifier = Modifier.padding(10.dp),
                            text = "back to register")


                    }
                    Button(onClick = {val intent = Intent(this@ScrollActivity,LogInActivity::class.java)
                        startActivity(intent)

                    },
                        colors = ButtonDefaults.buttonColors(Color.Yellow) ,
                        modifier = Modifier
                            .padding(0.dp)
                            .fillMaxWidth()) {
                        Text(modifier = Modifier.padding(10.dp),
                            text = "back to log in")


                    }
                }
            }
        }
    }
}}

@Composable
fun ListScreen(){
    Box(modifier = Modifier.fillMaxSize()){
        Image(painter = painterResource(id = R.drawable.drawable),
            contentDescription ="Background Image" ,
            contentScale = ContentScale.FillBounds,
            modifier = Modifier.matchParentSize())

    }
Column(modifier =Modifier.fillMaxSize()) {
    LazyRow {
        items(count = 100){
            item->
            Text(text ="$item")
        }
    }

}
}
@Preview
@Composable
fun ListScreenPreview(){
    ListScreen()
}