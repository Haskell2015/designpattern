package com.pattern.commandpattern

class CodeGroup:Group {
    override fun find() {
        println("找到代码组")
    }

    override fun add() {
        println("客户要加新功能")
    }

    override fun delete() {
        println("客户要删除功能")
    }

    override fun change() {
        println("客户要修改功能")
    }

    override fun plan() {
        println("提交变更代码计划")
    }
}