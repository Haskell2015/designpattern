package com.pattern.commandpattern

class AddCodeCommand : Command() {
    override fun excute() {
        super.cg.find()
        super.cg.add()
        super.cg.plan()
    }
}
