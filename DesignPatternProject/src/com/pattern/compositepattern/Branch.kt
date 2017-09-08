package com.pattern.compositepattern


class Branch(name: String, position: String, salary: Int) : ICrop(name, position, salary) {
    private var corpList: ArrayList<ICrop> = ArrayList()

     fun addSubordinate(crop: ICrop) {
        this.corpList.add(crop)
    }

     fun getSubordinate(): List<ICrop> {
        this.corpList.forEach { crop ->
            println(crop.getInfo())
        }
        return this.corpList
    }
}