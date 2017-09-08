package com.pattern.iteratorpattern

interface IProject {
    fun addProject(name:String, num:Int,cost:Int)
    fun getInfos():String
    fun iterator():IProjectIterator
}