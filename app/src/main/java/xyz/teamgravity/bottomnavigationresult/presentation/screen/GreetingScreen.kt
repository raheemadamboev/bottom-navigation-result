package xyz.teamgravity.bottomnavigationresult.presentation.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator
import com.ramcosta.composedestinations.result.ResultRecipient
import xyz.teamgravity.bottomnavigationresult.R
import xyz.teamgravity.bottomnavigationresult.presentation.navigation.Navigation
import xyz.teamgravity.bottomnavigationresult.presentation.screen.destinations.ProfileScreenDestination

@Destination(
    navGraph = Navigation.GRAPH_BOTTOM_NAVIGATION,
    start = true
)
@Composable
fun GreetingScreen(
    navigator: DestinationsNavigator,
    result: ResultRecipient<ProfileScreenDestination, Int>
) {
    var data by remember { mutableStateOf(0) }

    result.onResult { data = it }

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = stringResource(id = R.string.greeting_screen))
        Button(onClick = { navigator.navigate(ProfileScreenDestination) }) {
            Text(text = "Let's go Profile screen")
        }
        Text(text = "Our result is $data")
    }
}