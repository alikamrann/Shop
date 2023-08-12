package com.alikamran.shop.screens.home

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.alikamran.shop.R
import com.alikamran.shop.boxes.MainSearchBox
import com.alikamran.shop.screens.font.FontFamily

@Composable
fun SaleCompose() {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier

            .wrapContentWidth()
            .wrapContentHeight()

            .background(colorResource(id = R.color.light_gray), shape = RoundedCornerShape(4.dp))
            .padding(4.dp)
    ) {
        Icon(imageVector = ImageVector.vectorResource(R.drawable.ic_agent),
            contentDescription = "Person Icon",
            tint = Color.Black,
            modifier = Modifier.size(height = 28.dp, width = 28.dp),
        )
        Text(stringResource(R.string.watch_auction),
            color = colorResource(id = R.color.black),
            fontSize = 12.sp,
            fontFamily = FontFamily.TextDownloadableFontsSnippet3.fontFamily,
            modifier = Modifier.padding(6.dp,0.dp), maxLines = 1)

    }
}
@Composable
@Preview
fun SaleComposePreview() {
    SaleCompose()
}