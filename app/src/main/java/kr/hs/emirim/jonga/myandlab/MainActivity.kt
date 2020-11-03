package kr.hs.emirim.jonga.myandlab

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kr.hs.emirim.jonga.myandlab.ch04widget.BasicWidgetActivity
import kr.hs.emirim.jonga.myandlab.ch04widget.CalActivity

class MainActivity : AppCompatActivity(), View.OnClickListener {

    lateinit var mButton1 : Button
    lateinit var mButton2 : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mButton1 = findViewById(R.id.button1)
        mButton2 = findViewById(R.id.button2)

        mButton1.setOnClickListener {
            //Intent intent = new Intent(this, MainActivity.class);
            startActivity(Intent(this, FourbuttonActivity::class.java))
        }

        mButton2.setOnClickListener {
            startActivity(Intent(this, Fourbutton2Activity::class.java))
        }

        findViewById<Button>(R.id.button3).setOnClickListener {
            startActivity(Intent(this, CalActivity::class.java))
        }

    }

    override fun onClick(v: View?) {
        var intent = Intent()
        when(v?.id) {
            R.id.button1 -> intent = Intent(this, FourbuttonActivity::class.java)
            R.id.button2 -> intent = Intent(this, Fourbutton2Activity::class.java)
            R.id.button3 -> intent = Intent(this, CalActivity::class.java)
            R.id.button4 -> intent = Intent(this, BasicWidgetActivity::class.java)
        }
    }
}