package com.pattern.iteratorpattern;

import java.util.ArrayList;
import java.util.List;

import org.jetbrains.annotations.NotNull;

public class Project implements IProject {

    private List<IProject> mList = new ArrayList<>();
    private String mName;
    private int num;
    private int cost;

    public Project() {
    }

    public Project(String mName, int num, int cost) {
        this.mName = mName;
        this.num = num;
        this.cost = cost;
    }

    @Override
    public void addProject(@NotNull String name, int num, int cost) {
        this.mList.add(new Project(name, num, cost));
    }

    @NotNull
    @Override
    public String getInfos() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("项目名称：" + this.mName + "\t");
        stringBuilder.append("项目人数：" + this.num + "\t");
        stringBuilder.append("项目资金：" + this.cost + "\t");
        return stringBuilder.toString();
    }

    @NotNull
    @Override
    public IProjectIterator iterator() {
        return new ProjectIterator(this.mList);
    }
}
