package com.example.lesson_07_example

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.io.Serializable

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // this is the button of dry button
        btnDry.setOnClickListener{
            dry()// dry function
        }
        // this is the button of standard
        btnStandard.setOnClickListener{
            standard() // starndard function
        }
        // this is button of selecet
        btnSelection.setOnClickListener{
            select() // this is the select function
        }
    }

    fun dry(){
        //this code here allow me to pass to the result activity
        var intent:Intent = Intent(this,
            ResultActivity::class.java)
        startActivity(intent)
    }
    fun standard(){
        //this code here allow me to pass to the result activity
        var intent:Intent = Intent(this,
            ResultActivity::class.java)
        intent.putExtra("standard", "This is the default"+
                "message.")
        startActivity(intent)
    }
    fun select(){
        var intent:Intent = Intent(this, ResultActivity::class.java)
        var input:String = txtInput.text.toString()
        intent.putExtra("standard", input)
        startActivity(intent)
    }

    fun passObject(){
        var student:ParcelStudent = ParcelStudent()
        student.id = "101"
        student.fullName = "TestStudent"
        student.personalEmail = "test@test.com"
        student.schoolEmail = "testStudent@school.com"
        student.course = "testing"

        var intent:Intent = Intent(this,
            ResultActivity::class.java)
        intent.putExtra("student", student)//parcelable
        //intent.putExtra("student", student as Serializable) //Serializable
        startActivity(intent)
    }

    fun makeToastSimple(){
        Toast.makeText(this, "Message",
            Toast.LENGTH_LONG).show()
    }
}
