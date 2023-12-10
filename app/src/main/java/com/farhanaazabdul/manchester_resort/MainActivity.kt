package com.farhanaazabdul.manchester_resort

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.farhanaazabdul.manchester_resort.app.ResortApps

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ResortApps()
        }
    }
}



