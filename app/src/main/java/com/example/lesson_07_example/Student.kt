package com.example.lesson_07_example

import java.io.Serializable

class Student : Serializable{
    var id:String? = null
    var fullName:String? = null
    var schoolEmail:String? = null
    var personalEmail:String? = null
    var termAddress:String? = null
    var course:String? = null
    constructor(){
        id = "default"
        fullName = "default"
        schoolEmail = "default"
        personalEmail = "default"
        termAddress = "default"
        course = "default"
    }
}