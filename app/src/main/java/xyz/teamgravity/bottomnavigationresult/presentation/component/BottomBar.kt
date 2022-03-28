package xyz.teamgravity.bottomnavigationresult.presentation.component

import androidx.annotation.StringRes
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Home
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import com.ramcosta.composedestinations.spec.DirectionDestinationSpec
import xyz.teamgravity.bottomnavigationresult.R
import xyz.teamgravity.bottomnavigationresult.presentation.screen.destinations.Destination
import xyz.teamgravity.bottomnavigationresult.presentation.screen.destinations.FeedScreenDestination
import xyz.teamgravity.bottomnavigationresult.presentation.screen.destinations.GreetingScreenDestination

@Composable
fun BottomBar(
    currentDestination: Destination?,
    onDestinationChange: (direction: DirectionDestinationSpec) -> Unit
) {
    BottomNavigation {
        BottomBarDestination.values().forEach { destination ->
            BottomNavigationItem(
                selected = currentDestination == destination.direction,
                onClick = { onDestinationChange(destination.direction) },
                icon = { Icon(destination.icon, contentDescription = stringResource(destination.label)) },
                label = { Text(stringResource(destination.label)) },
            )
        }
    }
}

enum class BottomBarDestination(
    val direction: DirectionDestinationSpec,
    val icon: ImageVector,
    @StringRes val label: Int
) {
    Greeting(GreetingScreenDestination, Icons.Default.Home, R.string.greeting_screen),
    Feed(FeedScreenDestination, Icons.Default.Email, R.string.feed_screen),
}