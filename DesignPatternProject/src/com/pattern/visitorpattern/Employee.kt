package com.pattern.visitorpattern

abstract class Employee {
    var name: String? = null
    var salary: Int = 0
    var sex: Int = 0

    companion object {
        val MALE = 0//男
        val FEMALE = 1//女
    }

    abstract fun accept(visitor: IVisitor)
}
