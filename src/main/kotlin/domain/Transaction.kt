package domain

import java.time.LocalDateTime

data class Transaction(
    val accountNumber: String,
    val amount: Int,
    val date: LocalDateTime
){

    // To add logic, if needed

}