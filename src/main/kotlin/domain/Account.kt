package domain

data class Account(
    val accountNumber: String,
    val transactions: MutableList<Transaction>
){
    // To add logic, if needed
    var balance: Int = 0


}