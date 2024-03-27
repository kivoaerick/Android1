package com.example.androidapplication

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.MaterialTheme
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.androidapplication.ui.theme.AndroidApplicationTheme

class LogInActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AndroidApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Column (modifier= Modifier
                        .clip(shape = RoundedCornerShape(20.dp))
                        .border(width = 2.dp, Color.Green)
                    ){
//        HelloClient()
//        SecondLine()
//        ThirdLine()
//        TextComponent(value ="please register")
//        Erick(value = "Hello There")
//        Erick(value = "Please Register")

                        ImageComponent()
                        TextComponent(value ="Welcome back ",
                            25.sp,
                            Color.Green,
                            FontFamily.Cursive,
                            FontWeight.Light,
                            TextAlign.Center)
                        TextComponent(value = "LogInHere",
                            22.sp,
                            Color.Yellow,
                            FontFamily.Monospace,
                            FontWeight.Bold,
                            TextAlign.Left)

                        Spacer(modifier = Modifier.height(30.dp))
                        TextFieldComponent("Enter your Email")
//                        Spacer(modifier = Modifier.height(40.dp))
//                        TextFieldComponent("Enter your address")
                        Spacer(modifier = Modifier.height(30.dp))
                        TextFieldComponent("Enter your password ")
                        Spacer(modifier = Modifier.height(10.dp))
                        CheckboxComponent(value = "By submitting you are agreeing that you have read and understood the terms and conditions ")
                        Spacer(modifier = Modifier.height(10.dp))
                        Button(onClick = { val intent =Intent(this@LogInActivity,MainActivity::class.java)
                            startActivity(intent)  }, colors = ButtonDefaults.buttonColors(Color.Cyan),
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(15.dp)) {
                            Text(modifier = Modifier.padding(10.dp),
                                text = "REGISTER HERE")}
                        Button(onClick = { val intent =Intent(this@LogInActivity,ScrollActivity::class.java)
                            startActivity(intent)  }, colors = ButtonDefaults.buttonColors(Color.Cyan),
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(15.dp)) {
                            Text(modifier = Modifier.padding(10.dp),
                                text = "REGISTER HERE")}
                            Spacer(modifier = Modifier.height(3.dp))
                            Button(onClick = {},

                                colors =ButtonDefaults.buttonColors(Color.Magenta) ,
                                modifier =Modifier.padding(15.dp).fillMaxWidth())
                                {
                                Text(modifier = Modifier.padding(10.dp),
                                    text = "BackgroundImage")

                            }
                        Button(onClick = { val intent =Intent(this@LogInActivity,ScrollActivity::class.java)
                            startActivity(intent)

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
                fun SecondLine(){
                    TextComponent(value = "Welcome Back",
                        22.sp,
                        Color.Yellow,
                        FontFamily.Monospace,
                        FontWeight.Light,
                        TextAlign.Left)
                }
                @Composable
                fun ThirdLine(){
                    TextComponent(value= "LogInHere",
                        20.sp,
                        Color.Green,
                        FontFamily.Cursive,
                        FontWeight.Light,
                        TextAlign.Center)
                }
                @Composable
                fun TextComponent(
                    value: String,
                    size: TextUnit,
                    colorValue: Color,
                    fontFamilyValue: FontFamily,
                    fontWeightValue: FontWeight,
                    textAlignValue: TextAlign
                )
                {
                    Text(
                        modifier = Modifier
                            .fillMaxWidth()
                            .wrapContentHeight(align = Alignment.Top)
                            .background(Color.Magenta)
                            .padding(18.dp)
                        ,
                        text = value ,
                        TextUnit =size ,
                        Color = colorValue,
                        FontFamily = fontFamilyValue,
                        FontWeight= fontWeightValue,
                        TextAlign = textAlignValue
                    )

                }

                fun Text(modifier: Modifier, text: String, TextUnit: TextUnit, Color: Color, FontFamily: FontFamily, FontWeight: FontWeight, TextAlign: TextAlign) {
                }

//fun Text(modifier: Modifier, text: String, TextUnit: TextUnit, color: Color, fontFamily: FontFamily, fontWight: FontWeight, TextAlign: TextAlign) {


                @Composable
                fun TextFieldComponent(mylabel:String) {
                    Row(modifier = Modifier.padding(15.dp))
                    {


                        var text by remember {
                            mutableStateOf(value = "")
                        }
                        TextField(modifier = Modifier.fillMaxWidth(),
                            value = text, onValueChange = { newText ->
                                text = newText
                            },
                            label = { TextFieldLabels(value = mylabel) })
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
                        verticalAlignment = Alignment.CenterVertically){val checkedState = remember {
                        mutableStateOf(value=false)
                    }
                        Checkbox(checked =checkedState.value,onCheckedChange ={

                        })
                        TextFieldLabels(value =value)}
                }


            }
            }
        }
    }

@Preview



@Composable
fun LogInPreview(){
    Column (modifier= Modifier
        .clip(shape = RoundedCornerShape(20.dp))
        .border(width = 2.dp, Color.Black)
    ){
//        HelloClient()
//        SecondLine()
//        ThirdLine()
//        TextComponent(value ="please register")
//        Erick(value = "Hello There")
//        Erick(value = "Please Register")
        TextComponent(value ="Welcome Back. ",
            25.sp,
            Color.Green,
            FontFamily.Cursive,
            FontWeight.Light,
            TextAlign.Center)
        TextComponent(value = "LogInHere",
            22.sp,
            Color.Yellow,
            FontFamily.Monospace,
            FontWeight.Bold,
            TextAlign.Left)

        ImageComponent()
//        Spacer(modifier = Modifier.height(40.dp))
//        TextFieldComponent("Enter your Name ")
        Spacer(modifier = Modifier.height(30.dp))
        TextFieldComponent("Enter your Email")

        Spacer(modifier = Modifier.height(30.dp))
        TextFieldComponent("Enter your password ")
        Spacer(modifier = Modifier.height(10.dp))
        CheckboxComponent(value = "By submitting you are agreeing that you have read and understood the terms and conditions ")
        Spacer(modifier = Modifier.height(50.dp))
        Button(onClick = { /*TODO*/ }, colors = ButtonDefaults.buttonColors(Color.Cyan),
            modifier = Modifier
                .fillMaxWidth()
                .padding(15.dp)) {
            Text(modifier = Modifier.padding(10.dp),
                text = "REGISTER HERE")}
        Spacer(modifier = Modifier.height(10.dp))
        Button(onClick = {

        },
                colors =ButtonDefaults.buttonColors(Color.Yellow)
            ,modifier =Modifier.padding(11.dp).fillMaxWidth()) {
                Text(modifier = Modifier.padding(15.dp),
                    text = "LOG IN HERE")

            }


        }


    }



@Composable
fun SecondLine(){
    TextComponent(value = "Please register",
        22.sp,
        Color.Yellow,
        FontFamily.Monospace,
        FontWeight.Light,
        TextAlign.Left)
}
@Composable
fun ThirdLine(){
    TextComponent(value= "Welcome Back",
        20.sp,
        Color.Green,
        FontFamily.Cursive,
        FontWeight.Light,
        TextAlign.Center)
}
@Composable
fun TextComponent(
    value: String,
    size: TextUnit,
    colorValue: Color,
    fontFamilyValue: FontFamily,
    fontWeightValue: FontWeight,
    textAlignValue: TextAlign
)
{
    Text(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight(align = Alignment.Top)
            .background(Color.Magenta)
            .padding(18.dp)
        ,
        text = value ,
        TextUnit =size ,
        Color = colorValue,
        FontFamily = fontFamilyValue,
        FontWeight= fontWeightValue,
        TextAlign = textAlignValue
    )

}

fun Text(modifier: Modifier, text: String, TextUnit: TextUnit, Color: Color, FontFamily: FontFamily, FontWeight: FontWeight, TextAlign: TextAlign) {
}

//fun Text(modifier: Modifier, text: String, TextUnit: TextUnit, color: Color, fontFamily: FontFamily, fontWight: FontWeight, TextAlign: TextAlign) {


@Composable
fun TextFieldComponent(mylabel:String) {
    Row(modifier = Modifier.padding(15.dp))
    {


        var text by remember {
            mutableStateOf(value = "")
        }
        TextField(modifier = Modifier.fillMaxWidth(),
            value = text, onValueChange = { newText ->
                text = newText
            },
            label = { TextFieldLabels(value = mylabel) })
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
        verticalAlignment = Alignment.CenterVertically){val checkedState = remember {
        mutableStateOf(value=false)
    }
        Checkbox(checked =checkedState.value,onCheckedChange ={

        })
        TextFieldLabels(value =value)}
}

@Composable
fun ImageComponent(){
    Image(modifier = Modifier
        .wrapContentHeight()
        .fillMaxWidth()
        .height(60.dp),
        painter = painterResource(id = R.drawable.img),
        contentDescription ="Emobilis Logo" )
}
@Composable
fun Txt(){
    TextComponent(
        value = "Welcome Back",
        size = 20.sp,
        colorValue = Color.Black,
        fontFamilyValue = FontFamily.Cursive,
        fontWeightValue = FontWeight.Light,
        textAlignValue = TextAlign.Center
    )

}
//@Composable
//fun leader(){
//    name ="Welcome back"
//}