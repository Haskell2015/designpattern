package com.pattern.visitorpattern


fun main(args: Array<String>) {
    val list = ArrayList<Employee>()
    val visitor = Visitor()
    val stuffA = CommonEmployee()
    stuffA.sex = Employee.Companion.MALE
    stuffA.job = "IOS开发"
    stuffA.name = "ISOer"
    stuffA.salary = 5000

    list.add(stuffA)

    val stuffB = CommonEmployee()
    stuffB.sex = Employee.Companion.FEMALE
    stuffB.job = "UI"
    stuffB.name = "UIer"
    stuffB.salary = 4000

    list.add(stuffB)

    val manager = Manager()
    manager.sex = Employee.Companion.MALE
    manager.performance = "绩效还行"
    manager.name = "管理员"
    manager.salary = 8000

    list.add(manager)


    list.forEach { item ->
        item.accept(visitor)
    }
//    println("~~~~~")
//    for (item in list){
//        item.accept(visitor)
//    }
}
