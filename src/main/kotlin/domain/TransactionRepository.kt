package domain

interface TransactionRepository {

    // What should we do with this repository ?

    fun saveTransaction(transaction: Transaction): Unit
    fun retrieveAllTransactions(accountNumber: String): List<Transaction>

}