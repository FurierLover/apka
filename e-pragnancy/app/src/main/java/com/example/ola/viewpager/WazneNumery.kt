package com.example.ola.viewpager

import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.support.v7.app.AppCompatActivity
import android.widget.TextView
import android.content.Context
import android.widget.ImageView
import android.widget.Toast
import kotlinx.android.synthetic.main.important_numbers.*
import java.util.jar.Attributes

class WazneNumery : Fragment(){


    private var EMPTY = "";
    private var ERROR_INPUT_EMPTY = "Please fill all fields";
    private var SAVED = "Saved!";
    private var myPreferences = "myPrefs"
    private var NAME = "name";
    private var PHONE_NUMBER = "phoneNumber";


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?):
            View? {

        val view = inflater.inflate(R.layout.important_numbers, container, false)



        return view
    }


        override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
            super.onViewCreated(view, savedInstanceState)
            val sharedPreferences = this.activity!!.getSharedPreferences(myPreferences, Context.MODE_PRIVATE)


                //If the user details are not saved previously then display the form
               // setContentView(R.layout.moja_ciaza)

            add_number.setOnClickListener {
                    //If the user has left any fields empty, show Toast message
                    if (type_name.text.toString() == EMPTY
                        || type_number.text.toString() == EMPTY
                    ) {
                        Toast.makeText(this.context, ERROR_INPUT_EMPTY, Toast.LENGTH_LONG).show()

                    } else {
                        //If all fields are filled then fetch the data and
                        // save the data in Shared Preferences
                        val editor = sharedPreferences.edit()
                        editor.putString(NAME, type_name.text.toString())
                        editor.putString(PHONE_NUMBER, type_number.text.toString())
                        editor.apply()

                        //Clear the text boxes and show Toast message
                        type_name.setText(EMPTY)
                        type_number.setText(EMPTY)
                        Toast.makeText(this.context,SAVED, Toast.LENGTH_LONG).show()
                        (this.activity as MainActivity).changeCurrentItem(1)

                        val name=sharedPreferences.getString(NAME,"")
                        val phoneNumber = sharedPreferences.getString(PHONE_NUMBER, EMPTY)
                        display.text= name+phoneNumber

                    }
                }



        }
    }







