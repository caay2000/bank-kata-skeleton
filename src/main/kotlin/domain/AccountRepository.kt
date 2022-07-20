package domain

interface AccountRepository {

    fun createOrUpdateAccount(accountNumber:String, newTransaction:Transaction): Unit
    fun retrieveAccount(accountNumber: String): Account
    fun retrieveAccountBalance(accountNumber: String): Int

}