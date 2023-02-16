package com.practice.artspace

import android.graphics.Paint.Align
import android.media.Image
import android.os.Bundle
import android.widget.Space
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.practice.artspace.ui.theme.ArtSpaceTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ArtSpaceTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background) {
                    ArtSpace()
                }
            }
        }
    }
}

//Joint whole functions to make the application
@Preview(showSystemUi = true)
@Composable
fun ArtSpace() {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        ImageDisplay()
    }
}

@Composable
fun ImageDisplay() {
    var sticker by remember { mutableStateOf(1) }
    val imageResource = when (sticker) {
        1 -> R.drawable.fenix
        2 -> R.drawable.andromeda
        3 -> R.drawable.dragon
        4 -> R.drawable.cisne
        else -> R.drawable.pegasus
    }
    val clothResource = when (sticker) {
        1 -> R.string.fenix
        2 -> R.string.andromeda
        3 -> R.string.dragon
        4 -> R.string.cisne
        else -> R.string.pegasus
    }
    val nameResource = when (sticker) {
        1 -> R.string.fenix_name
        2 -> R.string.andromeda_name
        3 -> R.string.dragon_name
        4 -> R.string.cisne_name
        else -> R.string.pegasus_name
    }
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Image(painter = painterResource(id = imageResource),
            contentDescription = sticker.toString())
        Text(text = stringResource(clothResource),
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold)
        Text(text = stringResource(nameResource), fontSize = 26.sp)
    }
    Spacer(modifier = Modifier.size(8.dp))
    Row {
        Button(onClick = { /*TODO*/ }) {
            Text(text = "Previous")
        }
        Spacer(modifier = Modifier.size(8.dp))
        Button(onClick = { sticker = (1..5).random() }) {
            Text(text = "Next")
        }
    }
}


