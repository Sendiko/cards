package com.sendiko.variouscard.elevated

import androidx.compose.ui.graphics.Color

/**
 * Holds color information for an elevated menu card.
 *
 * @param surfaceColor The background color of the card.
 * @param contentColor The color of the text and icons within the card.
 *
 * @author Sendiko
 */
data class ElevatedMenuCardColors(
    val surfaceColor: Color? = null,
    val contentColor: Color? = null,
)
