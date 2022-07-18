package application

import domain.Transaction

interface AccountService {

    fun deposit(accountNumber: String, amount: Int): Unit
    fun withdraw(accountNumber: String, amount: Int): Unit
    fun retrieveStatement(accountNumber: String) : List<Transaction>

}