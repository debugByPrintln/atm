package com.example.atm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.atm.data.BankAccount
import com.example.atm.data.Constants
import kotlinx.android.synthetic.main.activity_cash_out.*
import kotlinx.android.synthetic.main.activity_main.*

class CashOutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cash_out)

        val currency = intent.getStringExtra(Constants.CURRENCY)

        if (currency == "rubbles"){
            balance_cash_out.text = "Рублевый баланс: " + BankAccount.rubBalance.toString()

            btn_cash_out.setOnClickListener {
                val howMuch = Integer.parseInt(input.text.toString())

                val listOfBanknotes = BankAccount.getRubbles(howMuch)

                if (listOfBanknotes[listOfBanknotes.size-1] == -1){
                    banknotes.text = "Нельзя выдать такую сумму"
                }
                else{
                    balance_cash_out.text = "Рублевый баланс: " + BankAccount.rubBalance.toString()

                    banknotes.text = "Список банкнот: $listOfBanknotes"
                }
            }
        }

        else if (currency == "dollars"){
            balance_cash_out.text = "Долларовый баланс: " + BankAccount.dollarBalance.toString()

            btn_cash_out.setOnClickListener {
                val howMuch = Integer.parseInt(input.text.toString())

                val listOfBanknotes = BankAccount.getDollars(howMuch)

                if (listOfBanknotes[listOfBanknotes.size-1] == -1){
                    banknotes.text = "Нельзя выдать такую сумму"
                }
                else{
                    balance_cash_out.text = "Долларовый баланс: " + BankAccount.dollarBalance.toString()

                    banknotes.text = "Список банкнот: $listOfBanknotes"
                }
            }
        }

        else if (currency == "euros"){
            balance_cash_out.text = "Евро баланс: " + BankAccount.euroBalance.toString()

            btn_cash_out.setOnClickListener {
                val howMuch = Integer.parseInt(input.text.toString())

                val listOfBanknotes = BankAccount.getEuros(howMuch)

                if (listOfBanknotes[listOfBanknotes.size - 1] == -1) {
                    banknotes.text = "Нельзя выдать такую сумму"
                } else {
                    balance_cash_out.text = "Евро баланс: " + BankAccount.euroBalance.toString()

                    banknotes.text = "Список банкнот: $listOfBanknotes"
                }
            }
        }

        else if (currency == "wtfs"){
            balance_cash_out.text = "Втф баланс: " + BankAccount.wtfBalance.toString()

            btn_cash_out.setOnClickListener {
                val howMuch = Integer.parseInt(input.text.toString())

                val listOfBanknotes = BankAccount.getWtf(howMuch)

                if (listOfBanknotes[listOfBanknotes.size - 1] == -1) {
                    banknotes.text = "Нельзя выдать такую сумму"
                } else {
                    balance_cash_out.text = "Втф баланс" + BankAccount.wtfBalance.toString()

                    banknotes.text = "Список банкнот: $listOfBanknotes"
                }
            }
        }
    }
}