package com.pattern.commandpattern.basic

class Invoker {
    var cmd:AbsCommand?=null
    fun setCommand(cmd: AbsCommand){
        this.cmd=cmd
    }
    fun action(){
        cmd?.excute()
    }
}