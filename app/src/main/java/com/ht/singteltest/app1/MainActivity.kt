package com.ht.singteltest.app1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupIntraction()
    }

    fun setupIntraction (){

        var submitBtn  = findViewById(R.id.submitButton) as Button;
        submitBtn.setOnClickListener {

            val app2PackageName = "com.ht.singteltest.sinteltestapp2"

            val pm = application.packageManager;
            val intent: Intent? = pm.getLaunchIntentForPackage(app2PackageName)
            intent?.addCategory(Intent.CATEGORY_LAUNCHER)
            if (intent != null) {
                applicationContext.startActivity(intent)
            }
        }

    }
}
