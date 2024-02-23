package com.example.catalogapp.presentation.theme

import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color

/**
 * USED COLORS FROM UX
 *
 * TextPrimary: #101010
 * TextSecondary: #6C6C6C (used for unselected things, secondary text, text on background or text on surface)
 * TextButton: #1265C2
 * TextError: #E02C2C
 * BackIcon: #1265C2
 * PaymentChip: #E4E4E4
 * BottomNavSelected: #004BA0
 * ComponentOnScreen: #FFFFFF (Surface candidate)
 * Spaces: #EFEFEF (Background candidate)
 * ChipOutline: #6C6C6C
 * SelectedChipBackground: #6C6C6C
 * TextOnSelectedChip: #FFFFFF
 * UnselectedChipBackground: #FFFFFF
 * TextOnUnselectedChip: #101010
 * ListDivider: #E4E4E4 (#EFEFEF would be a better variant as we have the divider with a 90dp padding and the background is #EFEFEF)
 * TextInputBackground: #EFEFEF
 */

/**
 * USED COMPONENTS
 *
 * Menu item for navigation (My Account) NOTE: make it support a leading icon for app details
 * Top app bar with back navigation icon, text button, menu and title
 * Payment / Subscription indicator
 * Rating info
 * App type info
 * App list item
 * App type chip
 */

/**
 * THINGS THAT ARE PRESENT IN TOYSTORE
 *
 * @ Top app bar with title, left nav icon and right menu or action
 * @ Bottom nav bar
 * Pager with multiple tabs (info-review or check face it 2)
 * @ Line nav bar with left icon and label (should have option to be disabled)
 * @ Modal bottom sheet
 * @ Text input
 * @ Text on a surface and on plain background
 * @ App list item
 * @ Outlined chips
 * @ Outlined buttons
 * @ Primary button
 * @ Circular Progress indicator
 */

internal val LightColorScheme = lightColorScheme(
    primary = Color(0xFF1265C2), // Buttons, Tabs,
    onPrimary = Color(0xFFFFFFFF),

//    primaryContainer = Color.Red,
//    onPrimaryContainer = Color.Red,

//    inversePrimary = Color.Red,

//    secondary = Color.Red,
//    onSecondary = Color.Red,

    secondaryContainer = Color(0xFF6C6C6C), // Filter Chip
    onSecondaryContainer = Color(0xFFFFFFFF),

//    tertiary = Color.Red,
//    onTertiary = Color.Red,

//    tertiaryContainer = Color.Red,
//    onTertiaryContainer = Color.Red,

    background = Color(0xFFEFEFEF),
    onBackground = Color(0xFF6C6C6C),

    surface = Color(0xFFFFFFFF),
    onSurface = Color(0xFF000000),

    surfaceVariant = Color(0xFFE4E4E4), // Card, Text Field background,
    onSurfaceVariant = Color(0xFF101010),

    surfaceTint = Color(0xFFFFFFFF), // Bottom Navigation Bar background

//    inverseSurface = Color.Red,
//    inverseOnSurface = Color.Red,

//    error = Color.Red,
//    onError = Color.Red,

//    errorContainer = Color.Red,
//    onErrorContainer = Color.Red,

    outline = Color(0xFF6C6C6C), // Chip and switch outline
    outlineVariant = Color(0xFFFFFFFF), // Divider

    scrim = Color(0xFF101010) // Modal Bottom Sheet behind background
)

internal val DarkColorScheme = darkColorScheme(
    primary = Color(0xFF3B97F3), // Buttons, Tabs,
    onPrimary = Color(0xFFFFFFFF),

//    primaryContainer = Color.Red,
//    onPrimaryContainer = Color.Red,

//    inversePrimary = Color.Red,

//    secondary = Color.Red,
//    onSecondary = Color.Red,

    secondaryContainer = Color(0xFFA6A6A6), // Filter Chip
    onSecondaryContainer = Color(0xFFF4F4F4),

//    tertiary = Color.Red,
//    onTertiary = Color.Red,

//    tertiaryContainer = Color.Red,
//    onTertiaryContainer = Color.Red,

    background = Color(0xFF101010),
    onBackground = Color(0xFFA6A6A6),

    surface = Color(0xFF252525),
    onSurface = Color(0xFFF4F4F4),

    surfaceVariant = Color(0xFF6C6C6C), // Card, Text Field background,
    onSurfaceVariant = Color(0xFFF4F4F4),

    surfaceTint = Color(0xFF000000), // Bottom Navigation Bar background

//    inverseSurface = Color.Red,
//    inverseOnSurface = Color.Red,

//    error = Color.Red,
//    onError = Color.Red,

//    errorContainer = Color.Red,
//    onErrorContainer = Color.Red,

    outline = Color(0xFFA6A6A6), // Chip and switch outline
    outlineVariant = Color(0xFF252525), // Divider

    scrim = Color(0xFF101010) // Modal Bottom Sheet behind background
)
