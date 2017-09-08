package com.pattern.commandpattern

class PageCommand:Command() {
    override fun excute() {
        super.pg.find()
        super.pg.add()
        super.pg.plan()
    }
}