package com.codewithandro.gmailrecyclerview

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class gmailContent : AppCompatActivity() {


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_gmail_content)

        //resive data
        val username = intent.getStringExtra("userName")
        val gmailTitle = intent.getStringExtra("gmailTitle")
        val gmCont = intent.getStringExtra("gmCon")
        val userImg = intent.getIntExtra("userImg",R.drawable.i12)



        //featch the view
        val userN  = findViewById<TextView>(R.id.tvShow)
        val gmailT = findViewById<TextView>(R.id.gmailTitle)
        val tvImg = findViewById<ImageView>(R.id.imgShow)
        val gmailContentId = findViewById<TextView>(R.id.gt)

        userN.text = username
        gmailT.text = gmailTitle
        gmailContentId.text = gmCont
        tvImg.setImageResource(userImg)










    }
}