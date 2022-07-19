package infra.database

import domain.Transaction
import domain.TransactionRepository

class TransactionRepositoryInMemory : TransactionRepository {

    private val database: MutableMap<String, MutableList<Transaction>> = mutableMapOf()

    override fun saveTransaction(transaction: Transaction) {
        // store the transaction the correct account number database

        val transactions = database.getOrDefault(transaction.accountNumber, mutableListOf())
        transactions.add(transaction)
        database[transaction.accountNumber] = transactions
    }

    override fun retrieveAllTransactions(accountNumber: String): List<Transaction> {
        // retrieve all the transaction of the given account number

        return database.getOrDefault(accountNumber, listOf())
    }
}