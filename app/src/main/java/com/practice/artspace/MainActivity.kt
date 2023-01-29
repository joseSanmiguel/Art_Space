package com.practice.artspace

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.practice.artspace.ui.theme.ArtSpaceTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ArtSpaceTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ArtSpace()
                }
            }
        }
    }
}

//Joint whole functions to make the application
@Composable
@Preview(showSystemUi = true)
fun ArtSpace() {
    Column {
        ImageDisplay()
        TextDescription()
        ButtonsNextAndPrevious()
    }

}

//there are three functions (show Image, about Image, buttons next and previous)
@Composable
fun ImageDisplay() {
    Image(
        painter = painterResource(id = R.drawable.fenix),
        contentDescription = stringResource(id = R.string.fenix)
    )
}

@Composable
fun TextDescription(){
    Text(text = fenix.armadura)
    Text(text = fenix.nombreReal)
    Text(text = fenix.poderEspecial)
}

@Composable
fun ButtonsNextAndPrevious(){
    Row {
        Button(onClick = { /*TODO*/ }) {
            Text(text = "Previos")
        }
        Button(onClick = { /*TODO*/ }) {
            Text(text = "Next")
        }
    }
}
