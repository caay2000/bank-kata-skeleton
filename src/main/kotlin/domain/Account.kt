package domain

data class Account(
    val accountNumber: String,
    val currentBalance: Int,
    val transactions: List<Transaction>
)