package com.pattern.decoratepattern;

public abstract class AbsDecorateSchoolReport extends AbsSchoolReport {
    private AbsSchoolReport absSchoolReport;

    public AbsDecorateSchoolReport(AbsSchoolReport absSchoolReport) {
        this.absSchoolReport = absSchoolReport;
    }

    @Override
    void report() {
        this.absSchoolReport.report();
    }

    @Override
    void sign(String name) {
        this.absSchoolReport.sign(name);
    }
}
