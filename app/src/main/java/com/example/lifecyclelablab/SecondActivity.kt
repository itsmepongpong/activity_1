package com.example.lifecyclelablab

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

class SecondActivity : ComponentActivity() {

    companion object {
        private const val TAG = "LifecycleLab"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "SecondActivity - onCreate")

        setContent {
            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Text("Second Activity")
            }
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "SecondActivity - onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "SecondActivity - onResume")
    }

    override fun onPause() {
        Log.d(TAG, "SecondActivity - onPause")
        super.onPause()
    }

    override fun onStop() {
        Log.d(TAG, "SecondActivity - onStop")
        super.onStop()
    }

    override fun onDestroy() {
        Log.d(TAG, "SecondActivity - onDestroy")
        super.onDestroy()
    }
}