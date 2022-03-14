package com.example.uidemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import kotlinx.android.synthetic.main.activity_main.*
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Better understanding with the help of Java Code for the listener implementation in Kotlin
        /*  spanish.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                Toast.makeText(getApplicationContext(),"You have chosen Spanish", Toast.LENGTH_LONG).show();

            }
        });*/
var ansA = false;
var ansB = false;
var ansC = false;
        var res = 0

        // Listener implementation for the check boxes Spanish and English
        b.setOnCheckedChangeListener { buttoiew, isChecked ->
            ansA = isChecked
        };

        a.setOnCheckedChangeListener { buttonView, isChecked ->
            ansB = isChecked
        };


        c.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                ansC = isChecked

            }
        };

        submit.setOnClickListener(){
            if(!ansA && !ansB && ansC) {
                res += 50
            }

            val d = Date()

            Toast.makeText(
                applicationContext,
                "Congratulations! You submitted on $d\n" +
                        "${d.time}, Your achieved $res%",
                Toast.LENGTH_LONG
            ).show()
            res = 0
        }


        // Listener to handle RadioGroup buttons status
        rg.setOnCheckedChangeListener { group, checkedId ->
            // Get which radio button is clicked
            val clicked = rg.findViewById(checkedId) as RadioButton
            val checked = clicked.isChecked
            if (checked)
                if(clicked.text.toString() == "val")
                    res +=50
        }
        // Listener to handle the status of Switch button UI

    }
}

