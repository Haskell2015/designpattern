package com.pattern.commandpattern.basic

abstract class AbsCommand(private val receiver: AbsReceiver) {
    abstract fun excute()
}