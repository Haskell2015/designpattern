package com.pattern.commandpattern

abstract class Command {
    val rg=RequireGroup()
    val pg=PageGroup()
    val cg=CodeGroup()

    abstract fun excute()
}