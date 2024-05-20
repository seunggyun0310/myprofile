package com.example.it_study

import android.os.Bundle
import android.view.View
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.it_study.ui.theme.IT_studyTheme
import android.widget.TextView
import android.widget.Button
import android.widget.EditText


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.textView2)
        val button1 = findViewById<Button>(R.id.button2)
        val button2 = findViewById<Button>(R.id.button7)
        val editText1 = findViewById<EditText>(R.id.ID)


        val button = findViewById<Button>(R.id.button2)
        button.setOnClickListener {
            // 버튼이 클릭되었을 때 수행할 동작을 여기에 작성합니다.
            // 예를 들어, 로그인 화면으로 이동하는 등의 동작을 수행할 수 있습니다.
        }

        button2.setOnClickListener {
        }

    }
}
/*  setContent {
      IT_studyTheme {
          // A surface container using the 'background' color from the theme
          Surface(
              modifier = Modifier.fillMaxSize(),
              color = MaterialTheme.colorScheme.background
          ) {
              // Displaying UI elements using Composable functions
              Column(
                  modifier = Modifier.fillMaxSize(),
                  verticalArrangement = Arrangement.Center,
                  horizontalAlignment = Alignment.CenterHorizontally
              ) {
                  Greeting("IT study")
                  // Adding a clickable login button using the LoginButton Composable function
                  LoginButton(onClick = { /* handle login button click */ })
              }
          }
      }
  }
}
}

// Composable function to display greeting text
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
Text(
  text = "Hello $name!",
  modifier = modifier
)
}

// Composable function to display clickable login button
@Composable
fun LoginButton(onClick: () -> Unit) {
Button(
  onClick = onClick,
  modifier = Modifier.padding(16.dp),
  // Add padding for spacing
) {
  Text(text = "로그인")
}
}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
IT_studyTheme {
  Greeting("Android")
}
}
*/