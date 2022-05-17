package org.pechblenda.helper_boy_view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)

		val button = findViewById<Button>(R.id.button)
		button.setOnClickListener {
			Log.d("INFORMATION", "hola ")
		}
	}

	fun onClick() {

	}

}