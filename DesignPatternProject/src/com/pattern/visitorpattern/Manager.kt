package com.pattern.visitorpattern

class Manager : Employee() {
    var performance: String = ""
    override fun accept(visitor: IVisitor) {
        visitor.visite(this)
    }
}