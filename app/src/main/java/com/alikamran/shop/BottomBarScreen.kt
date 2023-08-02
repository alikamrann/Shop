package com.alikamran.shop

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomBarScreen(
    val route: String,
    val title: String,
    val icon: ImageVector
) {
    object Home : BottomBarScreen(
        route = "home",
        title = "Home",
        icon = Icons.Default.Home,

        )

    // for report
    object Search : BottomBarScreen(
        route = "search",
        title = "Search",
        icon = Icons.Default.Search,

        )

    // for report
    object Cart : BottomBarScreen(
        route = "cart",
        title = "Cart",
        icon = Icons.Default.ShoppingCart,

        )

    object Favorite : BottomBarScreen(
        route = "favorite",
        title = "Favorite",
        icon = Icons.Default.Favorite,

        )

    object Profile : BottomBarScreen(
        route = "profile",
        title = "Profile",
        icon = Icons.Default.Person,

        )
}
