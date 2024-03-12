package ua.edu.lntu.cw_cr2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ua.edu.lntu.cw_cr2.ui.theme.IPZ_CW_CR2_Syshchuk_VladislavTheme
import java.net.PasswordAuthentication

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
    var currentState by remember { mutableStateOf(1) }
    var emailValue by remember { mutableStateOf("") }
    var passworValue by remember { mutableStateOf("") }
    when (currentState) {
        1 ->Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally

        ) {
            Text(
                text = "Sign In",
                fontSize = 30.sp,
            )
            TextField(
                value = emailValue,
                onValueChange = { newText -> emailValue = newText }
            )
            Spacer(modifier = Modifier.height(10.dp))
            TextField(
                value = passworValue,
                onValueChange = { newText -> passworValue = newText },
            )
            Button(
                onClick = { if ( (emailValue != "") && passworValue != ""){
                    currentState = 2
                } }) {
                Text(text = "Sign In")
            }
        }

        2 -> Column {
            Text(
                text = "Sign In success",
                fontSize = 30.sp,
            )
            Text(
                text = emailValue,
                fontSize = 30.sp,
            )
            Button(
                onClick = { currentState = 1 }) {
                Text(text = "sign out")
            }
        }
    }


}
