package application

import domain.Transaction
import domain.TransactionRepository
import java.time.LocalDateTime
import kotlin.math.abs

class AccountServiceImpl(private val transactionRepository: TransactionRepository) : AccountService {

    override fun deposit(accountNumber: String, amount: Int) {
        // It should create a transaction and call the repository to store it

        val transaction = Transaction(accountNumber, abs(amount), LocalDateTime.now())
        transactionRepository.saveTransaction(transaction)
    }

    override fun withdraw(accountNumber: String, amount: Int) {
        // It should create a transaction and call the repository to store it

        val transaction = Transaction(accountNumber, -abs(amount), LocalDateTime.now())
        transactionRepository.saveTransaction(transaction)
    }

    override fun retrieveStatement(accountNumber: String): List<Transaction> {
        // It should retrieve all the transactions of the accountNumber and return them
        return transactionRepository.retrieveAllTransactions(accountNumber)
    }
}