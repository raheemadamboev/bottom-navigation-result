package xyz.teamgravity.bottomnavigationresult.presentation.screen

import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.ramcosta.composedestinations.DestinationsNavHost
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.navigation.navigateTo
import xyz.teamgravity.bottomnavigationresult.presentation.component.BottomBar
import xyz.teamgravity.bottomnavigationresult.presentation.navigation.Navigation

@Destination(navGraph = Navigation.GRAPH_BOTTOM_NAVIGATION)
@Composable
fun MainScreen() {
    val controller = rememberNavController()
    val destination: xyz.teamgravity.bottomnavigationresult.presentation.screen.destinations.Destination? =
        controller.currentBackStackEntryAsState().value?.navDestination

    Scaffold(
        bottomBar = {
            BottomBar(
                currentDestination = destination,
                onDestinationChange = {
                    controller.navigateTo(it) {
                        launchSingleTop = true
                    }
                }
            )
        }
    ) {
        DestinationsNavHost(
            navController = controller,
            navGraph = NavGraphs.bottomNavigation
        )
    }
}