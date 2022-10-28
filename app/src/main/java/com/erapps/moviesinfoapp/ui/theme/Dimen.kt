package com.erapps.moviesinfoapp.ui.theme

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

data class Dimen(

    //widgets dimensions
    val default: Dp = 0.dp,
    val extraSmall: Dp = 4.dp,
    val small: Dp = 8.dp,
    val medium: Dp = 16.dp,
    val large: Dp = 32.dp,
    val extraLarge: Dp = 64.dp,
    val extraExtraLarge: Dp = 128.dp,
    //text size
    val textSmall: Dp = 12.dp,
    val textMedium: Dp = 20.dp,
    val textLarge: Dp = 28.dp,
    val textExtraLarge: Dp = 36.dp,
    //border and elevation
    val borderThing: Dp = 1.dp,
    val borderMedium: Dp = 4.dp,
    val elevationDefault: Dp = 1.dp,
    val elevationNormal: Dp = 4.dp,
    //rounder corner shapes
    val roundedMedium: Dp = 10.dp,
    //images
    val imageDefault: Dp = 24.dp,
    val imageSmall: Dp = 32.dp,
    val imageLarge: Dp = 96.dp
)

val LocalDimen = compositionLocalOf { Dimen() }

val MaterialTheme.dimen: Dimen
    @Composable
    @ReadOnlyComposable
    get() = LocalDimen.current