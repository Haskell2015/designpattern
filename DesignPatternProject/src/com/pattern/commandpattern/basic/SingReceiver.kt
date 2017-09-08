package com.pattern.commandpattern.basic

class SingReceiver : AbsReceiver() {
    override fun doCom() {
        println("第一个接受者做任务去了")
    }
}