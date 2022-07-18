package domain

import java.util.Date

data class Transaction(
    val accountNumber: String,
    val amount: Int,
    val date: Date
){

    // To add logic, if needed

}