package infra.database

import domain.Transaction
import domain.TransactionRepository

class TransactionRepositoryInMemory : TransactionRepository {

    private val database: MutableMap<String, MutableList<Transaction>> = mutableMapOf()

    override fun saveTransaction(transaction: Transaction) {
        // store the transaction the the correct accoun number database
        TODO("Not yet implemented")
    }

    override fun retrieveAllTransactions(accountNumber: String): List<Transaction> {
        // retrieve all the transaction of the given account number
        TODO("Not yet implemented")
    }
}