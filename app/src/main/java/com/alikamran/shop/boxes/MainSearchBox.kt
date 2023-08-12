package com.alikamran.shop.boxes

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
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
import androidx.compose.ui.graphics.Color.Companion.Gray
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.googlefonts.Font
import androidx.compose.ui.text.googlefonts.GoogleFont
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.alikamran.shop.R
import com.alikamran.shop.boxes.TextDownloadableFontsSnippet3.TextDownloadableFontsSnippet1.provider
import com.alikamran.shop.boxes.TextDownloadableFontsSnippet3.fontFamily

private object TextDownloadableFontsSnippet3 {


    val fontName = GoogleFont("Lobster Two")
    private object TextDownloadableFontsSnippet1 {
        val provider = GoogleFont.Provider(
            providerAuthority = "com.google.android.gms.fonts",
            providerPackage = "com.google.android.gms",
            certificates = R.array.com_google_android_gms_fonts_certs
        )
    }

    val fontFamily = FontFamily(
        Font(
            googleFont = fontName,
            fontProvider = provider,
            weight = FontWeight.Bold,
            style = FontStyle.Italic
        )
    )
    // [END android_compose_text_df_fontFamily_style]
}

@Composable
fun MainSearchBox() {
    var cardColor by remember { mutableStateOf(Gray)}
    Row(verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()

            .border(
                border = BorderStroke(1.dp, colorResource(id = R.color.gray)),
                shape = RoundedCornerShape(4.dp),
            )
            .padding(6.dp, 10.dp, 6.dp, 10.dp)) {
        Icon(imageVector = Icons.Default.Search,
            contentDescription = "Person Icon",
            tint = Gray,
            modifier = Modifier.size(height = 28.dp, width = 28.dp),
        )
        Text(stringResource(R.string.digistyle),
            color = colorResource(id = R.color.black),
            fontSize = 20.sp,
            fontFamily = fontFamily,
            modifier = Modifier.padding(6.dp,0.dp,0.dp,0.dp))
        Text(stringResource(R.string.search_in_style),
            color = colorResource(id = R.color.light_gray),
            fontSize = 12.sp,
            fontFamily = fontFamily,
            modifier = Modifier.padding(6.dp,0.dp))

    }
}
@Composable
@Preview
fun HomeScreenPreview() {
    MainSearchBox()
}