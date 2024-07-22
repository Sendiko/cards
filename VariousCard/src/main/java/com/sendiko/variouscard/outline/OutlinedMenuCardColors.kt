package com.sendiko.variouscard.outline

import androidx.compose.ui.graphics.Color

/**
 * Holds color information for an outlined menu card.
 *
 * @param surfaceColor The background color of the card.
 * @param outlineColor The color of the card's outline.
 * @param contentColor The color of the text and icons within the card.
 *
 * @author Sendiko
 */
data class OutlinedMenuCardColors(
    val surfaceColor: Color? = null,
    val outlineColor: Color? = null,
    val contentColor: Color? = null,
)