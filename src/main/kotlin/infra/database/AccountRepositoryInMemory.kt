package infra.database

import domain.AccountRepository
import domain.Transaction
import domain.Account


class AccountRepositoryInMemory : AccountRepository {

    private val database: MutableMap<String, Account> = mutableMapOf()


    override fun createOrUpdateAccount(accountNumber:String, newTransaction:Transaction) {

        if(database.containsKey(accountNumber)){
            updateAccount(accountNumber, newTransaction)

        }else{
            createAccount(accountNumber, newTransaction)
        }
    }

    private fun createAccount(accountNumber: String, newTransaction: Transaction) {
        val account = Account(accountNumber, mutableListOf(newTransaction))
        account.balance += newTransaction.amount
        database.putIfAbsent(accountNumber, account)
    }

    private fun updateAccount(accountNumber: String, newTransaction: Transaction) {
        database[accountNumber]!!.transactions.add(newTransaction)
        database[accountNumber]!!.balance += newTransaction.amount
    }

    override fun retrieveAccount(accountNumber: String): Account {
        return database.getOrDefault(accountNumber, Account("", mutableListOf()))
    }


    override fun retrieveAccountBalance(accountNumber: String): Int{
        return retrieveAccount(accountNumber).balance
    }
}