package com.farhanaazabdul.manchester_resort

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.farhanaazabdul.manchester_resort.ui.theme.ManchesterResortAppTheme

class AddtoCartActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ManchesterResortAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .requiredWidth(width = 360.dp)
            .requiredHeight(height = 618.dp)
            .background(color = Color.White)
    ) {
        Text(
            text = "ICC Cricket world Cup",
            color = Color.White,
            textAlign = TextAlign.Center,
            style = TextStyle(
                fontSize = 23.sp,
                letterSpacing = (-0.3).sp),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 70.dp,
                    y = 161.dp)
                .wrapContentHeight(align = Alignment.Bottom))
        Text(
            text = "Thick Shakes Combo",
            color = Color.Black,
            textAlign = TextAlign.Center,
            style = TextStyle(
                fontSize = 28.sp,
                letterSpacing = (-0.3).sp),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = (-2).dp,
                    y = 226.dp)
                .wrapContentHeight(align = Alignment.Bottom))
        Text(
            text = "Pizza",
            color = Color.Black,
            textAlign = TextAlign.Center,
            style = TextStyle(
                fontSize = 24.sp,
                letterSpacing = (-0.3).sp),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 261.dp,
                    y = 285.dp)
                .wrapContentHeight(align = Alignment.Bottom))
        Text(
            text = "Banana Split",
            color = Color.Black,
            textAlign = TextAlign.Center,
            style = TextStyle(
                fontSize = 24.sp,
                letterSpacing = (-0.3).sp),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 215.dp,
                    y = 437.dp)
                .wrapContentHeight(align = Alignment.Bottom))
        Image(
            painter = painterResource(id = R.drawable.food62),
            contentDescription = "food6 2",
            modifier = Modifier
                .requiredWidth(width = 360.dp)
                .requiredHeight(height = 218.dp)
                .clip(shape = RoundedCornerShape(20.dp)))
        Image(
            painter = painterResource(id = R.drawable.food22),
            contentDescription = "food2 2",
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 2.dp,
                    y = 285.dp)
                .requiredWidth(width = 205.dp)
                .requiredHeight(height = 107.dp)
                .clip(shape = RoundedCornerShape(20.dp)))
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 245.dp,
                    y = 316.dp)
                .requiredWidth(width = 89.dp)
                .requiredHeight(height = 26.dp)
        ) {
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 31.dp,
                        y = 1.dp)
                    .requiredWidth(width = 29.dp)
                    .requiredHeight(height = 25.dp)
                    .clip(shape = RoundedCornerShape(5.dp))
                    .background(color = Color(0xff656565).copy(alpha = 0.5f))
            ) {
                Text(
                    text = "1",
                    color = Color.Black,
                    textAlign = TextAlign.Center,
                    style = TextStyle(
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Bold),
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 9.dp,
                            y = 0.dp)
                        .requiredWidth(width = 12.dp)
                        .requiredHeight(height = 25.dp)
                        .wrapContentHeight(align = Alignment.CenterVertically))
            }
            Image(
                painter = painterResource(id = R.drawable.subtract),
                contentDescription = "Subtract",
                contentScale = ContentScale.Inside,
                modifier = Modifier
                    .requiredWidth(width = 29.dp)
                    .requiredHeight(height = 25.dp))
            Image(
                painter = painterResource(id = R.drawable.plusmath),
                contentDescription = "Plus Math",
                contentScale = ContentScale.Inside,
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 60.dp,
                        y = 0.dp)
                    .requiredWidth(width = 29.dp)
                    .requiredHeight(height = 25.dp))
        }
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 235.dp,
                    y = 473.dp)
                .requiredWidth(width = 89.dp)
                .requiredHeight(height = 26.dp)
        ) {
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 31.dp,
                        y = 1.dp)
                    .requiredWidth(width = 29.dp)
                    .requiredHeight(height = 25.dp)
                    .clip(shape = RoundedCornerShape(5.dp))
                    .background(color = Color(0xff656565).copy(alpha = 0.5f))
            ) {
                Text(
                    text = "1",
                    color = Color.Black,
                    textAlign = TextAlign.Center,
                    style = TextStyle(
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Bold),
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 9.dp,
                            y = 0.dp)
                        .requiredWidth(width = 12.dp)
                        .requiredHeight(height = 25.dp)
                        .wrapContentHeight(align = Alignment.CenterVertically))
            }
            Image(
                painter = painterResource(id = R.drawable.subtract),
                contentDescription = "Subtract",
                contentScale = ContentScale.Inside,
                modifier = Modifier
                    .requiredWidth(width = 29.dp)
                    .requiredHeight(height = 25.dp))
            Image(
                painter = painterResource(id = R.drawable.plusmath),
                contentDescription = "Plus Math",
                contentScale = ContentScale.Inside,
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 60.dp,
                        y = 0.dp)
                    .requiredWidth(width = 29.dp)
                    .requiredHeight(height = 25.dp))
        }
        Text(
            text = "£",
            color = Color(0xfff97847),
            style = MaterialTheme.typography.headlineSmall,
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 255.dp,
                    y = 358.dp)
                .requiredWidth(width = 17.dp)
                .requiredHeight(height = 28.dp))
        Text(
            text = "£",
            color = Color(0xfff97847),
            style = MaterialTheme.typography.headlineSmall,
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 255.dp,
                    y = 525.dp)
                .requiredWidth(width = 17.dp)
                .requiredHeight(height = 28.dp))
        Text(
            text = "30",
            color = Color(0xfff97847),
            style = MaterialTheme.typography.headlineSmall,
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 274.dp,
                    y = 358.dp)
                .requiredWidth(width = 50.dp)
                .requiredHeight(height = 28.dp))
        Text(
            text = "30",
            color = Color(0xfff97847),
            style = MaterialTheme.typography.headlineSmall,
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 272.dp,
                    y = 525.dp)
                .requiredWidth(width = 50.dp)
                .requiredHeight(height = 28.dp))
        Image(
            painter = painterResource(id = R.drawable.food52),
            contentDescription = "food5 2",
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 2.dp,
                    y = 435.dp)
                .requiredWidth(width = 196.dp)
                .requiredHeight(height = 126.dp)
                .clip(shape = RoundedCornerShape(20.dp)))
        val localContext = LocalContext.current
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 63.dp,
                    y = 571.dp)
                .clickable {
                    localContext.startActivity(
                        Intent(localContext, PaymentActivity::class.java)
                    )
                }
                .requiredWidth(width = 227.dp)
                .requiredHeight(height = 50.dp)
                .clip(shape = RoundedCornerShape(10.dp))
                .background(color = Color(0xff090808)))
        Text(
            text = "Book Now",
            color = Color.White,
            style = TextStyle(
                fontSize = 20.sp),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 122.dp,
                    y = 578.dp)
                .requiredWidth(width = 142.dp)
                .requiredHeight(height = 29.dp))
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ManchesterResortAppTheme {
        Greeting("Android")
    }
}