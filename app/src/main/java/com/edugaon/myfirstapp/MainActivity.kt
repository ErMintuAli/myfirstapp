package com.edugaon.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity(),SetOnClickStudent {
    lateinit var listView: ListView
    val StuList = arrayListOf<StudentModel>()

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        StuList.add(StudentModel("Mintu", "aunishahmed3583@gmial.com",6201689439))
        StuList.add(StudentModel("Mintu", "aunishahmed3583@gmial.com",6201689439))
        StuList.add(StudentModel("Mintu", "aunishahmed3583@gmial.com",6201689439))
        StuList.add(StudentModel("Mintu", "aunishahmed3583@gmial.com",6201689439))
        listView=findViewById(R.id.list)

        listView.adapter=StudentsAdapter(StuList,this)


    }

    override fun onStudentItemClick(position: Int, student: StudentModel) {
        StuList.add(StudentModel("Mintu", "aunishahmed3583@gmial.com",6201689439))

        Toast.makeText(this, "${student.name}", Toast.LENGTH_SHORT).show()
    }

    override fun SetOnClickStudent(position: Int,student: StudentModel){

    }
}