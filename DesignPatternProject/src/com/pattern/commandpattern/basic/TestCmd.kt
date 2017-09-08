package com.pattern.commandpattern.basic

import com.pattern.commandpattern.Command

class TestCmd(private val singReceiver: SingReceiver) : Command() {

    override fun excute() {
        singReceiver
    }
}
