package xyz.teamgravity.bottomnavigationresult.presentation.screen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.ramcosta.composedestinations.annotation.Destination
import xyz.teamgravity.bottomnavigationresult.R
import xyz.teamgravity.bottomnavigationresult.presentation.navigation.Navigation

@Destination(navGraph = Navigation.GRAPH_BOTTOM_NAVIGATION)
@Composable
fun FeedScreen() {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier.fillMaxSize()
    ) {
        Text(text = stringResource(id = R.string.feed_screen))
    }
}