package com.sendiko.variouscard.selectable

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

/**
 * Sendiko's custom composable that displays a selectable card with optional icon, title, and text body.
 *
 * @param modifier Modifier to be applied to the card.
 * @param onClick Callback to be invoked when the card is clicked.
 * @param icon An optional composable to display an icon.
 * @param title An optional title to display.
 * @param textBody An optional text body to display.
 * @param isSelected Whether the card is currently selected.
 * @param colors Custom colors for the card in selected and unselected states. Defaults to [SelectableMenuCardColors].
 *
 * @author Sendiko
 */
@Composable
fun SelectableMenuCard(
    modifier: Modifier = Modifier,
    onClick: () -> Unit,
    icon: @Composable (() -> Unit)? = null,
    title: String? = null,
    textBody: String? = null,
    isSelected: Boolean,
    colors: SelectableMenuCardColors = SelectableMenuCardColors()
) {
    val outlineColor = when {
        isSelected -> colors.selectedOutlineColor
            ?: MaterialTheme.colorScheme.primary

        else -> colors.unselectedOutlineColor
            ?: MaterialTheme.colorScheme.outline
    }

    val contentColor = when {
        isSelected -> colors.selectedContentColor
            ?: MaterialTheme.colorScheme.onPrimaryContainer

        else -> colors.unselectedContentColor
            ?: MaterialTheme.colorScheme.onSurface
    }

    val surfaceColor = when {
        isSelected -> colors.selectedSurfaceColor
            ?: MaterialTheme.colorScheme.primaryContainer

        else -> colors.unselectedSurfaceColor
            ?: MaterialTheme.colorScheme.surface
    }

    Surface(
        modifier = modifier,
        onClick = onClick,
        shape = RoundedCornerShape(16.dp),
        border = BorderStroke(
            width = 1.dp,
            color = outlineColor
        ),
        color = surfaceColor
    ) {

        Column(
            modifier = Modifier.padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            if (icon != null) {
                icon()
            }
            if (title != null) {
                Text(
                    text = title,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.fillMaxWidth(),
                    color = contentColor
                )
            }
            if (textBody != null) {
                Text(
                    text = textBody,
                    modifier = Modifier.fillMaxWidth(),
                    color = contentColor
                )
            }
        }
    }
}