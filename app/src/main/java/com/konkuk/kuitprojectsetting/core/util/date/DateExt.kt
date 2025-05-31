package com.konkuk.kuitprojectsetting.core.util.date

import java.text.SimpleDateFormat
import java.util.*

fun String.toFormattedDate(
    inputPattern: String = "yyyy-MM-dd",
    outputPattern: String = "yyyy년 MM월 dd일"
): String {
    return try {
        val inputFormat = SimpleDateFormat(inputPattern, Locale.KOREA)
        val date = inputFormat.parse(this)
        val outputFormat = SimpleDateFormat(outputPattern, Locale.KOREA)
        outputFormat.format(date!!)
    } catch (e: Exception) {
        this
    }
}
