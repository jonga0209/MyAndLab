package kr.hs.emirim.jonga.myandlab.ch04widget


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import kotlinx.android.synthetic.main.activity_basic_widget.view.*
import kr.hs.emirim.jonga.myandlab.R

class BasicWidgetActivity : AppCompatActivity(), CompoundButton.OnCheckedChangeListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_basic_widget)

        findViewById<CheckBox>(R.id.checkBox).setOnCheckedChangeListener(this)
        findViewById<CheckBox>(R.id.checkBox2).setOnCheckedChangeListener(this)
        findViewById<CheckBox>(R.id.checkBox3).setOnCheckedChangeListener(this)
        findViewById<ToggleButton>(R.id.toggleButton).setOnCheckedChangeListener(this)
        findViewById<Switch>(R.id.switch1).setOnCheckedChangeListener(this)

    }

    override fun onCheckedChanged(buttonView: CompoundButton, isChecked: Boolean) {
        Toast.makeText(this,
            buttonView.text.toString()+isChecked, Toast.LENGTH_SHORT).show()
//        when(buttonView.id){
//            R.id.checkBox->
//        }
    }
}