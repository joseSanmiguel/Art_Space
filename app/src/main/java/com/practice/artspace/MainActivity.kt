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
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
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
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        ImageDisplay()
        Spacer(modifier = Modifier.size(8.dp))
        TextDescription()
        Spacer(modifier = Modifier.size(8.dp))
        ButtonsNextAndPrevious()
    }

}

@Composable
fun ImageDisplay() {
    Image(
        painter = painterResource(id = R.drawable.fenix),
        contentDescription = stringResource(id = R.string.fenix)
    )
}

@Composable
fun TextDescription(caballeros: Caballeros) {
    Text(text = caballeros.armadura)
    Text(text = caballeros.nombreReal)
    Text(text = caballeros.poderEspecial)
}

@Composable
fun ButtonsNextAndPrevious() {
    Row {
        Button(onClick = { /*TODO*/ }) {
            Text(text = "Previous")
        }
        Spacer(modifier = Modifier.size(8.dp))
        Button(onClick = { /*TODO*/ }) {
            Text(text = "Next")
        }
    }
}
