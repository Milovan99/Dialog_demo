package com.milovanjakovljevic.dialogdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            val myDialog = MyDialog()
            myDialog.show(supportFragmentManager, "123")
            // This calls onCreateDialog
            // Don't worry about the strange looking 123
            // We will find out about this in chapter 18
        }
    }
}