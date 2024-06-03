package com.edugaon.myfirstapp

import android.provider.ContactsContract.CommonDataKinds.Phone

data class StudentModel(
    val name:String ? = null,
    val email:String ? = null,
    val phone: Long ? = null,
)
