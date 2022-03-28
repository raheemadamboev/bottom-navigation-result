package xyz.teamgravity.bottomnavigationresult.presentation.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.result.ResultBackNavigator
import xyz.teamgravity.bottomnavigationresult.presentation.navigation.Navigation

@Destination(navGraph = Navigation.GRAPH_BOTTOM_NAVIGATION)
@Composable
fun ProfileScreen(
    navigator: ResultBackNavigator<Int>
) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "Profile")
        Button(onClick = { navigator.navigateBack(1) }) {
            Text(text = "1")
        }
        Button(onClick = { navigator.navigateBack(2) }) {
            Text(text = "2")
        }
    }
}
