package com.pattern.compositepattern

abstract class ICrop(private var name: String, private var position: String, private var salary: Int) {
    fun getInfo():String{
        val info = StringBuilder()
        info.append("姓名：" + this.name)
        info.append("职位：" + this.position)
        info.append("薪水：" + this.salary)
        return info.toString()
    }
}