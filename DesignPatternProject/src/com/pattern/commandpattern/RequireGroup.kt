package com.pattern.commandpattern

class RequireGroup : Group {
    override fun find() {
        println("找到需求组")
    }

    override fun add() {
        println("客户要加新需求")
    }

    override fun delete() {
        println("客户要删除需求")
    }

    override fun change() {
        println("客户要修改需求")
    }

    override fun plan() {
        println("客户要求变更需求计划")
    }
}