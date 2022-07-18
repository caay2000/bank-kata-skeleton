package domain

interface TransactionRepository {

    fun saveTransaction(transaction: Transaction): Unit
    fun retrieveAllTransactions(accountNumber: String): List<Transaction>

}