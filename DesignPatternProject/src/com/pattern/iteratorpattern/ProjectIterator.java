package com.pattern.iteratorpattern;

import java.util.ArrayList;
import java.util.List;

public class ProjectIterator implements IProjectIterator {
    private List<IProject> mList = new ArrayList<>();
    private int mCurrentNum = 0;

    public ProjectIterator(List<IProject> mList) {
        this.mList = mList;
    }

    @Override
    public boolean hasNext() {
        boolean b = true;
        if (this.mCurrentNum >= mList.size() || null == this.mList.get(this.mCurrentNum)) {
            b = false;
        }
        return b;
    }

    @Override
    public IProject next() {
        return this.mList.get(this.mCurrentNum++);
    }

    @Override
    public void del(int i) {
        this.mList.remove(i);
    }
}
