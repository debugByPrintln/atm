package com.example.atm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.atm.data.BankAccount
import com.example.atm.data.Constants
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rub_btn_main.setOnClickListener {
            val intent = Intent(this, CashOutActivity::class.java)
            intent.putExtra(Constants.CURRENCY, "rubbles")
            startActivity(intent)
        }

        dollar_btn_main.setOnClickListener {
            val intent = Intent(this, CashOutActivity::class.java)
            intent.putExtra(Constants.CURRENCY, "dollars")
            startActivity(intent)
        }

        euro_btn_main.setOnClickListener {
            val intent = Intent(this, CashOutActivity::class.java)
            intent.putExtra(Constants.CURRENCY, "euros")
            startActivity(intent)
        }

        wtf_btn_main.setOnClickListener {
            val intent = Intent(this, CashOutActivity::class.java)
            intent.putExtra(Constants.CURRENCY, "wtfs")
            startActivity(intent)
        }
    }
}