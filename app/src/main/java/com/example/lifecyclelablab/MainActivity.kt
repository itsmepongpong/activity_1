package com.example.lifecyclelablab

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

class MainActivity : ComponentActivity() {

    companion object {
        private const val TAG = "LifecycleLab"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "MainActivity - onCreate")

        setContent {
            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Text("Main Activity")

                Button(
                    onClick = {
                        startActivity(
                            Intent(this@MainActivity, SecondActivity::class.java)
                        )
                    }
                ) {
                    Text("Open Second Activity")
                }
            }
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "MainActivity - onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "MainActivity - onResume")
    }

    override fun onPause() {
        Log.d(TAG, "MainActivity - onPause")
        super.onPause()
    }

    override fun onStop() {
        Log.d(TAG, "MainActivity - onStop")
        super.onStop()
    }

    override fun onDestroy() {
        Log.d(TAG, "MainActivity - onDestroy")
        super.onDestroy()
    }
}