package com.farhanaazabdul.manchester_resort.screens

import android.Manifest
import android.app.Activity
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Build
import android.util.Log
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Divider
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.lifecycle.viewmodel.compose.viewModel
import com.farhanaazabdul.manchester_resort.ItemDetailsPageActivity
import com.farhanaazabdul.manchester_resort.ProfileActivity
import com.farhanaazabdul.manchester_resort.R
import com.farhanaazabdul.manchester_resort.components.AppToolbar
import com.farhanaazabdul.manchester_resort.components.NavigationDrawerBody
import com.farhanaazabdul.manchester_resort.components.NavigationDrawerHeader
import com.farhanaazabdul.manchester_resort.data.home.HomeViewModel
import kotlinx.coroutines.launch


@Composable
fun HomeScreen(homeViewModel: HomeViewModel = viewModel()) {

    val scaffoldState = rememberScaffoldState()
    val coroutineScope = rememberCoroutineScope()

    homeViewModel.getUserData()

    Scaffold(
        scaffoldState = scaffoldState,
        topBar = {
            AppToolbar(toolbarTitle = stringResource(id = R.string.home),
                logoutButtonClicked = {
                    homeViewModel.logout()
                },
                navigationIconClicked = {
                    coroutineScope.launch {
                        scaffoldState.drawerState.open()
                    }
                }
            )
        },
        drawerGesturesEnabled = scaffoldState.drawerState.isOpen,
        drawerContent = {
            NavigationDrawerHeader(homeViewModel.emailId.value)
            NavigationDrawerBody(navigationDrawerItems = homeViewModel.navigationItemsList,
                onNavigationItemClicked = {
                    Log.d("ComingHere", "inside_NavigationItemClicked")
                    Log.d("ComingHere", "${it.itemId} ${it.title}")
                })
        }

    ) { paddingValues ->

        Surface(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White)
                .padding(paddingValues)
        ) {
            Column(modifier = Modifier.fillMaxSize()) {
                Box(
                    modifier = Modifier
                        .requiredWidth(width = 360.dp)
                        .requiredHeight(height = 640.dp)
                        .background(color = Color.White)

                ) {
                    Box(
                        modifier = Modifier
                            .requiredWidth(width = 360.dp)
                            .requiredHeight(height = 241.dp)
                            .background(color = Color(0xfff9e1e1))
                    )
                    val localContext = LocalContext.current

                        Image(
                            painter = painterResource(id = R.drawable.person1),
                            contentDescription = "person 1",
                            modifier = Modifier
                                .align(alignment = Alignment.TopStart)
                                .offset(
                                    x = 8.dp,
                                    y = 10.dp
                                )
                                .clickable {
                                    localContext.startActivity(Intent(localContext, ProfileActivity::class.java))
                                }
                                .requiredWidth(width = 71.dp)
                                .requiredHeight(height = 93.dp)
                                .clip(shape = RoundedCornerShape(50.dp)))
                        Text(
                            text = "Welcome Back Ben Stokes",
                            color = Color.Black,
                            style = TextStyle(
                                fontSize = 20.sp,
                                fontWeight = FontWeight.Bold
                            ),
                            modifier = Modifier
                                .align(alignment = Alignment.TopStart)
                                .offset(
                                    x = 87.dp,
                                    y = 37.dp
                                )
                                .requiredWidth(width = 266.dp)
                                .requiredHeight(height = 38.dp)
                        )
                        Text(
                            text = "Discover the Best     Place to Visit",
                            color = Color.Black,
                            style = TextStyle(
                                fontSize = 24.sp,
                                fontWeight = FontWeight.Bold
                            ),
                            modifier = Modifier
                                .align(alignment = Alignment.TopStart)
                                .offset(
                                    x = 97.dp,
                                    y = 80.dp
                                )
                                .requiredWidth(width = 208.dp)
                                .requiredHeight(height = 50.dp)
                        )
                        Box(
                            modifier = Modifier
                                .align(alignment = Alignment.TopStart)
                                .offset(
                                    x = 45.dp,
                                    y = 181.dp
                                )
                                .requiredWidth(width = 270.dp)
                                .requiredHeight(height = 44.dp)
                        ) {
                            Box(
                                modifier = Modifier
                                    .requiredWidth(width = 270.dp)
                                    .requiredHeight(height = 44.dp)
                                    .clip(shape = RoundedCornerShape(10.dp))
                                    .background(color = Color(0xfff4f4f4))
                            )
                            Image(
                                painter = painterResource(id = R.drawable.group1),
                                contentDescription = "Group 1",
                                modifier = Modifier
                                    .align(alignment = Alignment.TopStart)
                                    .offset(
                                        x = 242.368408203125.dp,
                                        y = 12.571449279785156.dp
                                    )
                                    .requiredWidth(width = 12.dp)
                                    .requiredHeight(height = 19.dp)
                            )
                            Divider(
                                color = Color(0xfffbf1f1),
                                modifier = Modifier
                                    .align(alignment = Alignment.TopStart)
                                    .offset(
                                        x = 225.dp,
                                        y = 7.071441650390625.dp
                                    )
                                    .requiredWidth(width = 28.dp)
                                    .rotate(degrees = -90f)
                            )
                            Image(
                                painter = painterResource(id = R.drawable.search),
                                contentDescription = "search",
                                modifier = Modifier
                                    .align(alignment = Alignment.TopStart)
                                    .offset(
                                        x = 15.78955078125.dp,
                                        y = 14.142852783203125.dp
                                    )
                                    .requiredWidth(width = 16.dp)
                                    .requiredHeight(height = 16.dp)
                            )
                        }
                        Text(
                            text = "search here",
                            color = Color.Black,
                            style = TextStyle(
                                fontSize = 16.sp
                            ),
                            modifier = Modifier
                                .align(alignment = Alignment.TopStart)
                                .offset(
                                    x = 124.dp,
                                    y = 190.dp
                                )
                        )
                        Text(
                            text = "Popular",
                            color = Color.Black,
                            style = TextStyle(
                                fontSize = 20.sp
                            ),
                            modifier = Modifier
                                .align(alignment = Alignment.TopStart)
                                .offset(
                                    x = 18.dp,
                                    y = 261.dp
                                )
                        )
                        Text(
                            text = "See All",
                            color = Color(0xfff97847),
                            style = TextStyle(
                                fontSize = 20.sp
                            ),
                            modifier = Modifier
                                .align(alignment = Alignment.TopStart)
                                .offset(
                                    x = 256.dp,
                                    y = 264.dp
                                )
                                .requiredWidth(width = 86.dp)
                                .requiredHeight(height = 25.dp)
                        )

                        Image(
                            painter = painterResource(id = R.drawable.food21),
                            contentDescription = "food2 1",
                            modifier = Modifier
                                .align(alignment = Alignment.TopStart)
                                .offset(
                                    x = 18.dp,
                                    y = 311.dp
                                )
                                .requiredWidth(width = 129.dp)
                                .requiredHeight(height = 121.dp)
                                .clip(shape = RoundedCornerShape(20.dp))

                                .clickable {
                                    localContext.startActivity(
                                        Intent(localContext, ItemDetailsPageActivity::class.java)
                                    )
                                }
                        )
                        Image(
                            painter = painterResource(id = R.drawable.food41),
                            contentDescription = "food4 1",
                            modifier = Modifier
                                .align(alignment = Alignment.TopStart)
                                .offset(
                                    x = 172.dp,
                                    y = 315.dp
                                )
                                .requiredWidth(width = 167.dp)
                                .requiredHeight(height = 114.dp)
                                .clip(shape = RoundedCornerShape(20.dp))
                                .clickable {
                                    localContext.startActivity(
                                        Intent(localContext, ItemDetailsPageActivity::class.java)
                                    )
                                }
                        )
                        Text(
                            text = "Pizza",
                            color = Color.Black,
                            style = TextStyle(
                                fontSize = 20.sp,
                                fontWeight = FontWeight.Bold
                            ),
                            modifier = Modifier
                                .align(alignment = Alignment.TopStart)
                                .offset(
                                    x = 44.dp,
                                    y = 441.dp
                                )
                        )
                        Text(
                            text = "LoliPop",
                            color = Color.Black,
                            style = TextStyle(
                                fontSize = 20.sp,
                                fontWeight = FontWeight.Bold
                            ),
                            modifier = Modifier
                                .align(alignment = Alignment.TopStart)
                                .offset(
                                    x = 203.dp,
                                    y = 441.dp
                                )
                        )
                        Text(
                            text = "Thick Shakes",
                            color = Color.Black,
                            style = TextStyle(
                                fontSize = 20.sp,
                                fontWeight = FontWeight.Bold
                            ),
                            modifier = Modifier
                                .align(alignment = Alignment.TopStart)
                                .offset(
                                    x = 190.dp,
                                    y = 610.dp
                                )
                        )
                        Text(
                            text = "Banana Split",
                            color = Color.Black,
                            style = TextStyle(
                                fontSize = 20.sp,
                                fontWeight = FontWeight.Bold
                            ),
                            modifier = Modifier
                                .align(alignment = Alignment.TopStart)
                                .offset(
                                    x = 18.dp,
                                    y = 610.dp
                                )
                        )
                        Image(
                            painter = painterResource(id = R.drawable.food51),
                            contentDescription = "food5 1",
                            modifier = Modifier
                                .align(alignment = Alignment.TopStart)
                                .offset(
                                    x = 18.dp,
                                    y = 476.dp
                                )
                                .requiredWidth(width = 137.dp)
                                .requiredHeight(height = 129.dp)
                                .clip(shape = RoundedCornerShape(20.dp))
                                .clickable {
                                    localContext.startActivity(
                                        Intent(localContext, ItemDetailsPageActivity::class.java)
                                    )
                                }
                        )
                        Image(
                            painter = painterResource(id = R.drawable.food61),
                            contentDescription = "food6 1",
                            modifier = Modifier
                                .align(alignment = Alignment.TopStart)
                                .offset(
                                    x = 189.dp,
                                    y = 476.dp
                                )
                                .requiredWidth(width = 150.dp)
                                .requiredHeight(height = 129.dp)
                                .clip(shape = RoundedCornerShape(20.dp))
                                .clickable {
                                    localContext.startActivity(
                                        Intent(localContext, ItemDetailsPageActivity::class.java)
                                    )
                                }
                        )
                    }
                }
            }
        }
    }

