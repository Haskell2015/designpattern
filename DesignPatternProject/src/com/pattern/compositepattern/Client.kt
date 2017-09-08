package com.pattern.compositepattern

fun main(args: Array<String>) {
    val boss = Branch("A", "总经理", 100)

    val manager1 = Branch("M1", "经理1", 90)
    val manager2 = Branch("M2", "经理2", 90)
    val manager3 = Branch("M3", "经理3", 90)

    val stuffIOS = Leaf("B", "IOS", 80)
    val stuffAndroid = Leaf("C", "Android", 70)
    val stuffH5 = Leaf("D", "H5", 60)

    val stuffIOS1 = Leaf("E", "Web", 80)
    val stuffAndroid1 = Leaf("F", "Node.js", 70)
    val stuffH51 = Leaf("G", "C#", 60)

    val stuffIOS2 = Leaf("H", "C++", 80)
    val stuffAndroid2 = Leaf("I", "PHP", 70)
    val stuffH52 = Leaf("J", "Swift", 60)

    boss.addSubordinate(manager1)
    boss.addSubordinate(manager2)
    boss.addSubordinate(manager3)

    manager1.addSubordinate(stuffAndroid)
    manager1.addSubordinate(stuffAndroid1)
    manager1.addSubordinate(stuffAndroid2)

    manager2.addSubordinate(stuffH5)
    manager2.addSubordinate(stuffH51)
    manager2.addSubordinate(stuffH52)

    manager3.addSubordinate(stuffIOS)
    manager3.addSubordinate(stuffIOS1)
    manager3.addSubordinate(stuffIOS2)

    getAllInfo(boss)
    println("~~~~~~~~~~~~~~~~~~~")
//    getAll(boss)
}
fun getAll(root: Branch) {
    val list = root.getSubordinate()
    for (item in list) {
        //三元表达式
        (item as? Leaf)?.getInfo() ?: if (item is Branch) {
            println("..............")
            getAll(item)
        }
    }
}
fun getAllInfo(branch: Branch) {
    val list=branch.getSubordinate()
//    for (item in list){
//        if(item is Leaf){
//            item.getInfo()
//        }else if(item is Branch){
//            println("..............")
//            getAllInfo(item)
//        }
//    }
    list.forEach { item->
        if(item is Leaf){
            branch.getInfo()
        }else if(item is Branch){
            println("..............")
            getAllInfo(item)
        }
    }
}