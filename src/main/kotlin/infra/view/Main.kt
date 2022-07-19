package infra.view

import application.AccountServiceImpl
import infra.database.TransactionRepositoryInMemory

fun main(args: Array<String>) {

    // Main class
    // It should create an accountService, do all the operations needed, and print the statement on console
    // Note that the accountService needs a transactionRepository implementation, so it should also be created here!

    val transactionRepository = TransactionRepositoryInMemory()
    val accountService = AccountServiceImpl(transactionRepository)

    val accountNumber = "Dani"

    accountService.deposit(accountNumber, 1000)
    accountService.withdraw(accountNumber, 100)
    accountService.deposit(accountNumber, 400)

    val transactions = accountService.retrieveStatement(accountNumber)

    println("STATEMENT FOR ACCOUNT $accountNumber")
    var total = 0
    for (transaction in transactions) {
        total += transaction.amount
        println("${transaction.date} | ${transaction.amount} | $total")
    }

}
