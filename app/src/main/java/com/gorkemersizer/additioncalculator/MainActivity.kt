package com.gorkemersizer.additioncalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.core.widget.addTextChangedListener
import androidx.core.widget.doOnTextChanged
import com.gorkemersizer.additioncalculator.databinding.ActivityMainBinding
import java.lang.Exception
import kotlin.reflect.typeOf

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var numList = ArrayList<String>()
    private var calcList = ArrayList<String>()
    private var sumList = ArrayList<Int>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val resultText =binding.textViewResult

        binding.button1.setOnClickListener {
            numList.add("1")
            calcList.add("1")
            resultText.setText(numList.joinToString (""))
        }

        binding.button2.setOnClickListener {
            numList.add("2")
            calcList.add("2")
            resultText.setText(numList.joinToString (""))
        }

        binding.button3.setOnClickListener {
            numList.add("3")
            calcList.add("3")
            resultText.setText(numList.joinToString (""))
        }

        binding.button4.setOnClickListener {
            numList.add("4")
            calcList.add("4")
            resultText.setText(numList.joinToString (""))
        }

        binding.button5.setOnClickListener {
            numList.add("5")
            calcList.add("5")
            resultText.setText(numList.joinToString (""))
        }

        binding.button6.setOnClickListener {
            numList.add("6")
            calcList.add("6")
            resultText.setText(numList.joinToString (""))
        }

        binding.button7.setOnClickListener {
            numList.add("7")
            calcList.add("7")
            resultText.setText(numList.joinToString (""))
        }

        binding.button8.setOnClickListener {
            numList.add("8")
            calcList.add("8")
            resultText.setText(numList.joinToString (""))
        }

        binding.button9.setOnClickListener {
            numList.add("9")
            calcList.add("9")
            resultText.setText(numList.joinToString (""))
        }

        binding.button0.setOnClickListener {
            numList.add("0")
            calcList.add("0")
            resultText.setText(numList.joinToString (""))
        }

        binding.buttonAdd.setOnClickListener {
            numList.add("+")
            val transferNum = calcList.joinToString("").toInt()
            calcList.clear()
            sumList.add(transferNum)
            //println("sumlist = $sumList")
            //println("transfernum = $transferNum")
            resultText.setText(numList.joinToString (""))
        }

        binding.buttonResult.setOnClickListener {

            var result = 0
            val transferNum = calcList.joinToString("").toInt()
            calcList.clear()
            sumList.add(transferNum)

            val listSize = sumList.size

            for (i in 0 until listSize) {
                result += sumList[i]
            }

            //println("RESULT = $result")

            numList.add("= $result")
            resultText.setText(numList.joinToString (""))
            numList.clear()
            calcList.clear()
            sumList.clear()
        }

        binding.buttonAC.setOnClickListener {
            numList.clear()
            calcList.clear()
            sumList.clear()
            resultText.setText(numList.joinToString (""))
        }

    }

}