package co.app.testapp1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import co.app.testapp1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var binding: ActivityMainBinding? = null
    var result:Double = 0.0
    var inputOne: String = ""
    var inputTwo: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        init()
    }

    fun init(){
        binding!!.additionBtn.setOnClickListener {
            inputOne =  binding!!.inputOneEdit.text.toString()
            inputTwo =  binding!!.inputTwoEdit.text.toString()
            binding!!.inputOne.text = "Input one - "+binding!!.inputOneEdit.text
            binding!!.inputTwo.text = "Input two - "+binding!!.inputTwoEdit.text
            binding!!.inputAction.text = "Action - Addition"
            if(binding!!.inputOneEdit.text.toString()!="" &&  binding!!.inputTwoEdit.text.toString()!=""){
                addition()
            }else{
                Toast.makeText(this, "Please enter input", Toast.LENGTH_SHORT).show()
            }
            binding!!.output.text = "Output is - "+result
        }

        binding!!.subtractionBtn.setOnClickListener {
            inputOne =  binding!!.inputOne.text.toString()
            inputTwo =  binding!!.inputTwo.text.toString()
            binding!!.inputOne.text = "Input one - "+binding!!.inputOneEdit.text
            binding!!.inputTwo.text = "Input two - "+binding!!.inputTwoEdit.text
            binding!!.inputAction.text = "Action - Subtraction"
            if(binding!!.inputOneEdit.text.toString()!="" &&  binding!!.inputTwoEdit.text.toString()!="") {
                subtraction()
            }else{
                Toast.makeText(this, "Please enter input", Toast.LENGTH_SHORT).show()
            }
            binding!!.output.text = "Output is - "+result
        }
    }

    fun addition(){
        result = inputOne.toDouble() + inputTwo.toDouble()
    }

    fun subtraction(){
        result = inputOne.toDouble() - inputTwo.toDouble()
    }



}