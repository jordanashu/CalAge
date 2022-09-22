package com.example.calage

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.DatePicker
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {

    lateinit var select:TextView
    lateinit var cal:Button
    lateinit var show:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        select=findViewById(R.id.textView)
        cal=findViewById(R.id.button)
        show=findViewById(R.id.textView2)

    }

    fun select(view: View) {
              var c= Calendar.getInstance()
              var cDay=c.get(Calendar.DAY_OF_MONTH)
              var cMonth=c.get(Calendar.MONTH)
              var cYear=c.get(Calendar.YEAR)
        val CalendarDialog=DatePicker(this,DatePickerDialog.OnDateSetListener
        { view,year,month,dayofMonth ->
            cDay=dayofMonth
            cMonth=month
            cYear=year
             
        })


    }


}