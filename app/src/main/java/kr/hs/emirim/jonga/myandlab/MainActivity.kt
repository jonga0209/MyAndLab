package kr.hs.emirim.jonga.myandlab

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView


class MainActivity : AppCompatActivity() {

    lateinit var mButton1 : Button
    lateinit var mButton2 : Button
    lateinit var mProfile : ImageView
    lateinit var mButton3 : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mProfile = findViewById(R.id.profile)
        mButton1 = findViewById(R.id.button1)
        mButton2 = findViewById(R.id.button2)
        mButton3 = findViewById(R.id.button3)

        mButton1.setOnClickListener {
            startActivity(Intent(this, FourbuttonActivity::class.java))
        }
        mButton2.setOnClickListener {
            startActivity(Intent(this, Fourbutton2Activity::class.java))
        }
        mButton3.setOnClickListener {
            startActivity(Intent(this, Homework1Activity::class.java))
        }
    }
}