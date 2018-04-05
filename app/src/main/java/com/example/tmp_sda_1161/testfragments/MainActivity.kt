package com.example.tmp_sda_1161.testfragments

import android.app.Fragment
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState != null){
            supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.container,WelcomeFragment())
                    .commit()
        }


    }
}
