package com.alikamran.shop.screens.font

import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.googlefonts.Font
import androidx.compose.ui.text.googlefonts.GoogleFont
import com.alikamran.shop.R
import com.alikamran.shop.screens.font.FontFamily.TextDownloadableFontsSnippet3.TextDownloadableFontsSnippet1.provider

class FontFamily {
    public object TextDownloadableFontsSnippet3 {


        val fontName = GoogleFont("Lobster Two")
        public object TextDownloadableFontsSnippet1 {
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
}