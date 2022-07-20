package application

import domain.Transaction
import domain.Account

interface AccountService {

    fun deposit(accountNumber: String, amount: Int): Unit
    fun withdraw(accountNumber: String, amount: Int): Unit
    fun retrieveAccount(accountNumber: String) : Account


}