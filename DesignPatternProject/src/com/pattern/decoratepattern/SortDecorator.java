package com.pattern.decoratepattern;

public class SortDecorator extends AbsDecorateSchoolReport {
    public SortDecorator(AbsSchoolReport absSchoolReport) {
        super(absSchoolReport);
    }
    private void reportSort(){
        System.out.println("排名是第12名");
    }
    @Override
    void report() {
        super.report();
        this.reportSort();//看完成绩单之后再汇报排名
    }
}
