package xyz.teamgravity.bottomnavigationresult.presentation.activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import xyz.teamgravity.bottomnavigationresult.presentation.navigation.Navigation
import xyz.teamgravity.bottomnavigationresult.presentation.theme.BottomNavigationResultTheme

class Main : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BottomNavigationResultTheme {
                Navigation()
            }
        }
    }
}