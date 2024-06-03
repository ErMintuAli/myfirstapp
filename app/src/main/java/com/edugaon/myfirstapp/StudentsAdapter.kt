package com.edugaon.myfirstapp

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class StudentsAdapter (val data:ArrayList<StudentModel>, val context: Context,/* Click Stpe 2 */ val setOnClickStudent: SetOnClickStudent):BaseAdapter(){
    override fun getCount(): Int {
        return data.size
    }

    override fun getItem(position: Int): Any {
        return data[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    @SuppressLint("MissingInflatedId")
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {


        val layout = LayoutInflater.from(context).inflate(R.layout.custom_list_item,parent,false)

        val nameTextView = layout.findViewById<TextView>(R.id.name)
        val emailTextView = layout.findViewById<TextView>(R.id.email)
        val phoneTextView = layout.findViewById<TextView>(R.id.phone)

        nameTextView.text = data[position].name
        emailTextView.text = data[position].email
        phoneTextView.text = data[position].phone.toString()


        // Click Step 3
        layout.setOnClickListener {
            setOnClickStudent.onStudentItemClick(position,data[position])
        }

        return layout
    }
}

// Click Step 1
interface SetOnClickStudent{
    fun onStudentItemClick(position: Int, student: StudentModel)
    fun onStudentDelete(position: Int,Student:StudentModel)
}