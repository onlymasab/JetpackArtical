package com.masabejaz.jetpackartical

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.masabejaz.jetpackartical.ui.theme.JetpackArticalTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackArticalTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                    Artical(title = stringResource(R.string.artical_title), firstContent = stringResource(R.string.article_paragraph_1), secondContent = stringResource(R.string.article_paragraph_2))
                }
            }
        }
    }
}

@Composable
fun Artical( title: String, firstContent: String, secondContent: String, modifier: Modifier = Modifier) {
    val image = painterResource(id = R.drawable.bg_compose_background)
    Column {
        Image(painter = image, contentDescription = null)
        Text(text = title, fontSize = 24.sp, modifier = Modifier.padding(16.dp),)
        Text(text = firstContent, textAlign = TextAlign.Justify, modifier = Modifier.padding(start = 16.dp, end = 16.dp))
        Text(text = secondContent, textAlign = TextAlign.Justify,modifier = Modifier.padding(16.dp))
    }

}

