package com.example.ola.viewpager

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView


class MojaCiaza : Fragment() {

    private var container: Int = 0

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?):
            View? {

        val view = inflater.inflate(R.layout.moja_ciaza, container, false)
        val textView = view.findViewById<TextView>(R.id.txtMain)
        textView.setText(R.string.second_fragment)

        val imageView = view.findViewById<ImageView>(R.id.imgMain)
        imageView.setImageResource(R.mipmap.moja_ciaza)
        this.container = container!!.id

        return view
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val buttonLiczbaDni = view.findViewById(R.id.button_liczba_dni) as Button
        val addPhotoBtn = view.findViewById(R.id.dodaj_zdjecie) as Button
        val weightButton = view.findViewById(R.id.moja_waga) as Button
        val phonesButton = view.findViewById(R.id.telefony) as Button

        buttonLiczbaDni.setOnClickListener {
            val ac =  (this.activity as MainActivity)
            ac.changeCurrentItem(4)
        }

        addPhotoBtn.setOnClickListener {
            val ac =  (this.activity as MainActivity)
            ac.changeCurrentItem(4)
        }

        weightButton.setOnClickListener {
            val ac =  (this.activity as MainActivity)
            ac.changeCurrentItem(4)
        }

        phonesButton.setOnClickListener {
            val ac =  (this.activity as MainActivity)
            ac.changeCurrentItem(5)
        }


    }


}




