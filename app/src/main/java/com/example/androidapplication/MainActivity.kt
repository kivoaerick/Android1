package com.example.androidapplication

//import android.graphics.Color
//import androidx.compose.foundation.gestures.ModifierLocalScrollableContainerProvider.value
//import androidx.compose.ui.graphics.Color

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.windowInsetsTopHeight
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.semantics.Role.Companion.Checkbox
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.androidapplication.ui.theme.AndroidApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AndroidApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier
                        .background(color = Color.Black)
                        .fillMaxSize()
//                    color = MaterialTheme.colorScheme.background(Color.black)

                ) {


                    Column (modifier= Modifier
                        .clip(shape = RoundedCornerShape(20.dp))
                        .border(width = 2.dp, Color.Green)){ Box(modifier = Modifier
                        .wrapContentHeight()
                        .fillMaxWidth()
                        .height(60.dp),
                        contentAlignment = Alignment.Center){
                        Text(text ="Welcome Back", fontSize =20.sp)

                        }
                        Box(modifier = Modifier
                            .wrapContentHeight()
                            .fillMaxWidth()
                            .height(60.dp),
                            contentAlignment = Alignment.Center){
                            Text(text ="Please Register", fontSize =20.sp)

                        }


                        TextComponent(value ="Hey there. ",
                            22.sp,
                            Color.Green,
                            FontFamily.Cursive,
                            FontWeight.Light,
                            TextAlign.Center)
                        TextComponent(value = "Please register",
                            22.sp,
                            Color.Yellow,
                            FontFamily.Monospace,
                            FontWeight.Light,
                            TextAlign.Left)
                        Spacer(modifier = Modifier.height(0.dp))
                        TextFieldComponent("Enter your Name ")
                        Spacer(modifier = Modifier.height(0.dp))
                        TextFieldComponent("Enter your Email")
                        Spacer(modifier = Modifier.height(0.dp))
                        TextFieldComponent("Enter your address")
                        Spacer(modifier = Modifier.height(0.dp))
                        TextFieldComponent("Enter your password ")
                        Spacer(modifier = Modifier.height(0.dp))
                        CheckboxComponent(value = "By submitting you are agreeing that you have read and understood the terms and conditions ")
                        Button(onClick = { /*TODO*/ },
                            colors =ButtonDefaults.buttonColors(Color.Yellow) ,
                            modifier = Modifier
                                .padding(0.dp)
                                .fillMaxWidth()) {
                            Text(text = "REGISTER HERE")
//                            Spacer(modifier = Modifier.height(50.dp))

                            
                        }
                        Button(onClick = {   val intent = Intent(this@MainActivity,LogInActivity::class.java)
                            startActivity(intent) }, colors = ButtonDefaults.buttonColors(Color.Cyan),
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(0.dp)) {
                            Text(
                                modifier = Modifier.padding(5.dp),
                                text = "LOG IN HERE"
                            )


//                        TextComponent(value = "We missed you",
//                            20.sp,
//                            Color.GREEN,
//                            FontFamily.Cursive,
//                            FontWeight.Light,
//                            TextAlign.Center)


                        }
                        Button(onClick = {val intent =Intent(this@MainActivity,ScrollActivity::class.java)
                            startActivity(intent)

                        },
                            colors =ButtonDefaults.buttonColors(Color.Yellow) ,
                            modifier = Modifier
                                .padding(0.dp)
                                .fillMaxWidth()) {
                            Text(modifier = Modifier.padding(5.dp),
                                text = "BackGroundImage")


                        }
                }
            }
        }
    }
}
//
//@Composable
//fun Greeting(name: String, modifier: Modifier = Modifier) {
//    Text(
//        text = "Hello $name!",
//        modifier = modifier
//    )
//}

//@Preview(showBackground = true, showSystemUi = true)
//@Composable
//fun GreetingPreview() {
//    AndroidApplicationTheme {
//        Greeting("Android")
//    }
//}
//
//@Composable
//fun Erick(value: String){}

@Composable
fun HelloClient(value: String){
    TextComponent(value = "Hey there ",
        32.sp,
        Color.Cyan,
        FontFamily.Cursive,
        FontWeight.Light,
        TextAlign.Center)
}
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun HelloClientPreview(){



    Column (modifier= Modifier
        .clip(shape = RoundedCornerShape(20.dp))
        .border(width = 2.dp, Color.Black)
        ){ Box(modifier = Modifier
        .background(Color.Magenta),
            contentAlignment = Alignment.Center){
        Text(text ="Welcome Back", fontSize =20.sp)
//        Text(
//            text = "WELCOME BACK",)
        }
        Box(modifier = Modifier
            .background(Color.Magenta),
            contentAlignment = Alignment.Center){
            Text(text ="Please Register", fontSize =20.sp)
//        Text(
//            text = "WELCOME BACK",)
        }
        HelloClient(value = "Welcome Again")
        HelloClient(value = "Please Register")
        SecondLine()
        ThirdLine()
//        TextComponent(value ="please register")
//        Erick(value = "Hello There")
//        Erick(value = "Please Register")
        TextComponent(value ="Hey there. ",
            25.sp,
            Color.Green,
            FontFamily.Cursive,
            FontWeight.Light,
            TextAlign.Center)
        TextComponent(value = "Please register",
            22.sp,
            Color.Yellow,
            FontFamily.Monospace,
            FontWeight.Bold,
            TextAlign.Left)



        Spacer(modifier = Modifier.height(0.dp))
        TextFieldComponent("Enter your Name ")
        Spacer(modifier = Modifier.height(0.dp))
        TextFieldComponent("Enter your Email")
        Spacer(modifier = Modifier.height(0.dp))
        TextFieldComponent("Enter your address")
        Spacer(modifier = Modifier.height(0.dp))
        TextFieldComponent("Enter your password ")
        Spacer(modifier = Modifier.height(0.dp))
        CheckboxComponent(value = "By submitting you are agreeing that you have read and understood the terms and conditions ")
        Spacer(modifier = Modifier.height(0.dp))
        Button(onClick = {

        },
            colors =ButtonDefaults.buttonColors(Color.Yellow) ,
            modifier = Modifier
                .padding(26.dp)
                .fillMaxWidth()) {
            Text(modifier = Modifier.padding(0.dp),
                text = "REGISTER HERE")


            }
        Button(onClick = {   val intent = Intent(this@MainActivity,LogInActivity::class.java)
            startActivity(intent) }, colors = ButtonDefaults.buttonColors(Color.Cyan),
            modifier = Modifier
                .fillMaxWidth()
                .padding(15.dp)){
            Text(modifier = Modifier.padding(0.dp),
                text = "LOG IN HERE")


        }
        Button(onClick = {

        },
            colors =ButtonDefaults.buttonColors(Color.Yellow) ,
            modifier = Modifier
                .padding(26.dp)
                .fillMaxWidth()) {
            Text(modifier = Modifier.padding(0.dp),
                text = "BackGroundImage")


        }
 }
    }
@Composable
fun TextFieldLabels(value:String){
    Text(text = value)
}
@Composable
fun CheckboxComponent(value: String){
    Row ( modifier = Modifier
        .fillMaxWidth()
        .heightIn(56.dp)
        .padding(17.dp),
        verticalAlignment = Alignment.CenterVertically){val checkedState =remember {
        mutableStateOf(value=false)
    }
        Checkbox(checked =checkedState.value,onCheckedChange ={

        })
   TextFieldLabels(value =value)}}}
//@Composable
//fun Head(){
//    val head= "Welcome back"
//}



