package com.pattern.commandpattern.basic

class SingCommand(private val singReceiver: SingReceiver = SingReceiver()) : AbsCommand(singReceiver) {
    override fun excute() {
        singReceiver.doCom()
    }

}
