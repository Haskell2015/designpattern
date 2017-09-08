package com.pattern.visitorpattern

class CommonEmployee : Employee() {
     var job: String? = ""
    override fun accept(visitor: IVisitor) {
        visitor.visite(this)
    }
}