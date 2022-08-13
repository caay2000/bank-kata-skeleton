package domain

import java.time.LocalDate

data class Transaction(
    val accountNumber: String,
    val amount: Int,
    val balance: Int,
    val date: LocalDate
){

    // To add logic, if needed

}