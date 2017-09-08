package com.pattern.visitorpattern

class Visitor : IVisitor {
    override fun visite(manager: Manager) {
        managerReoprt(manager)
    }

    override fun visite(commonEmployee: CommonEmployee) {
        commonEmployeeReoprt(commonEmployee)
    }

    private fun getBasic(employee: Employee) {
        println(employee.sex)
        println(employee.name)
        println(employee.salary)
    }

    private fun managerReoprt(manager: Manager) {
        getBasic(manager)
        println(manager.performance)
    }

    private fun commonEmployeeReoprt(commonEmployee: CommonEmployee) {
        getBasic(commonEmployee)
        println(commonEmployee.job)
    }
}