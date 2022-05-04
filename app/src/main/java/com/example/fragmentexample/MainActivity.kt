package com.example.fragmentexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var fragBookDescription: BookDescription
    lateinit var fragBookTitle: BookTitle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fragBookTitle = BookTitle()
        fragBookDescription = BookDescription()
        val fragTransaction = supportFragmentManager.beginTransaction()
        fragTransaction.add(R.id.fragtop, fragBookTitle)
        fragTransaction.add(R.id.fragbottom, fragBookDescription)
        fragTransaction.commit()
    }

    override fun onBookChanged(index:Int) {
        fragBookDescription.changeDescription(index)
    }
}