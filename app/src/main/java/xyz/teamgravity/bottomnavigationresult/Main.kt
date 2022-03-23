package xyz.teamgravity.bottomnavigationresult

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import xyz.teamgravity.bottomnavigationresult.ui.theme.BottomNavigationResultTheme

class Main : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BottomNavigationResultTheme {
            }
        }
    }
}