package application

import java.time.LocalDate
import domain.Transaction
import domain.TransactionRepository
import infra.database.TransactionRepositoryInMemory

class AccountServiceImpl(private val transactionRepository: TransactionRepositoryInMemory) : AccountService {

    override fun deposit(accountNumber: String, amount: Int) {
        processTransaction(accountNumber, amount)
    }

    override fun withdraw(accountNumber: String, amount: Int) {
        // It should create a transaction and call the repository to store it
        processTransaction(accountNumber, amount * -1)
    }

    private fun processTransaction(accountNumber: String, amount: Int){
        val balance = retrieveAccountBalance(accountNumber)
        var transaction = Transaction(accountNumber, amount, balance + amount, LocalDate.now())
        transactionRepository.saveTransaction(transaction)
    }

    override fun retrieveStatement(accountNumber: String): List<Transaction> {
        // It should retrieve all the transactions of the accountNumber and return them
        return transactionRepository.retrieveAllTransactions(accountNumber)
    }

    fun retrieveAccountBalance(accountNumber: String): Int{
        return transactionRepository.retrieveAccountBalance(accountNumber)
    }
}