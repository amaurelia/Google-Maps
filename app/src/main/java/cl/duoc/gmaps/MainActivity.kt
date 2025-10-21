package cl.duoc.gmaps

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import cl.duoc.gmaps.ui.GoogleMaps
import cl.duoc.gmaps.ui.theme.GoogleMapsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            GoogleMapsTheme {
                GoogleMaps()
            }
        }
    }
}
