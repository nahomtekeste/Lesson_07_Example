package com.example.lesson_07_example

import android.os.Parcel
import android.os.Parcelable
import java.io.Serializable

class ParcelStudent() : Parcelable {
    var id:String? = null
    var fullName:String? = null
    var schoolEmail:String? = null
    var personalEmail:String? = null
    var termAddress:String? = null
    var course:String? = null

    constructor(parcel: Parcel) : this() {
        id = parcel.readString()
        fullName = parcel.readString()
        schoolEmail = parcel.readString()
        personalEmail = parcel.readString()
        termAddress = parcel.readString()
        course = parcel.readString()
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(id)
        parcel.writeString(fullName)
        parcel.writeString(schoolEmail)
        parcel.writeString(personalEmail)
        parcel.writeString(termAddress)
        parcel.writeString(course)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<ParcelStudent> {
        override fun createFromParcel(parcel: Parcel): ParcelStudent {
            return ParcelStudent(parcel)
        }

        override fun newArray(size: Int): Array<ParcelStudent?> {
            return arrayOfNulls(size)
        }
    }
}