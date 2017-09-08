package com.pattern.decoratepattern;

public class MainTest {
    public static void main(String[] args) {
        AbsSchoolReport report=new OriginalReport();
        report=new SortDecorator(report);
        report=new HighScoreDecorator(report);

        report.report();

        report.sign("小A");
    }
}
