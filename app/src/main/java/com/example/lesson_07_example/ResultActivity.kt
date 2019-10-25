package com.example.lesson_07_example

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        var passedVariable = intent.getStringExtra("standard")
        txtResult.text = passedVariable

        var student:ParcelStudent = intent.
            getParcelableExtra<ParcelStudent>("student")

        txtResult.text = passedVariable + student.id +
                student.fullName
    }
}