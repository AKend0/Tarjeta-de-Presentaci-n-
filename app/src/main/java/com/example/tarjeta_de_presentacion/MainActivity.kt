package com.example.tarjeta_de_presentacion

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tarjeta_de_presentacion.ui.theme.Tarjeta_de_presentacionTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Tarjeta_de_presentacionTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    presentation()
                }
            }
        }
    }
}
@Composable
private fun presentation(){
    Column (modifier = Modifier
        .fillMaxSize()
        .background(Color(0xFF0F0F09)),
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally
        ){
        Box (modifier = Modifier

            .padding(top = 250.dp)
        )
            {
            component1(
                name = "Renzo Cardenas",
                tittle = "Android developer Extraordinaire",
                Imagen = painterResource(R.drawable.android_logo)

            )
        }
        Box (
            modifier = Modifier

                .padding(bottom =50.dp)
            ){
            Column {
                component2(
                    icon = Icons.Default.Phone,
                    info = "+5107300797"
                )
                component2(
                    icon = Icons.Default.Share,
                    info = "@awekendo"
                )
                component2(
                    icon = Icons.Default.Email,
                    info = "Awekendio@icloud.com"
                )
            }
        }
    }
}
@Composable
fun component1(name: String, tittle : String, Imagen : Painter, modifier: Modifier = Modifier) {

    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = Imagen,
            contentDescription = null,
            modifier = modifier
                .size(150.dp)
        )
        Text(
            text = name,
            fontSize= 30.sp,
            color = Color.White,
            modifier = modifier
                .padding (top = 8.dp , bottom = 10.dp)

        )
        Text(
            text = tittle,
            color = Color.White,
            modifier = Modifier
                .padding ( bottom = 16.dp)
        )
    }
}
@Composable
fun component2 (icon: ImageVector, info : String, modifier: Modifier = Modifier){
    Row (
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
            .padding(top = 5.dp, bottom = 5.dp)
    ) {
        Icon(
            imageVector = icon,
            contentDescription = null,
            tint = Color.White,
            modifier = modifier
                .size(30.dp)

        )
        Text(
            text = info,
            color = Color.White,
            modifier = modifier
                .padding(start=8.dp)

        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Tarjeta_de_presentacionTheme {
        presentation()
    }
}