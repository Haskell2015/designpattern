package com.pattern.commandpattern

fun main(args:Array<String>){
    val invoker=Invoker()
    invoker.setCommand(AddCodeCommand())
    invoker.action()
}