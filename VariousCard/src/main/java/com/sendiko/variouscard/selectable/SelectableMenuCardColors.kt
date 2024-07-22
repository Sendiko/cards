package com.sendiko.variouscard.selectable

import androidx.compose.ui.graphics.Color

/**
 * Holds color information for a selectable menu card in both selected and unselected states.
 *
 * @param unselectedOutlineColor The outline color when the card is unselected.
 * @param selectedOutlineColor The outline color when the card is selected.
 * @param unselectedSurfaceColor The background color when the card is unselected.
 * @param selectedSurfaceColor The background color when the card is selected.
 * @param unselectedContentColor The color of the text and icons when the card is unselected.
 * @param selectedContentColor The color of the text and icons when the card is selected.
 */
data class SelectableMenuCardColors(
    val unselectedOutlineColor: Color? = null,
    val selectedOutlineColor: Color? = null,
    val unselectedSurfaceColor: Color? = null,
    val selectedSurfaceColor: Color? = null,
    val unselectedContentColor: Color? = null,
    val selectedContentColor: Color? = null,
)
