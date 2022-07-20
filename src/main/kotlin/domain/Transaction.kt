package domain

import java.time.LocalDateTime

// Will this class remain the same?

data class Transaction(
    val accountNumber: String,
    val amount: Int,
    val date: LocalDateTime
)