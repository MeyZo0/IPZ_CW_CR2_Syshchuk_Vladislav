package ua.edu.lntu.cw_cr2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import ua.edu.lntu.cw_cr2.ui.theme.IPZ_CW_CR2_Syshchuk_VladislavTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            IPZ_CW_CR2_Syshchuk_VladislavTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    MainWindow()
                }
            }
        }
    }
}

@Composable
fun MainWindow(modifier: Modifier = Modifier) {
    Column {
        Text(
            text = "Sing in",
            fontSize = 30.sp,
            modifier = modifier
        )

        TextField(value = "email", onValueChange = {})
        TextField(value = "Password", onValueChange = {})
        Button(
            onClick = { /* ... */ }
        ) {
            Text("sign in")
        }
    }

}