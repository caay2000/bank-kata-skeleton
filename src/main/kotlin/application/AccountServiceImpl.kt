package application

import domain.Transaction
import domain.TransactionRepository

class AccountServiceImpl(private val transactionRepository: TransactionRepository) : AccountService {

    override fun deposit(accountNumber: String, amount: Int) {
        // It should create a transaction and call the repository to store it
        TODO("Not yet implemented")
    }

    override fun withdraw(accountNumber: String, amount: Int) {
        // It should create a transaction and call the repository to store it
        TODO("Not yet implemented")
    }

    override fun retrieveStatement(accountNumber: String): List<Transaction> {
        // It should retrieve all the transactions of the accountNumber and return them
        TODO("Not yet implemented")
    }
}