package com.pattern.iteratorpattern;

public class MainTest {
    public static void main(String[] args) {
        IProject iProject=new Project();
        iProject.addProject("项目1",10,10000);
        iProject.addProject("项目2",15,20000);
        iProject.addProject("项目3",20,30000);

        IProjectIterator iterator=iProject.iterator();
        while (iterator.hasNext()) {
            IProject project= (IProject) iterator.next();
            System.out.println(project.getInfos());
        }
    }
}
