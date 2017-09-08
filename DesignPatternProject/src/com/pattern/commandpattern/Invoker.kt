package com.pattern.commandpattern

class Invoker {
    private var command: Command? = null
    fun setCommand(command: Command) {
        this.command = command
    }

    fun action() {
        this.command?.excute()
    }
}