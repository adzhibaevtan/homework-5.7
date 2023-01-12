package com.test.homework

class Math {

    fun add(a: String, b: String): String {
        var result = ""
        if (a.isNumeric() && b.isNumeric()) {
            result = (a.toDouble() + b.toDouble()).toString()
        } else if (a.isEmpty() || b.isEmpty()) {
            result = "Вы не заполнили поля"
        } else {
            result = "Вы ввели буквы"
        }
        return result
    }

    fun divide(a: String, b: String): String {
        var result = ""
        if (!a.isNumeric() && !b.isNumeric()) {
            result = "Вы ввели буквы"
        } else if (a.isEmpty() || b.isEmpty()) {
            result = "Вы не заполнили поля"
        } else if (a.contains(" ") || b.contains(" ") ) {
            result = "Вы поставили пробел"
        } else if (a == "0.0" || b == "0.0") {
            result = "На ноль делить нельзя"
        } else {
            result = (a.toDouble() / b.toDouble()).toString()

        }
        return result
    }

    fun String.isNumeric(): Boolean {
        val regex = "-?[0-9]+(\\.[0-9]+)?".toRegex()
        return this.matches(regex)

    }
}
