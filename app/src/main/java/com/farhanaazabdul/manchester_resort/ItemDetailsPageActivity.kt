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
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.farhanaazabdul.manchester_resort.ui.theme.ManchesterResortAppTheme

class ItemDetailsPageActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ManchesterResortAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting2("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting2(name: String, modifier: Modifier = Modifier) {

    Box(
        modifier = modifier
            .requiredWidth(width = 360.dp)
            .requiredHeight(height = 618.dp)
            .background(color = Color.White)
    ) {
        Box(
            modifier = Modifier
                .requiredWidth(width = 360.dp)
                .requiredHeight(height = 640.dp)
                .background(color = Color.White)
        ) {
            Text(
                text = "Thick Shakes",
                color = Color(0xff060606),
                textAlign = TextAlign.Center,
                style = TextStyle(
                    fontSize = 32.sp,
                    letterSpacing = (-0.3).sp),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 2.dp,
                        y = 233.dp)
                    .wrapContentHeight(align = Alignment.Bottom))
            Image(
                painter = painterResource(id = R.drawable.mdi_location),
                contentDescription = "",
                colorFilter = ColorFilter.tint(Color.White),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 14.dp,
                        y = 296.dp)
                    .requiredSize(size = 24.dp))
            Text(
                text = "ground around the earth.",
                color = Color.White,
                textAlign = TextAlign.Center,
                style = TextStyle(
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Light,
                    letterSpacing = (-0.3).sp),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 91.dp,
                        y = 510.dp)
                    .wrapContentHeight(align = Alignment.Bottom))
            Text(
                text = "27/10/2023",
                color = Color.White,
                textAlign = TextAlign.Center,
                style = TextStyle(
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Light,
                    letterSpacing = (-0.3).sp),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 234.dp,
                        y = 302.dp)
                    .wrapContentHeight(align = Alignment.Bottom))
            val localContext = LocalContext.current
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 31.dp,
                        y = 551.dp)
                    .requiredWidth(width = 298.dp)
                    .requiredHeight(height = 66.dp)
                    .clip(shape = RoundedCornerShape(10.dp))
                    .background(color = Color(0xff010101))

                    .clickable {
                        localContext.startActivity(
                            Intent(localContext, AddtoCartActivity::class.java)
                        )
                    }
            )
            Text(
                text = "Add to Cart",
                color = Color.White,
                style = MaterialTheme.typography.headlineSmall,
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 113.dp,
                        y = 569.dp))
            Image(
                painter = painterResource(id = R.drawable.food63),
                contentDescription = "food6 3",
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 0.dp,
                        y = (-4).dp)
                    .requiredWidth(width = 360.dp)
                    .requiredHeight(height = 218.dp)
                    .clip(shape = RoundedCornerShape(20.dp)))
            Text(
                text = "£",
                color = Color(0xfff97847),
                style = MaterialTheme.typography.displaySmall,
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 259.dp,
                        y = 235.dp)
                    .requiredWidth(width = 17.dp)
                    .requiredHeight(height = 28.dp))
            Text(
                text = "30",
                color = Color(0xfff97847),
                style = MaterialTheme.typography.displaySmall,
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 286.dp,
                        y = 233.dp)
                    .requiredWidth(width = 50.dp)
                    .requiredHeight(height = 28.dp))
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 26.dp,
                        y = 291.dp)
                    .requiredWidth(width = 66.dp)
                    .requiredHeight(height = 30.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.vvector),
                    contentDescription = "Vector",
                    modifier = Modifier
                        .fillMaxSize())
                Text(
                    text = "4.5",
                    color = Color(0xff2b2727),
                    style = TextStyle(
                        fontSize = 20.sp),
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 36.dp,
                            y = 2.dp)
                        .requiredWidth(width = 30.dp)
                        .requiredHeight(height = 17.dp))
            }
            Text(
                text = "About",
                color = Color.Black,
                style = MaterialTheme.typography.headlineSmall,
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 26.dp,
                        y = 368.dp))
        }
        Text(
            text = "80% of people suggest this product",
            color = Color(0xff0a090b).copy(alpha = 0.5f),
            style = TextStyle(
                fontSize = 12.sp),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 19.dp,
                    y = 325.dp))
        Text(
            text = "Lorem ipsum dolor sit amet consectetur. Quam fames vestibulum pulvinar sit sodales integer commodo. Varius quam amet et dolor orci rhoncus eu urna dolor. Sed sed consectetur in eget ipsum suspendisse viverra. Sodales mus eget nulla justo mauris amet pellentesque augue. Et faucibus pellentesque aliquet elementum dictumst. Nibh id duis leo porta donec laoreet.",
            color = Color(0xff0a090b),
            style = TextStyle(
                fontSize = 12.sp),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 19.dp,
                    y = 402.dp)
                .requiredWidth(width = 335.dp)
                .requiredHeight(height = 120.dp))
    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview2() {
    ManchesterResortAppTheme {
        Greeting2("Android")
    }
}