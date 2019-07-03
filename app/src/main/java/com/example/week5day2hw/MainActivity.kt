package com.example.week5day2hw

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }


    fun onClick(view : View) {
        when (view.id){
            R.id.btnSubmit -> {
                val firstName  = etFirstName.text.toString()
                val lastName  = etLastName.text.toString()
                val address  = etAddress.text.toString()
                val city = etCity.text.toString()
                val state = etState.text.toString()
                val zip = etZip.text.toString().toString()

                var person = Person(firstName,lastName, address, city,state,zip)

                firstDisplay.text = person.firstName
                lastDisplay.text = person.lastName
                addressDisplay.text = person.address
                cityDisplay.text = person.city
                stateDisplay.text = person.state
                zipDisplay.text = person.zip

            }
        }
    }




}
