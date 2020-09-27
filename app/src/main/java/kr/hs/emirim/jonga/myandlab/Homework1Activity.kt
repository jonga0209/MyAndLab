package kr.hs.emirim.jonga.myandlab

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_homework1_activiti.*

class Homework1Activity : AppCompatActivity() {
    lateinit var hButtonUrl : Button
    lateinit var hButtonToast : Button
    lateinit var hEditText: EditText
    lateinit var hCheckOreo: RadioButton
    lateinit var hCheckPie: RadioButton
    lateinit var hImgeview: ImageView
    lateinit var hRadioGroup: RadioGroup
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homework1_activiti)
        hButtonUrl = findViewById(R.id.buttonUrl)
        hButtonToast = findViewById(R.id.buttonToast)
        hEditText = findViewById(R.id.editText1)
        hCheckOreo = findViewById(R.id.checkOreo)
        hCheckPie = findViewById(R.id.checkPie)
        hImgeview = findViewById(R.id.imageView)
        hRadioGroup = findViewById(R.id.radioGroup)

        hButtonUrl.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(hEditText.text.toString())))
        }
        hButtonToast.setOnClickListener {
            val text = hEditText.text.toString()
            Toast.makeText(this, text,text.length).show()
        }
        
        hRadioGroup.setOnCheckedChangeListener { group, checkedId ->
            if(checkedId == hCheckOreo.id){
                hImgeview.setImageResource(R.drawable.oreo)
            }else{
                hImgeview.setImageResource(R.drawable.pie)
            }
        }
        
//        hCheckOreo.setOnClickListener {
//            hImgeview.setImageResource(R.drawable.oreo)
//        }
//        hCheckOreo.setOnClickListener {
//            hImgeview.setImageResource(R.drawable.pie)
//        }
    }
}
