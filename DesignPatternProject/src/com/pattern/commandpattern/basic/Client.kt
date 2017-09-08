package com.pattern.commandpattern.basic

fun main(args:Array<String>){
    val involker=Invoker()
    val singCmd= SingCommand()
    involker.setCommand(singCmd)
    involker.action()
}