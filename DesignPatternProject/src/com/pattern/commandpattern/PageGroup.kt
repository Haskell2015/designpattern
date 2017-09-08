package com.pattern.commandpattern

class PageGroup:Group {
    override fun find() {
        println("找到美工组")
    }

    override fun add() {
        println("客户要加新页面")
    }

    override fun delete() {
        println("客户要删除页面")
    }

    override fun change() {
        println("客户要修改页面")
    }

    override fun plan() {
        println("客户要求变更页面计划")
    }
}