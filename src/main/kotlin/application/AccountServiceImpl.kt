package application

import domain.Account
import java.time.LocalDate
import domain.Transaction
import domain.AccountRepository
import kotlin.math.abs

class AccountServiceImpl(private val accountRepository: AccountRepository) : AccountService {

    override fun deposit(accountNumber: String, amount: Int) {
        processTransaction(accountNumber, abs(amount))
    }

    override fun withdraw(accountNumber: String, amount: Int) {
        // It should create a transaction and call the repository to store it
        processTransaction(accountNumber, -abs(amount))
    }

    private fun processTransaction(accountNumber: String, amount: Int){
        val balance = retrieveAccountBalance(accountNumber)
        val transaction = Transaction(accountNumber, amount, balance + amount, LocalDate.now())
        accountRepository.createOrUpdateAccount(accountNumber, transaction)
    }

    override fun retrieveAccount(accountNumber: String): Account =
        // It should retrieve all the transactions of the accountNumber and return them
         accountRepository.retrieveAccount(accountNumber)


    fun retrieveAccountBalance(accountNumber: String): Int{
        return accountRepository.retrieveAccountBalance(accountNumber)
    }
}