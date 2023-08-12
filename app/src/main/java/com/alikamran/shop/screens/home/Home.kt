package com.alikamran.shop.screens.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.alikamran.shop.boxes.MainSearchBox
import com.google.accompanist.pager.ExperimentalPagerApi

@OptIn(ExperimentalPagerApi::class)
@Composable
fun HomeScreen() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(9.dp),
        horizontalAlignment = Alignment.Start){
        MainSearchBox()
        Spacer(modifier = Modifier.height(16.dp))
        SaleCompose()
        Spacer(modifier = Modifier.height(16.dp))
        SliderBanner()

    }

}

@Composable
@Preview
fun HomeScreenPreview() {
    HomeScreen()
}