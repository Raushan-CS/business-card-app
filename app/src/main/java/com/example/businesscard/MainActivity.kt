package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BusinessCard()
                }
            }
        }
    }
}

@Composable
fun BusinessCard( modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFFDEFFD6)),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        CardHolder()
        ContactInformation()
    }
}

@Composable
fun CardHolder(modifier: Modifier = Modifier) {
    val image = painterResource(id = R.drawable.android_logo)
    Column(
        modifier
            .padding(top = 200.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = image,
            contentDescription = "Image",
            modifier
                .background(Color(0xFF2E4053))
                .width(116.dp)
        )
        Text(
            text = stringResource(R.string.name),
            fontSize = 50.sp,
            fontWeight = FontWeight.Light,
            fontFamily = FontFamily.SansSerif,
            fontStyle = FontStyle.Normal,
            color = Color.Black,
            modifier = modifier
                .padding(top = 10.dp)

        )
        Text(
            text = stringResource(R.string.title),
            color = Color(0xFF006f3f),
            modifier = modifier
                .padding(5.dp)
        )
    }
}

@Composable
fun ContactInformation(modifier: Modifier = Modifier) {
    Column(
    modifier
        .padding(top = 200.dp, bottom = 10.dp)
    ) {
        Row(
            modifier
                .padding(5.dp)
        ) {
            Icon(
                Icons.Default.Call,
                contentDescription = "Call Icon",
                tint = Color(0xFF006f3f)
            )
            Spacer(modifier = Modifier.width(8.dp)) // Used to give space in between row's elements
            Text(
                text = "+91 7667938687",
                color = Color.Black,
                fontWeight = FontWeight.Normal,
                modifier = modifier
                    .padding(2.dp)
            )
        }
        Row(
            modifier
                .padding(5.dp)
        ) {
            Icon(Icons.Default.Share, contentDescription = "Share Icon", tint = Color(0xFF006f3f))
            Spacer(modifier = Modifier.width(8.dp)) // Used to give space in between row's elements
            Text(
                text = "@raushan_codes",
                color = Color.Black,
                fontWeight = FontWeight.Normal,
                modifier = modifier
                    .padding(2.dp)
            )
        }
        Row(
            modifier
                .padding(5.dp)
        ) {
            Icon(Icons.Default.Email, contentDescription = "Email Icon", tint = Color(0xFF006f3f))
            Spacer(modifier = Modifier.width(8.dp)) // Used to give space in between row's elements
            Text(
                text = "raushankumargalaxy407@gmail.com",
                color = Color.Black,
                fontWeight = FontWeight.Normal,
                modifier = modifier
                    .padding(2.dp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BusinessCardPreview() {
    BusinessCardTheme {
        BusinessCard()
    }
}