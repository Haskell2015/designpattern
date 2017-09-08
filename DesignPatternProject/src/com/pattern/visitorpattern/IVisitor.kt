package com.pattern.visitorpattern

interface IVisitor {
    fun visite(commonEmployee: CommonEmployee)
    fun visite(manager: Manager)
}