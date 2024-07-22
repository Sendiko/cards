package com.sendiko.variouscard.outline

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
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
 * Sendiko's custom composable that displays an outlined card with optional icon, title, and text body.
 *
 * @param modifier Modifier to be applied to the card.
 * @param onClick Callback to be invoked when the card is clicked.
 * @param icon An optional composable to display an icon.
 * @param title An optional title to display.
 * @param textBody An optional text body to display.
 * @param colors Custom colors for the card. Defaults to [OutlinedMenuCardColors].
 *
 * @author Sendiko
 */
@Composable
fun OutlinedMenuCard(
    modifier: Modifier = Modifier,
    onClick: () -> Unit,
    icon: @Composable (() -> Unit)? = null,
    title: String? = null,
    textBody: String? = null,
    colors: OutlinedMenuCardColors = OutlinedMenuCardColors()
) {
    Surface(
        modifier = modifier,
        onClick = onClick,
        color = colors.surfaceColor?: MaterialTheme.colorScheme.surface,
        shape = RoundedCornerShape(16.dp),
        border = BorderStroke(width = 1.dp, color = colors.outlineColor?: MaterialTheme.colorScheme.outline)
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
                    color = colors.contentColor?: MaterialTheme.colorScheme.onSurface
                )
            }
            if (textBody != null) {
                Text(
                    text = textBody,
                    modifier = Modifier.fillMaxWidth(),
                    color = colors.contentColor?: MaterialTheme.colorScheme.onSurface
                )
            }
        }
    }
}