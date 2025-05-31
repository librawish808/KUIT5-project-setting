package com.konkuk.kuitprojectsetting.presentation.home

import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import com.konkuk.kuitprojectsetting.core.component.KuitTitle
import com.konkuk.kuitprojectsetting.core.util.date.toFormattedDate

@Composable
fun HomeScreen(

    modifier: Modifier = Modifier,
    viewModel: HomeViewModel = hiltViewModel()
) {
    val date = "2025-05-30"
    Text(text = date.toFormattedDate()) // → "2025년 05월 30일"



    LaunchedEffect(Unit) {
        viewModel.getHomeData(1)
        Log.d("Home Screen", "get Home Data")


    }
    Column(
        modifier = modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        KuitTitle(
            title = "Home Screen"
        )
    }

}