package domain

import java.time.LocalDate
import java.time.LocalTime

data class Transaction(
    val accountNumber: String,
    val amount: Int,
    val balance: Int,
    val date: LocalDate
){  // LAS COMAS SON NECESARIAS?

    // To add logic, if needed

}