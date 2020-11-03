package kr.hs.emirim.jonga.myandlab.ch04widget

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kr.hs.emirim.jonga.myandlab.R
import java.lang.NullPointerException


class CalActivity : AppCompatActivity(), View.OnClickListener{
    var TAG = "심플계산기"
    lateinit var edit1 : EditText
    lateinit var edit2 : EditText
    lateinit var textR : TextView
    lateinit var buttonP : Button
    lateinit var buttonM : Button
    lateinit var buttonMu : Button
    lateinit var buttonD : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cal)

        title = "초간단 계산기"
        edit1 = findViewById(R.id.editTextNumber1)
        edit2 = findViewById(R.id.editTextNumber2)
        textR = findViewById(R.id.tvResult)

        edit1.setText(R.string.app_name)
        edit1.setText("0")
        edit2.setText("0")

        findViewById<Button>(R.id.button_01).setOnClickListener{
            try {
                textR.text = (Integer.parseInt(edit1.text.toString()) + Integer.parseInt(edit2.text.toString())).toString()
            }catch (e: NullPointerException) {
                Toast.makeText(this, "숫자 입력", Toast.LENGTH_SHORT).show()
            }
            catch (e:Exception){
                Toast.makeText(this, "숫자를 입력해주세요~", Toast.LENGTH_SHORT).show()
                Log.e(TAG, "에러 : " + e.stackTrace)
            }
        }

        findViewById<Button>(R.id.button_02).setOnClickListener{
            try {
                textR.text = (Integer.parseInt(edit1.text.toString()) - Integer.parseInt(edit2.text.toString())).toString()
            }catch (e: NullPointerException) {
                Toast.makeText(this, "숫자 입력", Toast.LENGTH_SHORT).show()
            }
            catch (e:Exception){
                Toast.makeText(this, "숫자를 입력해주세요~", Toast.LENGTH_SHORT).show()
                Log.e(TAG, "에러 : " + e.stackTrace)
            }
        }
    }

    override fun onClick(v: View?) {
        TODO("Not yet implemented")
    }
}