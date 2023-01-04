package com.adiupd123.jettip

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.adiupd123.jettip.ui.theme.JetTipTheme
import com.adiupd123.jettip.ui.theme.Purple200

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApp {
                TopHeader()
                MainContent()
            }
        }
    }
}

@Composable
fun MyApp(content: @Composable () -> Unit){
    JetTipTheme {
        // A surface container using the 'background' color from the theme
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colors.background
        ) {
            content()
        }
    }
}

@Preview
@Composable
fun TopHeader(){
    Surface(modifier = Modifier
        .fillMaxWidth()
        .height(150.dp)
        .padding(16.dp)
        .clip(shape = RoundedCornerShape(corner = CornerSize(12.dp))),
        color = Color(0xFFE9D7F7)
    ) {
        Column(
            modifier = Modifier.padding(12.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Text(text = "Total Per Person",
                style = MaterialTheme.typography.h5,
                fontWeight = FontWeight.Bold
            )
            Text(text = "\$134.00",
                style = MaterialTheme.typography.h4,
                fontWeight = FontWeight.ExtraBold
            )
        }
    }
}

@Preview
@Composable
fun MainContent(){
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .height(200.dp)
            .padding(12.dp),
        border = BorderStroke(1.dp, Color.LightGray),
        shape = RoundedCornerShape(corner = CornerSize(8.dp))
    ) {
        Column( verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally) {
            Text(text = "Hello World!")
            Text(text = "Hello World!")
            Text(text = "Hello World!")
        }
    }
}
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    JetTipTheme {
        MyApp {
            Column {
                TopHeader()
                MainContent()
            }
        }
    }
}